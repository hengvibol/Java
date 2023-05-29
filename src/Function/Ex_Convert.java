package Function;

import java.util.Scanner;

public class Ex_Convert {
    void ConvertDecimalToBinary(int decimal){
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal = "+decimal+" Convert to Binary = "+binary);
    }
    void ConvertBinaryToDecimal(String binary){
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Binary = "+binary+" Convert to Decimal = "+decimal);
    }
    public Ex_Convert(){
        int decimal;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Decimal Number = ");decimal=cin.nextInt();
        ConvertDecimalToBinary(decimal);
        String binary;
        System.out.print("Input Binary Number = ");binary=cin.next();
        ConvertBinaryToDecimal(binary);
    }
    public static void main(String[] args) {
        new Ex_Convert();
    }
}
