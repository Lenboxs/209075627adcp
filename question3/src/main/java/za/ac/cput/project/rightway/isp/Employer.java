package za.ac.cput.project.rightway.isp;

/**
 * Created by student on 2015/02/27.
 */
public class Employer {
    EmployeeInter employee;

    public void setEmployee(EmployeeInter emp) {
        employee = emp;
    }

    public void Employer()
    {
        employee.salary(1000.00,2.00);
    }
}
