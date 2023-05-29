package Array_one_D_of_java;
import java.util.Random;
public class Array_One_D_05 {
    public static void main(String[] args) {
        int []a = new int[100];
        Random ran=new Random();// 
        int n=20;
        System.out.println("intArray output (version 2)");
        //Random 1-100 whith N  number
        for(int i=0;i<n;i++){
            a[i]=ran.nextInt(100)+1;
        }
        //Output Array
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
