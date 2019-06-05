package springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by VietNV on 6/4/2019.
 */
@Configuration
public class ApplicationConfiguration
{
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
    @Bean
    public HelloWorld helloWorld2() {
        return new HelloWorld("name");
    }
}
