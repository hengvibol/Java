package Multilevel_Inheritance;

import java.util.Scanner;

public class Person {
    protected int id;
    protected String name,gender;
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID       : ");id=cin.nextInt();
        System.out.print("Input Name     : ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input gender   : ");gender=cin.next();
    }
    public void Heaher(){
        System.out.printf("%12s%14s%16s","ID","NAME","Gender");
    }
    public void Output(){
        System.out.printf("%12d%14s%16s",id,name,gender);
    }
    
}
class Hospital extends Person{
    protected int roomNo,bedNo;
    protected String date;
    
    @Override
    public void Input(){
        super.Input();
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Room No  : ");roomNo=cin.nextInt();
        System.out.print("Inputn Bed No  : ");bedNo=cin.nextInt();
        System.out.print("Input Date     : ");date=cin.next();
    }
    public void Header(){
        super.Heaher();
        System.out.printf("%16s%15s%14s","Room No","BED No","DATE");
    }
    @Override
    public void Output(){
        super.Output();
        System.out.printf("%16d%15d%14s",roomNo,bedNo,date);
    }
}
class Patien extends Hospital {
    private String illness,address,phone;
    private int age;
    
    @Override
    public void Input(){
        super.Input();
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Illness  : ");illness=cin.next();
        System.out.print("Input Address  : ");address=cin.next();
        System.out.print("Input Phone    : ");phone=cin.next();
        System.out.print("Input Age      : ");age=cin.nextInt();
    }
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%17s%17s%13s\n","Illness","Address","AGE");
    }
    @Override
    public void Output(){
        super.Output();
        System.out.printf("%17s%17s%13d\n",illness,address,age);
    }
}
class DemoPerson{
    public static void main(String[] args) {
        Patien obj = new Patien();
        obj.Input();
        obj.Header();
        obj.Output();
    }
}
