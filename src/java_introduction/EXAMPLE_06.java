package java_introduction;

import java.util.Scanner;

public class EXAMPLE_06 {
    public static void main(String[] args) {
       int id;
       String name,sex;
       Scanner objin = new Scanner(System.in);
        System.out.print("Input ID     = ");
        id=objin.nextInt();
        System.out.print("Input Name   = ");
        objin.nextLine();name=objin.nextLine();
        System.out.print("Input Gender = ");
        sex=objin.next();
        System.out.println("_____SHOW INFORMATION_____");
        System.out.print("ID   = "+id+"\n");
        System.out.print("Name = "+name+"\n");
        System.out.print("sex  = "+sex+"\n");
    }
}
