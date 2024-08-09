package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    //Se apagar o prototype ele vira um Singleton. Pode-se notar que quando ele é Singleton todos os
    //beans criados de remetente() são interconectados, o que pode ser uma desvantagem. Já o Prototype
    //faz que cada bean seja uma instancia unica de remetente()
    @Scope("prototype")

    //O método remetente() cria e configura uma instância do tipo Remetente.
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
