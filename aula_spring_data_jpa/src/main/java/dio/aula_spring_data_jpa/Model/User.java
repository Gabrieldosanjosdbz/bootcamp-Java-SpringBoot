package dio.aula_spring_data_jpa.Model;

import jakarta.persistence.*;
//Essas anotações fazem parte do mapeamento de objetos da ORM Hibernate utilizando o JPA

//Para transformar uma classe Java em uma Entidade de BD usamos a anotação @Entity
@Entity
@Table(name = "tab_user")   //especificar o nome da tabela no banco de dados onde os registros de User serão armazenados.
public class User {
    @Id //essa anotação diz que o seguinte campo é um identificador unico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //essa anotação diz que o valor do identificador será gerado automaticamente pelo banco de dados,
    //usando uma estratégia de auto-incremento. No caso da estratégia IDENTITY, o banco de dados é responsável
    //por gerar e gerenciar o valor único para este campo, geralmente incrementando o valor automaticamente.
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String userName;

    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
