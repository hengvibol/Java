package Function;

import java.util.Scanner;

public class Non_Return_h_p_01 {
    void studentDatial(int id,String Name,String sex,float score1,float score2,float score3){
        double total=score1+score2+score3;
        System.out.println("ID\tNAME\tGENDER\tSCORE1\tSCORE2\tSCORE3\tTOTAL");
        System.out.println(id+"\t"+Name+"\t"+sex+"\t"+score1+"\t"+score2+"\t"+score3+"\t"+total);
    }
    public Non_Return_h_p_01(){
        int id;
        String Name,sex;
        float score1,score2,score3;
        Scanner cin=new Scanner(System.in);
        System.out.print("Input ID     = ");id=cin.nextInt();
        System.out.print("Input Name   = ");cin.nextLine();Name=cin.nextLine();
        System.out.print("Input Gender = ");sex=cin.next();
        System.out.print("Input Score1 = ");score1=cin.nextFloat();
        System.out.print("Input Score2 = ");score2=cin.nextFloat();
        System.out.print("Input Score3 = ");score3=cin.nextFloat();
        studentDatial(id,Name,sex,score1,score2,score3);
    }
    public static void main(String[] args) {
        new Non_Return_h_p_01();
    }
}
