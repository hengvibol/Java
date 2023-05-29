package Control_Statement_of_Java;

import java.util.Scanner;

public class IF_else_Statement_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Input x = ");x=sc.nextInt();
        System.out.print("Input y = ");y=sc.nextInt();
        if(x>y)
            System.out.println("X is greater Y!");
        else 
            System.out.println("Y is greater than X!");
    }
}
