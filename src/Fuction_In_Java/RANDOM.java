package Fuction_In_Java;

import java.util.Random;
import java.util.Scanner;

public class RANDOM {
    public static void main(String[] args) {
        Random Ran = new Random();
        int n,m;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input number of random : ");
        n=cin.nextInt();
        System.out.print("Input number of voit :");
        m=cin.nextInt();
        int voit[] = new int[m];
        for(int j=0;j<m;j++){
            System.out.print("Input user Voit : ");
            voit[j]=cin.nextInt();
        }
        int random[] = new int[n];
        for(int i=0;i<n;i++){
            random[i]=Ran.nextInt(100);
            System.out.println(random[i]);
        }
        //check number
        boolean b=false;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(voit[j]==random[i]){
                System.out.println("Voit = "+voit[j]+"Congratation , You win 1000$");
                b=true;
                }
            }
        }
        if(b==false){
            System.out.println("Fail, You losse...!");
        }
    }
    
}
