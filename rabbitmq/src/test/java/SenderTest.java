import com.cjie.rabbitmq.Application;
import com.cjie.rabbitmq.HelloSender;
import com.cjie.rabbitmq.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SenderTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testSender() {
        helloSender.send();
        User user = new User();
        user.setId(123L);
        user.setName("hahu");
        helloSender.send(user);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
