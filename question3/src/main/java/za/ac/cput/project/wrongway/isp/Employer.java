package za.ac.cput.project.wrongway.isp;

/**
 * Created by student on 2015/02/27.
 */
public class Employer {
    Employee employee;

    public void setEmployee(Employee emp)
    {
        employee = emp;
    }

    public void Employer()
    {
        employee.salary(1000.00,2.00);
    }
}
