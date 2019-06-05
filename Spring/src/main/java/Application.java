import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springinheritance.Clazz;
import springxmlconfiguration.Drawing;

/**
 * Created by VietNV on 6/1/2019.
 */
public class Application
{
    public static void main(String[] args) {
        // Call Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Request to get SayHello object
        SayHello sayHello = (SayHello) context.getBean("hello");
        SayHello sayHello2 = (SayHello) context.getBean(SayHello.class);

        // Call any methods in SayHello object
        sayHello.say();
        sayHello2.say();
        // Request to get Drawing object
        Drawing drawing = (Drawing) context.getBean("drawing");
        drawing.draw();
//
        Clazz clazzA = (Clazz) context.getBean("clazzA");

        System.out.println("\n" + clazzA.getSchoolName());

    }
}
