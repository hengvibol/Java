package java_introduction;

import java.util.Scanner;

public class EXERCISE_PRODUCT {
    public static void main(String[] args) {
        int code,qty;
        String name;
        float price;
        double total;
        
       Scanner pro = new Scanner(System.in);
        System.out.println("_____INPUT INFORMATION______");
       System.out.print("Input Code   = ");code=pro.nextInt();
       System.out.print("Input Name   = "); pro.nextLine();name=pro.nextLine();
       System.out.print("Input QTY   = ");qty=pro.nextInt();
       System.out.print("Input Price = ");price=pro.nextFloat();
       total=qty*price;
        System.out.println("_____SHOW INFORMATION______");
        System.out.println("CODE   = "+code);
        System.out.println("NAME   = "+name);
        System.out.println("QTY    = "+qty);
        System.out.println("PRICE  = "+price);
        System.out.println("TOTAL  = "+total+"$");
               
    }
}
