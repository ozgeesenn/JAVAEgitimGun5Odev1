package JAVAEgitim.dataAccess.concretes;

import JAVAEgitim.dataAccess.abstracts.UserDao;
import JAVAEgitim.entities.concretes.User;

import java.util.List;

public class UserCDao implements UserDao {
    @Override
    public void uyeOl(User user) {
        System.out.println("Uyelik basariyla saglandi. "+ user.getFirstName() + user.getLastName());
    }

    @Override
    public void dogrula(User user) {
       System.out.println("E-Posta doğrulama başarıyla gerçekleştirildi." + user.geteMail());
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
