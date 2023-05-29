package Heirarchical_Inheritance;

import java.util.Scanner;

public class Person {
    protected int id;
    protected String name,gender;
    protected int age;
    
    public Person(){
        id = 101;
        name="CHANNA";
        gender="Male";
        age=20;
    }

    public Person(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID  : ");id=cin.nextInt();
        System.out.print("Input Name : ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input Gender : ");gender=cin.next();
        System.out.print("Input Age    : ");age=cin.nextInt();
    }
    public void Header(){
        System.out.printf("%12s%14s%16s%13s","ID","NAME","GENDER","AGE");
    }
    public void Output(){
        System.out.printf("%12d%14s%16s%13d",id,name,gender,age);
    }
         
}
