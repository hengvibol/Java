package java_introduction;

import java.util.Scanner;

public class EXERCISE_03 {
    public static void main(String[] args) {
        float score1,score2,score3,score4,score5;
        float total,average;
        Scanner sc=new Scanner(System.in);
        System.out.println("____Input Information______");
        System.out.print("Input Score 1 : ");score1=sc.nextFloat();
        System.out.print("Input Score 2 : ");score2=sc.nextFloat();
        System.out.print("Input Score 3 : ");score3=sc.nextFloat();
        System.out.print("Input Score 4 : ");score4=sc.nextFloat();
        System.out.print("Input Score 5 : ");score5=sc.nextFloat();
        total=score1+score2+score3+score4+score5;
        average=total/5;
        System.out.println("____Show Information______");
        System.out.println("score1 is = "+score1);
        System.out.println("score2 is = "+score2);
        System.out.println("score3 is = "+score3);
        System.out.println("score4 is = "+score4);
        System.out.println("score5 is = "+score5);
        System.out.println("TOTAL score is = "+total);
        System.out.println("Average  is = "+average);
    }
}
