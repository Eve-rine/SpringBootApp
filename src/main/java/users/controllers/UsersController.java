package users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import users.models.User;

import java.util.List;

@RestController
public class UsersController {
    @GetMapping ("/users")
    List<User> all() {
        return List.of(new User(1L, "John", "admin"), new User(2L,"Jane", "user"));
    }
}
