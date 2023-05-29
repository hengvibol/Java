package Loop_Of_Java;

import java.util.Scanner;

public class For_Loop_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        // 3 6 9 12 15
        for(int i=3;i<=15;i+=3){
            System.out.print(" "+i);
        }
        System.out.println("");
        //-10 -20...50
        for(int i=-10;i<=20;i++){
            System.out.print(" "+i);
        }
        System.out.println("");
        //100 90 80...10
        for(int i=100;i>=10;i--){
            System.out.print(" "+i);
        }
        System.out.println("");
        // 10 9 8...-10
        for(int i=10;i>=-10;i--){
            System.out.print(" "+i);
        }
    }
}
