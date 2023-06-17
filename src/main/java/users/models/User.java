package users.models;


import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(nullable = false, unique = true)
    private  String email;
//    public User(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }

    public Long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
