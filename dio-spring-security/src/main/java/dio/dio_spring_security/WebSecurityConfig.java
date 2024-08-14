package dio.dio_spring_security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

// Esta classe é uma configuração de segurança para a aplicação Spring Boot
@Configuration
// Habilitando a segurança web de forma manual, ou seja, sem usar configurações padrão
@EnableWebSecurity
// Habilitando a segurança em métodos específicos da aplicação.
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class WebSecurityConfig {

    // Este método configura a autenticação e define os usuários que ficam armazenados em memória
    @Bean
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
    }

    // 2(mais utilizado e mais recomendado) - Este método você já define diretamente no codigo quem acessa as rotas
    // sem precisar ir no controller utilizar @PreAuthorize()
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.formLogin(Customizer.withDefaults())// Habilita a página de login
            .authorizeHttpRequests((auth) -> auth   //requestMatchers são as rotas, e hasAnyRole são os users que poderão acessa-lo
                    .requestMatchers("/").permitAll()
                    .requestMatchers("/managers").hasAnyRole("MANAGERS")
                    .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
                    .anyRequest().authenticated()
            );

        return http.build();
    }

}
