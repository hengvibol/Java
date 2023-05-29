package java_introduction;


import java.text.DecimalFormat;
import java.util.Scanner;

public class EXERCISE_02 {
    public static void main(String[] args) {
        int code,qty;
        String Name;
        float price,totald,totalr;
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("####0.00");
        System.out.println("____Input Information______");
        System.out.print("Input Code : ");code=sc.nextInt();
        System.out.print("Input Name : ");sc.nextLine();Name=sc.nextLine();
        System.out.print("Input QTY : ");qty=sc.nextInt();
        System.out.print("Input price : ");price=sc.nextFloat();
        totald=price*qty;
        totalr=totald*4000;
        System.out.println("____Show Information______");
        System.out.println("Code = "+code);
        System.out.println("Name = "+Name);
        System.out.println("QYT  = "+qty);
        System.out.println("Price= "+price);
        System.out.println("TOTAL Dolar = "+df.format(totalr)+"$");
        System.out.println("TOTAL REAL  = "+df.format(totald)+"រ");
    }
}
