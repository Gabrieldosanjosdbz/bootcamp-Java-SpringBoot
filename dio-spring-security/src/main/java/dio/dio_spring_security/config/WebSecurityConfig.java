package dio.dio_spring_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

// Esta classe é uma configuração de segurança para a aplicação Spring Boot
@Configuration
// Habilitando a segurança web de forma manual, ou seja, sem usar configurações padrão
@EnableWebSecurity
// Habilitando a segurança em métodos específicos da aplicação.
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {
    //buscar informações de autenticação de usuários
    @Autowired
    private SecurityDatabaseService securityDatabaseService;

    //estrategia global de verificação de usuarios, injetando meu @service como estrategia
    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityDatabaseService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    // Este método configura a autenticação e define os usuários que ficam armazenados em MEMÓRIA
    /*@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        // Criação do primeiro usuário na memória com o nome de usuário "user" e a senha "user123"
        UserDetails user = User.withDefaultPasswordEncoder() // Criptografa a senha usando um codificador simples (não recomendado para produção)
                .username("user") // Define o nome de usuário
                .password("user123") // Define a senha
                .roles("USERS") // Atribui a role (papel) "USERS" ao usuário
                .build(); // Constrói o objeto UserDetails

        // Criação do segundo usuário na memória com o nome de usuário "admin" e a senha "master123"
        UserDetails user2 = User.withDefaultPasswordEncoder() // Usando o mesmo codificador simples para a senha
                .username("admin") // Define o nome de usuário
                .password("master123") // Define a senha
                .roles("MANAGERS") // Atribui a role "MANAGERS" ao usuário
                .build(); // Constrói o objeto UserDetails

        // Retorna um gerenciador de usuários em memória que contém os usuários criados acima
        return new InMemoryUserDetailsManager(user, user2);
    } */

    // Este método você já define diretamente no codigo QUEM acessa as rotas sem precisar ir no controller utilizar @PreAuthorize()
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic(Customizer.withDefaults())
            .authorizeHttpRequests((auth) -> auth   //requestMatchers são as rotas, e hasAnyRole são os users que poderão acessa-lo
                    .requestMatchers("/").permitAll()
                    .requestMatchers("/managers").hasAnyRole("MANAGERS")
                    .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
                    .anyRequest().authenticated()
            );//.formLogin(Customizer.withDefaults()) Habilita a página de login;
        return http.build();
    }

}
