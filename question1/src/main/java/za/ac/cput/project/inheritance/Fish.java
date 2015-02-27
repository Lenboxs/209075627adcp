package za.ac.cput.project.inheritance;

/**
 * Created by student on 2015/02/27.
 */
public class Fish implements Animal{
    private String swim = "swimming";

    public String getSwim() {
        return swim;
    }

    public void setSwim(String swim) {
        this.swim = swim;
    }

    public void move(String move)
    {
        System.out.println("it "+getSwim());
    }

}
