package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.inheritance.Bird;
import za.ac.cput.project.inheritance.Fish;


/**
 * Created by student on 2015/02/27.
 */
public class TestInhertance {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testInhertance() throws Exception {
        Fish f = new Fish();
        Assert.assertEquals("swimming", f.getSwim());
        Bird b = new Bird();
        Assert.assertEquals("flying",b.getFly());
    }

    @After
    public void tearDown() throws Exception {


    }
}
