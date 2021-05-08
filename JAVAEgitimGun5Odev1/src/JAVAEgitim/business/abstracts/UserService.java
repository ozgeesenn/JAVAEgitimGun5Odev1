package JAVAEgitim.business.abstracts;

import JAVAEgitim.entities.concretes.User;

import java.util.List;

public interface UserService {
    void uyeOl(User user);
    List<User> getAll();


}
