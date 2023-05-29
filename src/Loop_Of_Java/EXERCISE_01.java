package Loop_Of_Java;

import java.util.Scanner;

public class EXERCISE_01 {
    public static void main(String[] args) {
        int n,op,i;
        String st;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("1. Loop1");
        System.out.println("1. Loop2");
        System.out.println("1. Loop3");
        System.out.println("1. Loop4");
        System.out.println("1. Loop5");
        System.out.println("1. Loop6");
        System.out.print("Choose one option : ");op=sc.nextInt();
        System.out.print("Input number of Loop : ");n=sc.nextInt();
        switch(op){
            case 1:{
                for(i=2;i<=n;i=i+2){
                    System.out.print(i+" ");
                }
            }break;
            case 2:{
                for(i=2;i<=n;i=i+3){
                    System.out.print(i+" ");
                }
            }break;
            case 3:{
                for(i=n;i>=n;i=i-2){
                    System.out.print(i+" ");
                }    
            }break;
            case 4:{
                for(i=n;i>=n;i=i-3){
                    System.out.print(i+" ");
                }
            }break;
            case 5:{
                for(i=n;i>=n;i=i-1){
                    System.out.print(i+" ");
                }
            }break;
        }//end switch
            System.out.println("\n Press Yes to continue...");
            st=sc.next();
        }while(st.equals("yes"));
    }
}
