package Heirarchical_Inheritance;

import java.util.Scanner;

public class Employee extends Person {
    private String position;
    private float salary;
    
    public Employee(){
        super();
        position="N/A";
        salary=0;
    }

    public Employee(int id,String name,String gender,int age,String position, float salary) {
        super(id, name, gender, age);
        this.position = position;
        this.salary = salary;
    }
    @Override
    public void Input (){
        super.Input();
        Scanner cin = new Scanner(System.in);
        System.out.print("Input  Position : ");position=cin.nextLine();
        System.out.print("Input Salary    : ");salary=cin.nextFloat();
    }
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%18s%16s\n","POSITION","SALARY");
    }
    @Override
    public void Output(){
        super.Output();
        System.out.printf("%18s%16.2f\n",position,salary);
    }
    
}
class DemoEmployee{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Employee Em = new Employee();
        Employee H = new Employee();
        int op;
        do{
            System.out.println(" 1.INPUT INFORMATION"); 
            System.out.println(" 2.OUTPUT INFORMATION");
            System.out.println(" 3.Defualf CONSTRUCTOR");
            System.out.println(" 4.CONSTRUCTOR PARAMETER");
            System.out.println(" 0.Exit PROGRAM");
            System.out.print("Please choose one option :");op=cin.nextInt();
            switch(op){
                case 1:{
                    Em.Input();
                }break;
                case 2:{
                    H.Header();
                    Em.Output();
                }break;
                case 3:{
                    Employee Em1 = new Employee();
                }break;
                case 4:{
                    Employee Em2 = new Employee(100,"HENG VIBOL","Male",21,"MobileApp",2888);
                }break;
            }
        }while(op!=0);
    }
}
