package dio.dio_spring_security.model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    // Insere registros na tabela tab_user_roles para cada elemento na coleção roles do User.
    @ElementCollection(fetch = FetchType.EAGER)  // Define que esta coleção será armazenada em uma tabela separada e será carregada imediatamente ao carregar o usuário.
    @CollectionTable(name = "tab_user_roles" , joinColumns = @JoinColumn(name = "user_id")) // Define o nome da tabela que armazenará as roles e especifica a coluna de junção.
    // . O campo user_id na tabela tab_user_roles serve como chave estrangeira
    @Column(name = "role_id") // Define o nome da coluna que armazenará cada role na tabela de roles.
    private List<String> roles = new ArrayList<>(); // Inicializa a lista de roles como uma nova ArrayList.


    public User(){

    }
    public User(String username){
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}