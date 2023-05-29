package Control_Statement_of_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IF_else_if_01 {
    public static void main(String[] args) {
        int code,qty;
        String name;
        double price,total,dis,pay;
        DecimalFormat df=new DecimalFormat("####0.00");
        Scanner sc=new Scanner(System.in);
        System.out.print("Input code = ");code=sc.nextInt();
        System.out.print("Input name = ");sc.nextLine();name=sc.nextLine();
        System.out.print("Input Quatity = ");qty=sc.nextInt();
        System.out.print("Input price   = ");price=sc.nextDouble();
        total=qty*price;
        if(total>=1 && total<10)
            dis=total*0.1;
        else if(total>=10 && total<20)
            dis=total*0.2;
        else if(total>=20 && total<30)
            dis=total*0.3;
        else if(total>=30 && total<40)
            dis=total*0.4;
        else if(total>=40 && total<50)
            dis=total*0.5;
        else 
            dis=total*0.6;
        pay=total-dis;
        System.out.println("Payment Total ="+df.format(total)+"$");
        System.out.println("Discoun = "+df.format(dis)+"$");
    }
}
