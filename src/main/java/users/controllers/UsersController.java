package users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import users.models.Users;

import java.util.List;

@RestController
public class UsersController {
    @GetMapping ("/users")
    List<Users> all() {
        return List.of(new Users(1, "John", "admin"), new Users(2,"Jane", "user"));
    }
}
