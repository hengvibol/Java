package OPP_OF_JAVA;
import java.util.Scanner;
public class Person {
    private int id;
    private String name,gender;
    private float height;
    
    //Default Constructor 
    public Person(){
        id=1001;
        name="Heng Vibol";
        gender="Male";
        height=1.60f;
    }
    public Person(int id,String name,String gender,float height){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.height=height;
    }
    public void input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID     = ");id=cin.nextInt();
        System.out.print("Input Name   = ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input Gender = ");gender=cin.next();
        System.out.print("Input Salary = ");height=cin.nextFloat();
    }
    public void output(){
        System.out.println("ID     = "+id);
        System.out.println("Name   = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Salary = "+height);
    }
    
}
class PersonDetail{
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        Person per = new Person();
        per.output();
        System.out.println("Constructor with Paramemter");
        Person per1 = new Person(1002,"VIBOL","Male",1.78f);
        per1.output();
        System.out.println("Input Information by key ");
        Person per2 = new Person();
        per2.input();
        System.out.println("Output Information");
        per2.output();
        
    }
}
