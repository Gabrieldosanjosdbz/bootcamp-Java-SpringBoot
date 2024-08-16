package dio.dio_spring_security_jwt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DioSpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityJwtApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(){
        return args -> System.out.println("olá mundo");
	}
}
