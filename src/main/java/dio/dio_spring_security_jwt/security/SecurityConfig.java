package dio.dio_spring_security_jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration // Define que essa classe é uma configuração do Spring
@ConfigurationProperties(prefix = "security.config") // Define que essa classe irá pegar propriedades do arquivo de configuração com o prefixo "security.config"
public class SecurityConfig {
    public static String PREFIX; // Prefixo do token JWT (Ex: "Bearer")
    public static String KEY; // Chave secreta usada para assinar/verificar o JWT
    public static Long EXPIRATION; // Tempo de expiração do token em milissegundos

    // Setter para o prefixo do token
    public void setPrefix(String prefix){
        PREFIX = prefix;
    }

    // Setter para a chave secreta do token
    public void setKey(String key){
        KEY = key;
    }

    // Setter para o tempo de expiração do token
    public void setExpiration(Long expiration){
        EXPIRATION = expiration;
    }
}

