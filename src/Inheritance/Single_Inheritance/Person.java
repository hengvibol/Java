package Inheritance.Single_Inheritance;

import java.util.Scanner;

public class Person {
    protected int id;
    protected String name,sex;
    
    public void Input(){
        Scanner cin=new Scanner(System.in);
        System.out.print("Input ID       : ");id=cin.nextInt();
        System.out.print("Input Name     : ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input Sex      : ");sex=cin.nextLine();
    }
    public void Header(){
        System.out.printf("%12s%14s%16s","ID","NAME","GENDER");
    }
    public void Output(){
        System.out.printf("%12d%14s%16s",id,name,sex);
    }
}
class Employee extends Person{
    private String position;
    private float salary;
    
    @Override
    public void Input(){
        super.Input();
       Scanner cin=new Scanner(System.in);
        System.out.print("Input Position : ");position=cin.nextLine();
        System.out.print("Input Salary   : ");salary=cin.nextFloat();
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
    public static void main(String[] args) {
        Employee Em = new Employee();
        Em.Input();
        Em.Header();
        Em.Output();
    }
}
