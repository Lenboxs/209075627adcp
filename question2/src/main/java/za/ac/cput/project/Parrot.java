package za.ac.cput.project;

/**
 * Created by student on 2015/02/27.
 */
public class Parrot extends BirdsImpl{

    public static void main(String [] args)
        {
            AnimalInterface ai = new BirdsImpl();
            ai.moving();
        }
}
