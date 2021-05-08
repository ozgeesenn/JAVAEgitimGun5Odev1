package JAVAEgitim.business.concretes;

import JAVAEgitim.business.abstracts.UserService;
import JAVAEgitim.core.LoggerService;
import JAVAEgitim.dataAccess.abstracts.UserDao;
import JAVAEgitim.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private UserDao userDao;
    private LoggerService loggerService;


    public UserManager(UserDao userDao, LoggerService loggerService) {
        this.userDao = userDao;
        this.loggerService = loggerService;
    }

    @Override
    public void uyeOl(User user) {

        if((emailControl(user.geteMail())) && (adSoyadKontrol(user.getFirstName(),user.getLastName())) && (parolaKontrol(user.geteMail())))
        {
            System.out.println("Bilgileriniz üyelik için uygundur");
            mailGonder(user);
            userDao.uyeOl(user);
        }

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    public boolean parolaKontrol(String parola) {
        if (parola.length() <= 6) {
            System.out.println("Parolanız en az 6 karakterden oluşmalıdır.");
            return false;
        } else {
            System.out.println("Parolanız formata uygundur.");
            return true;
        }
    }

    public boolean adSoyadKontrol(String firstName, String lastName) {
        if (firstName.length() <= 2 && lastName.length() <= 2) {
            System.out.println("Ad ve soyad en az 2 karakterden oluşmalıdır.");
            return false;
        } else {
            System.out.println("Ad ve soyad doğru formatta girilmiştir.");
            return true;
        }
    }

    public void mailGonder(User user) {
        System.out.println(user.geteMail() + " mail adresine e-mail gönderilmiştir.");
    }

    public boolean emailControl(String email) {
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        Matcher m = pattern.matcher(email);

        if (m.find()) {
            System.out.println("Email formatı doğrudur.");
            return true;
        } else {
            System.out.println("Email formatı hatalıdır.");
            return false;
        }

    }
}
