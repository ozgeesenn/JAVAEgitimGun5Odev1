package JAVAEgitim.dataAccess.abstracts;

import JAVAEgitim.entities.concretes.User;

import java.util.List;

public interface UserDao {

    void uyeOl(User user);
    void dogrula(User user);
    User get(int id);
    List<User> getAll();

}
