package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.rightway.ocp.PaymentCash;
import za.ac.cput.project.rightway.ocp.PaymentCheck;
import za.ac.cput.project.rightway.ocp.PaymentInter;

/**
 * Created by student on 2015/02/27.
 */
public class TestOcp {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testIsp() throws Exception {
        PaymentInter pi = new PaymentCash();
        double result = pi.payWith(1000.00);
        Assert.assertEquals(900.00, result, 2);
        PaymentInter pi2 = new PaymentCheck();
        double result2 = pi2.payWith(1000.00);
        Assert.assertEquals(800.00,result2,2);

    }

    @After
    public void tearDown() throws Exception {


    }
}
