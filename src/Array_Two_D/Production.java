package Array_Two_D;

import java.util.Scanner;

public class Production {
    public static void main(String[] args) {
        String product[][] = new String [10][5];
        int n;
        double total;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.print(" Input number of product : ");
           n=cin.nextInt();
        }while(n>10);
        for(int i=0;i<n;i++){
            System.out.println("=======["+(i+1)+"]=======");
            System.out.print("Input ID   : ");product[i][0]=cin.next();
            System.out.print("Input Name : ");cin.nextLine();product[i][1]=cin.nextLine();
            System.out.print("Input QTY  : ");product[i][2]=cin.next();
            System.out.print("Input Price: ");product[i][3]=cin.next();
            total=Float.parseFloat(product[i][2])+Integer.parseInt(product[i][3]);
            product[i][4]=String.valueOf(total);           
        }
        System.out.printf("%12s%14s%13s%15s%15s\n","ID","Name","QTY","Price","TOTAL");
        for(int i=0;i<n;i++){
            System.out.printf("%12s%14s%15s%13s%15s$\n",product[i][0],product[i][1],product[i][2],product[i][3],product[i][4]);
        }
    }
}
