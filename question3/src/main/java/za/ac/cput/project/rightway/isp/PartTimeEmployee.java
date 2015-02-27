package za.ac.cput.project.rightway.isp;

/**
 * Created by student on 2015/02/27.
 */
public class PartTimeEmployee implements JobInter,SalaryInter {

    public void job()
    {

    }
    public Double salary(double a, double b)
    {
        Double salary = a * b;
        return salary;
    }
}
