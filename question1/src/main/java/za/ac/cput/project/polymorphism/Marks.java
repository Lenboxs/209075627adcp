package za.ac.cput.project.polymorphism;

/**
 * Created by student on 2015/02/27.
 */
public class Marks extends Student{

    public int mark;
    public Marks(int id, String name, String surname, int age, int mark)
    {
        super(id,name,surname,age);
        setMark(mark);
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public void display()
    {
        System.out.println(getId() +" "+ getName() +" "+ getSurname() +" "+ getAge() +" "+ getMark());
    }

}
