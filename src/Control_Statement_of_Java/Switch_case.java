package Control_Statement_of_Java;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        int weed;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input day : ");weed=sc.nextInt();
        switch(weed){
            case 1:{
                System.out.println("Day1 : Monday");
            }break;
            case 2:{
                System.out.println("Day2 : Tueday");
            }break;
            case 3:{
                System.out.println("Day3 : Wednesday");
            }break;
            case 4:{
                System.out.println("Day4 : Thurday");
            }break;
            case 5:{
                System.out.println("Day5 : Friday");
            }break;
            case 6:{
                System.out.println("Day6 : Saturday");
            }break;
            case 7:{
                System.out.println("Day7 : Sunday");
            }break;
            default:{
                System.out.println("Invlid day....");
            }
        }
    }
}
