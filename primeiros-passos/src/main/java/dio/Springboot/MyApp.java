package dio.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Anotação que indica que esta classe é um componente gerenciado pelo Spring. O Spring a detecta durante a varredura de componentes e cria um bean para ela.
@Component

// Implementa a interface CommandLineRunner, que define o método run, que será chamado após a aplicação ser iniciada.
public class MyApp implements CommandLineRunner {
    // Indica que o Spring deve injetar uma instância do bean Calculadora no campo calculadora. O contêiner Spring cuida da criação e injeção da dependência.
    @Autowired
    private Calculadora calculadora;

    // Executa o código para usar o bean Calculadora e imprime o resultado da soma.
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(2, 7));
    }
}
