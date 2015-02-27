package za.ac.cput.project.rightway.ocp;

/**
 * Created by student on 2015/02/27.
 */
public class PaymentCash extends PaymentInter{
    public double payWith(double a)
    {
        double sal = a - 100;
        return sal;
    }
}
