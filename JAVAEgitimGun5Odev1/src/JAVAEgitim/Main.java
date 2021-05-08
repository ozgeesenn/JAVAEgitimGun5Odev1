package JAVAEgitim;

import JAVAEgitim.business.abstracts.UserService;
import JAVAEgitim.business.concretes.UserManager;
import JAVAEgitim.core.JloggerManagerAdapter;
import JAVAEgitim.dataAccess.concretes.UserCDao;
import JAVAEgitim.entities.concretes.User;

public class Main {

    public static void main(String[] args)
    {
        UserService userService=new UserManager(new UserCDao(),new JloggerManagerAdapter());

        User user=new User(1,"Özge","Şen","xxx@xxx.com","156");
        userService.uyeOl(user);
    }
}
