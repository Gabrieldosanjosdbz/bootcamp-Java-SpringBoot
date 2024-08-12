package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// A anotação @RestController indica que esta classe é um componente (bean) do tipo Controller
// e que seus métodos respondem a requisições HTTP.
@RestController
public class WelcomeController {

    // A anotação @GetMapping indica que o método abaixo responde a requisições HTTP do tipo GET.
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot web API";
    }
}
