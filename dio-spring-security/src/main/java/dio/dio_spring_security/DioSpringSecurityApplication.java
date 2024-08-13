package dio.dio_spring_security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DioSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception{
		return args -> System.out.println("Olá mundo");
	}
}
