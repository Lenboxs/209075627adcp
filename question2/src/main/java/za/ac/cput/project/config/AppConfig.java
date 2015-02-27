package za.ac.cput.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.project.AnimalInterface;
import za.ac.cput.project.BirdsImpl;

/**
 * Created by student on 2015/02/27.
 */
@Configuration
public class AppConfig {
    @Bean(name="animal")
    public AnimalInterface getService()
    {
        return new BirdsImpl();
    }
}
