package users.repositories;

import org.springframework.data.repository.CrudRepository;
import users.models.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
