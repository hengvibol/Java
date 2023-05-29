package AWT.Person_Form;
import java.util.ArrayList;
public class List_Person {
    private int id;
    private String name,gender;
    private float salary;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public float getSalary() {
        return salary;
    }

    public List_Person(int id, String name, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    static ArrayList<List_Person> list = new ArrayList<>();
    
}
