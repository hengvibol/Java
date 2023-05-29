package Array_one_D_of_java;

import java.util.Scanner;

public class Arrray_One_D_03 {
    public static void main(String[] args) {
        float arra[]= new float[5];
        int i,n;
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter Element to array :");
        n=cin.nextInt();
        for(i=0;i<n;i++){
        System.out.print("Input Array["+i+"]=");
        arra[i]=cin.nextFloat();
        }
        System.out.println("______SHOW ARRAY______");
        for(i=0;i<n;i++){
            System.out.println("Array["+i+"]="+arra[i]);
        }
    }
}
