package dio.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Este é a classe que sobe o container
@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimeirosPassosApplication.class, args);

		/*não se faz isso em Springboot
		* Calculadora calculadora = new Calculadora();
		* System.out.println("O resultado é " + calculadora.somar(2, 7));
		* não se instancia objetos no Springboot porque isso é função do containers que cria os beans (instancias dos objetos)*/

		//O CommandLineRunner é uma interface que permite executar código assim que o contêiner Spring estiver pronto e a aplicação estiver inicializada.

	}
}
