package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.polymorphism.Marks;
import za.ac.cput.project.polymorphism.Student;

/**
 * Created by student on 2015/02/27.
 */
public class TestPolymorphism {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testPolymorphism() throws Exception {

        Marks m = new Marks(1,"len","bit",20,61);
        Student s = new Marks(2,"ken","bot",21,56);
        Assert.assertEquals("len",m.getName());
        Assert.assertEquals("ken",s.getName());

    }

    @After
    public void tearDown() throws Exception {


    }
}
