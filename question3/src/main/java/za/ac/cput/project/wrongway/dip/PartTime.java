package za.ac.cput.project.wrongway.dip;

/**
 * Created by student on 2015/02/27.
 */
public class PartTime {
    Employee employee;

    public void setEmployee(Employee emp)
    {
        employee = emp;
    }

    public void partTime()
    {
        employee.Salary();
    }
}
