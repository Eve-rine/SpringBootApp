package users.models;

import java.util.Objects;

public class Users {
    private String name;
    private String role;
    private int id;

    Users() {}

    public Users(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return this.id;
    }


    public String getUserName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String name) {
        this.name = name;
    }


}
