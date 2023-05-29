package Function;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_Function_01 {
    DecimalFormat df = new DecimalFormat("###0.00");
    int code,qty,dis;
    String name;
    float price;
    void Input(){
       Scanner cin = new Scanner(System.in);
        System.out.print("Enter Code   = ");code=cin.nextInt();
        System.out.print("Enter Name   = ");cin.nextLine();name=cin.nextLine();
        System.out.print("Enter QTY    = ");qty=cin.nextInt();
        System.out.print("Enter Price  = ");price=cin.nextFloat();
    }
    double Total(){
        
        return  qty*price;
    }
    int Discoun(){
        if(Total()>=1&&Total()<=10){
           dis =10;
        }else if(Total()>=10&&Total()<=20){
            dis=20;
        }else if(Total()>=20&&Total()<=30){
            dis=30;
        }else if(Total()>=30&&Total()<=40){
            dis = 40;
        }else if(Total()>=40&&Total()<=50){
            dis =50;
        }else{
            dis=60;
        }
        return dis;
    }
    
    double Payment(){
      return Total()-(Total()* Discoun()/100);  
    }
    void Output(){
        System.out.println("_________INFORMATION________");
        System.out.println("Your Code    = "+code);
        System.out.println("Your Name    = "+name);
        System.out.println("Your QTY     = "+qty);
        System.out.println("Your Price   = "+price);
        System.out.println("Your Dis     = "+Discoun());
        System.out.println("Your Total   = "+ df.format(Total())+"$");
        System.out.println("Your Payment = "+df.format(Payment())+"$");
         
    }
    public Ex_Function_01(){
        Input();
        Output();
        
    }
    public static void main(String[] args) {
        new Ex_Function_01();
    }
}
