package dio.dio_spring_security_jwt.controller;

import dio.dio_spring_security_jwt.model.User;
import dio.dio_spring_security_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void postUser(@RequestBody User user){
        userService.createUser(user);
    }
}
