package java_introduction;

import java.util.Scanner;

public class Get_Keybord {
    public static void main(String[] args) {
        int id;
        String name,gender;
        float score;
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Input ID     = ");id=sc.nextInt();
        System.out.print("Input Name   = "); sc.nextLine(); name=sc.nextLine();
        System.out.print("Input Gender = ");gender=sc.next();
        System.out.print("Input score  = ");score=sc.nextFloat();
        
        System.out.println("DI     = "+id);
        System.out.println("NAME   = "+name);
        System.out.println("GENDER = "+gender);
        System.out.println("SCORE  = "+score);
                
                
                
                
          
                
                        
    }
}
