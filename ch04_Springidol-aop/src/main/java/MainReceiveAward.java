import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vonzhou on 16/7/22.
 * performer.receiveAward();
 */
public class MainReceiveAward {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol-introductions.xml");
        Contestant performer = (Contestant) context.getBean("eddie");
        performer.receiveAward();

    }
}
