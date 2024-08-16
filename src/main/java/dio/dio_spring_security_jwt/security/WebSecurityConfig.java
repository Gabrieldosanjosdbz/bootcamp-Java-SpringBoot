package dio.dio_spring_security_jwt.security;

import jakarta.servlet.Servlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) // Habilita o uso de @PreAuthorize e @PostAuthorize
public class WebSecurityConfig {

    // Bean para codificar senhas usando BCrypt
    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    // URLs que são liberadas de autenticação para o Swagger e H2-Console
    private static final String[] SWAGGER_WHITELIST = {
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**"
    };

    // Configura a segurança da aplicação
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.headers(frameOption -> frameOption.disable()) // Desabilita o frame options (necessário para o H2-Console)
                .cors(cors -> cors.disable()) // Desabilita o CORS (para simplificar)
                .addFilterAfter(new JWTFilter(), UsernamePasswordAuthenticationFilter.class) // Adiciona o filtro JWT após a autenticação
                .authorizeHttpRequests(athz -> athz
                        .requestMatchers(SWAGGER_WHITELIST).permitAll() // Permite acesso às URLs do Swagger sem autenticação
                        .requestMatchers("/h2-console/**").permitAll() // Permite acesso ao H2-Console sem autenticação
                        .requestMatchers(HttpMethod.POST, "/login").permitAll() // Permite acesso ao login sem autenticação
                        .requestMatchers(HttpMethod.POST, "/users").permitAll() // Permite criação de novos usuários sem autenticação
                        .requestMatchers(HttpMethod.GET, "/users").hasAnyRole("USERS", "MANAGERS") // Requer role USERS ou MANAGERS para acesso aos usuários
                        .requestMatchers("/managers").hasAnyRole("MANAGERS") // Requer role MANAGERS para acessar "/managers"
                        .anyRequest().authenticated() // Requer autenticação para qualquer outra requisição
                )
                .csrf(c -> c.disable()) //serve para desabilitar a autenticação para as rotas que tem permitAll.
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); // Define a política de criação de sessões como Stateless (sem estado)
        return http.build(); // Constrói e retorna a configuração de segurança
    }
}