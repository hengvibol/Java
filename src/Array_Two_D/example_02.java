package Array_Two_D;

import java.util.Scanner;

public class example_02 {
    public static void main(String[] args) {
        int array[][]= new int [30][20];
        int row,col;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.print("Input number of row : ");
            row=cin.nextInt();
        }while(row>30);
        do{
            System.out.print("Input number of col : ");
            col=cin.nextInt();
        }while(col>20);
        //input to array
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("array["+i+"]["+j+"]");
                array[i][j]=cin.nextInt();
            }
        }
        //output to array
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(+array[i][j]+" ");
            }
            System.out.println(" ");
        }
         
    }
}
