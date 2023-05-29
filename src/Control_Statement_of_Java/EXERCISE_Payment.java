package Control_Statement_of_Java;

import java.util.Scanner;

public class EXERCISE_Payment {
    public static void main(String[] args) {
        float newuser,olduser,total,payment;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input New user :");newuser=sc.nextFloat();
        System.out.print("Input Old user :");olduser=sc.nextFloat();
        total=newuser-olduser;
        if(total>=1 && total<=10)
            payment=total*500;
        else if(total >=10 && total<=20)
            payment=total*550;
        else if(total>=20 && total<=30)
            payment=total*600;
        else if(total>=30 && total<=40)
            payment=total*650;
        else if(total>=40 && total<=50)
            payment=total*700;
        else if(total>=50 && total<=60)
            payment=total*750;
        else
            payment=total*800;
        System.out.println("Your payment is :"+payment);
    }
}
