package za.ac.cput.project.inheritance;

/**
 * Created by student on 2015/02/27.
 */
public class Bird implements Animal{

        private String fly = "flying";

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public void move(String move)
        {
            System.out.println(getFly());
        }

}
