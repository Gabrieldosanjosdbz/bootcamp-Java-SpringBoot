package dio.dio_spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }

    //rota que será gerenciada pelo SecurityFilterChain, ele falará quais Users poderão usar essa rota
    @GetMapping("/users")
    // @PreAuthorize("hasAnyRole('MANAGERS', 'USERS')") menos utilizado, usar o @PreAuthorize diretamente no controller
    public String users() {
        return "Authorized user";
    }

    @GetMapping("/managers")
    // @PreAuthorize("hasRole('MANAGERS')")
    public String managers() {
        return "Authorized manager";
    }
}