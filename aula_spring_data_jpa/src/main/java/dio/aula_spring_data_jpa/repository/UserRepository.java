package dio.aula_spring_data_jpa.repository;

import dio.aula_spring_data_jpa.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// Esta interface JpaRepository nos possibilita utilizar métodos prontos para operações de CRUD,
// como save(), findAll(), findById(), delete(), entre outros.
// O primeiro parâmetro genérico de JpaRepository deve ser a nossa entidade (model), e o segundo é o tipo do ID.
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //Query Method - Retorna a lista de usuários contendo a parte do name
    List<User> findByNameContaining(String name);

    //Query Override - Retorna a lista de usuários contendo a parte do name
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

    //Query Method - Retorna um usuário pelo campo username
    User findByUsername(String username);
}


