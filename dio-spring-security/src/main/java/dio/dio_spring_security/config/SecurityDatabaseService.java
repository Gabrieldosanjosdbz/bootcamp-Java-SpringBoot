package dio.dio_spring_security.config;

import dio.dio_spring_security.model.User;  // Importa a classe User do seu projeto
import dio.dio_spring_security.repository.UserRepository;  // Importa o repositório de usuários
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Esta classe implementa o serviço de autenticação baseado em banco de dados.
 * Ela utiliza o repositório de usuários para buscar o usuário e fornecer os
 * detalhes necessários para o Spring Security realizar a autenticação.
 */
@Service  // Indica que esta classe é um serviço gerenciado pelo Spring. Um modo de utilizar o Repository com logica
public class SecurityDatabaseService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;  // Injeção do repositório de usuários para acesso ao banco de dados

    /**
     * Método responsável por carregar os detalhes do usuário com base no nome de usuário (username).
     * É chamado automaticamente pelo Spring Security durante o processo de autenticação.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Busca o usuário no banco de dados pelo nome de usuário
        User userEntity = userRepository.findByUsername(username);

        // Se o usuário não for encontrado, lança uma exceção
        if (userEntity == null) {
            throw new UsernameNotFoundException("Usuário não encontrado: " + username);
        }

        // Cria uma coleção de autoridades (roles) para o usuário
        Set<GrantedAuthority> authorities = new HashSet<>();

        // Para cada role associada ao usuário, cria uma autoridade e a adiciona à coleção
        userEntity.getRoles().forEach(role -> {  //  SimpleGrantedAuthority é uma interface do Spring Security que representa uma permissão concedida a um objeto 'Authentication'.
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));  // Prefixo "ROLE_" é um padrão do Spring
        });

        // Cria um objeto UserDetails com o nome de usuário, senha e as autoridades
        UserDetails user = new org.springframework.security.core.userdetails.User(
                userEntity.getUsername(),    // Nome de usuário
                userEntity.getPassword(),    // Senha
                authorities);                // Lista de roles com autorização de autenticação

        // Retorna o objeto UserDetails que será usado pelo Spring Security
        return user;
    }
}
