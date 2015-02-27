package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.encapsulation.Student;

/**
 * Created by student on 2015/02/27.
 */
public class TestEncapsulation {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testEncapsulation() throws Exception {

        Student s = new Student();
        s.setName("Leonard");
        Assert.assertEquals("Leonard",s.getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}
