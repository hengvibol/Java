package OPP_OF_JAVA;
import java.text.DecimalFormat;
import java.util.Scanner;
public class EXERCISE_Student_01 {
    DecimalFormat df = new DecimalFormat("0.##");
    private String name,Sex;
    private float score1,score2,score3;
    
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Name   : ");name=cin.nextLine();
        System.out.print("Input Gender : ");Sex=cin.next();
        System.out.print("Input Score 1: ");score1=cin.nextFloat();
        System.out.print("Input Score 2: ");score2=cin.nextFloat();
        System.out.print("Input Score 3: ");score3=cin.nextFloat();
    }
    public double Total(){
        return(score1+score2+score3);
    }
    public double avg(){
        return(Total()/3);
    }
    public String Grade(){
        if(avg()>=90 && avg()<=100){
            return("A");
        }else if(avg()>=90 && avg()<=80){
            return("B");
        }else if(avg()>=80 && avg()<=70){
            return("C");
        }else if(avg()>=70 && avg()<=60){
            return("D");
        }else if(avg()>=60 && avg()<=50){
            return("E");
        }else{
            return("F");
        }
    }
    public void Output(){
        System.out.println("NAME   :"+name);
        System.out.println("GENDER :"+Sex);
        System.out.println("SCORE 1:"+score1);
        System.out.println("SCORE 2:"+score2);
        System.out.println("SCORE 3:"+score3);
        System.out.println("TOTAL  :"+df.format(Total()));
        System.out.println("AVERAGE:"+df.format(avg()));
        System.out.println("GRADE  :"+Grade());   
    }
    public static void main(String[] args) {
        EXERCISE_Student_01 obj = new EXERCISE_Student_01();
        obj.Input();
        obj.Output();
    }
}
