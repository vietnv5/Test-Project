package springconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by VietNV on 6/4/2019.
 */
public class Application
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.print();
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld2");
        helloWorld2.print();
    }
}
