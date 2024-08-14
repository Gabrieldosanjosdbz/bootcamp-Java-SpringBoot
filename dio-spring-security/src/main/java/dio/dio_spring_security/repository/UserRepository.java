package dio.dio_spring_security.repository;

import dio.dio_spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    //jql
    @Query("Select e From User e JOIN fetch e.roles WHERE e.username = (:username)")
    public User findByUsername(@Param("username") String username);
}
