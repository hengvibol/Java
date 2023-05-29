package java_introduction;

import java.util.Scanner;



public class EXERCISE_01 {
    public static void main(String[] args) {
        String id,Name,sex,address;
       Scanner sc=new Scanner(System.in);
       System.out.println("____Input Information______");
        System.out.print("Input ID :");id=sc.next();
        System.out.print("Input Name :");sc.nextLine();Name=sc.nextLine();
        System.out.print("Input Sex :");sex=sc.next();
        System.out.print("Input Address :");address=sc.next();
       System.out.println("____Show Information______");    
        System.out.println("ID = "+id);    
        System.out.println("Name = "+Name);
        System.out.println("Sex  = "+sex); 
        System.out.println("IAddress = "+address); 
    }
}
