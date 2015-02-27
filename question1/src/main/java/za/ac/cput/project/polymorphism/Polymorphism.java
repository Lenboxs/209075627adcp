package za.ac.cput.project.polymorphism;

/**
 * Created by student on 2015/02/27.
 */
public class Polymorphism {

    public static void main(String [] args)
    {
        Marks m = new Marks(1,"len","bit",20,61);
        Student s = new Marks(2,"ken","bot",21,56);
        System.out.println("Student");
        System.out.println("------------------------\n");
        m.display();
        System.out.println("------------------------\n");
        s.display();
        System.out.println("------------------------\n");
    }
}
