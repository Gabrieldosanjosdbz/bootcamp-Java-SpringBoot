package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Usuario> getUsers(){
          return repository.listAll();
    }
    @GetMapping("{username}")
    public Usuario getOne(@PathVariable("username") int username){
        return repository.finById(username);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
