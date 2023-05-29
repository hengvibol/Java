package java_introduction;

import java.util.Scanner;

public class EXAMPLE_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your rollno : ");
        int rollno=sc.nextInt();
        System.out.print("Enter your name : ");
        sc.nextLine();String name =sc.nextLine();
        System.out.print("Enter yor fee : ");
        double fee=sc.nextDouble();
        System.out.println("Rollno : " +rollno+ "Name : " +name+ " fee : "+fee);
        sc.close();
    }
}
