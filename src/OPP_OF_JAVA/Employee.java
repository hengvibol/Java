package OPP_OF_JAVA;
import java.util.Scanner;
public class Employee {
    private int id;
    private String name;
    private String gender;
    private double salary;
    
    //Default Constructor 
    public Employee(){
        id=101;
        name="Heng Vibol";
        gender="Male";
        salary=1305;
    }
    public Employee(int id,String name,String gender,double salary){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.salary=salary;
    }
    public void input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID     = ");id=cin.nextInt();
        System.out.print("Input Name   = ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input Gender = ");gender=cin.next();
        System.out.print("Input Salary = ");salary=cin.nextDouble();
    }
    public void output(){
        System.out.println("ID     = "+id);
        System.out.println("Name   = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Salry  = "+salary);          
    }
}
class EmployeeDetail{
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        Employee Em = new Employee();
        Em.output();
        System.out.println("Constructor with Paramemter");
        Employee Em1 = new Employee(102,"Vibol","male",123.3);
        Em1.output();
        
        Employee Em2 = new Employee();
        Em2.input();
        Em2.output();
    }
}
