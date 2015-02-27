package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.rightway.srp.AdminImpl;
import za.ac.cput.project.rightway.srp.StudentInterface;

/**
 * Created by student on 2015/02/27.
 */
public class TestSrp {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSrp() throws Exception {

        StudentInterface si = new AdminImpl();
        int fees = si.studentFees(1000);
        Assert.assertEquals(900,fees);
    }

    @After
    public void tearDown() throws Exception {
    }
}
