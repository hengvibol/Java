package Loop_Of_Java;

import java.util.Scanner;

public class For_Each_06 {
    public static void main(String[] args) {
        boolean isvowel = false;
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=cin.next().charAt(0);
        cin.close();
        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isvowel = true;  
        }
        if(isvowel==true){
            System.out.println(ch+" is a vowel");
        }else{
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println(ch+" is a consonat");
            }else{
                System.out.println("Input is not an alphabet.");
                }   
        }              
    }
}
