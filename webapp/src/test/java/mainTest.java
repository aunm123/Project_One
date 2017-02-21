import com.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by timhuo on 2017/2/10.
 */

public class mainTest {

    public ApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");

    @Test
    public void test(){
        UserDao bean = (UserDao) context.getBean("userDaoImpl");
//        bean.deleteUser(1);

//        User user = new User("我的名字1","我的密码1");
//        bean.save(user);
    }

    @Test
    public void delete(){
//        UserDao bean = (UserDao) context.getBean("userDaoImpl");
//        bean.delete(1);
    }

}
