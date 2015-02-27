package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.rightway.isp.PartTimeEmployee;
import za.ac.cput.project.rightway.isp.FullTimeEmployee;
import za.ac.cput.project.rightway.isp.SalaryInter;

/**
 * Created by student on 2015/02/27.
 */
public class TestIsp {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testIsp() throws Exception {
        SalaryInter empi = new PartTimeEmployee();
        double result = empi.salary(1000.00, 2.00);
        Assert.assertEquals(2000.00, result, 2);
        SalaryInter empi2 = new FullTimeEmployee();
        double result2 = empi2.salary(1000.00, 2.00);
        Assert.assertEquals(4000.00,result2,2);

    }

    @After
    public void tearDown() throws Exception {


    }
}
