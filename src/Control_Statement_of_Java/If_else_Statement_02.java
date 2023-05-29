package Control_Statement_of_Java;

import java.util.Scanner;

public class If_else_Statement_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sex;
        System.out.println("Input Gender(Male or Famale)");sex=sc.next();
        if(sex.equalsIgnoreCase("Male"));
        else 
            System.out.println("No right Your Input other Gender");
    }
}
