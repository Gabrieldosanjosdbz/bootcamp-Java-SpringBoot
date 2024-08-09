package dio.aula_spring_data_jpa;
import dio.aula_spring_data_jpa.Model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;  //injetando o UserRepository criado

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("GABRIEL");
        user.setUserName("gabriel");
        user.setPassword("gab456");

        repository.save(user);  //salvando no banco de dados

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
