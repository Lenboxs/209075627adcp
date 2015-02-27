package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.project.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class TestAnimal {

    private AnimalInterface animal;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        animal = (AnimalInterface)ctx.getBean("animal");
    }

    @Test
    public void testAnimal() throws Exception {
        String animove = animal.moving();
        Assert.assertEquals("Flying",animove);
    }

    @After
    public void tearDown() throws Exception {


    }
}
