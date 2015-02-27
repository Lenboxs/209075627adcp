package za.ac.cput.project.encapsulation;

/**
 * Created by student on 2015/02/23.
 */
public class Encapsulation extends Student{

    public static void main(String [] args)
    {
        Student s = new Student();
        s.setName("Leonard");
        s.setLastName("Botha");
        s.setAge(28);
        s.setCellNumber(0744221167);

        System.out.println("name: " + s.getName()
        +" Surname: "+ s.getLastName());
    }
}
