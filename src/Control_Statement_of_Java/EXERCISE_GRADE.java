package Control_Statement_of_Java;

import java.util.Scanner;

public class EXERCISE_GRADE {
    public static void main(String[] args) {
        float Khmer,English,Java,cprogram,HTML;
        double total,average;
        String Grade;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input score Khmer    = ");Khmer=sc.nextFloat();
        System.out.print("Input score English  = ");English=sc.nextFloat();
        System.out.print("Input score JAVA     = ");Java=sc.nextFloat();
        System.out.print("Input score Cprogram = ");cprogram=sc.nextFloat();
        System.out.print("Input score HTML     = ");HTML=sc.nextFloat();
        total=Khmer+English+Java+cprogram+HTML;
        average=total/5;
        if(average>=90 && average<=100){
            Grade="A";
        }else if(average>=80 && average<=90){
            Grade="B";
        }else if(average>=70 && average<=80){
            Grade="C";
        }else if(average>=60 && average<=70){
            Grade="D";
        }else if(average>=50 && average<=60){
            Grade="E";
        }else{
            Grade="F";
        }
        System.out.println("Total score is = "+total);
        System.out.println("Average is = "+average);
        System.out.println("Grade is = "+Grade);
    }
}
