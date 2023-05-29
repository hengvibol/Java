package Function;

import java.util.Scanner;

public class Conver_code {
    void converDecimalToBinary(int decimal){
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal = "+decimal+" Conver to binary = "+binary);
        
    }
    void converBinaryToDecimal(String binary){
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Binary = "+binary+" Conver to Dicimal = "+decimal);
                
    }
    public Conver_code(){
        //Conver Decimal to Binary 
        int decimal;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Decimal number = ");decimal=cin.nextInt();
        converDecimalToBinary(decimal);
        
        //Conver Binary to Decimal
        String binary;
        System.out.print("Input Binary number = ");binary=cin.next();
        converBinaryToDecimal(binary); 
        
    }
    public static void main(String[] args) {
        new Conver_code();
    }
    
}
