package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.project.rightway.dip.Employee;
import za.ac.cput.project.rightway.dip.FullTimeEmployee;
import za.ac.cput.project.rightway.dip.PartTimeEmployee;

/**
 * Created by student on 2015/02/27.
 */
public class TestDip {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDip() throws Exception {
        Employee emp = new PartTimeEmployee();
        double result = emp.Salary(1000.00,2.00);
        Assert.assertEquals(2000.00,result,2);
        Employee emp2 = new FullTimeEmployee();
        double result2 = emp2.Salary(1000.00,2.00);
        Assert.assertEquals(4000.00,result2,2);

    }

    @After
    public void tearDown() throws Exception {


    }
}
