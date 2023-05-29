package OPP_OF_JAVA;

import java.util.Scanner;

public class TEST_01 {
        //accessing of class
        //private,public,protected,defaulf
    //datamember
    private float x,y;
    
    
    //Function member
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input X : ");x=cin.nextFloat();
        System.out.print("Input Y : ");y=cin.nextFloat();
    }
    public float sum(){
        return(x+y);
    }
    public float sub(){
        return(x-y);
    }
    public float mul(){
        return(x*y);
    }
    public float div(){
        return(x/y);
    }
    
    
    public void Show(){
        System.out.println("Value X : "+x);
        System.out.println("Value Y : "+y);
        System.out.println("X + Y = "+sum());
        System.out.println("X - Y = "+sub());
        System.out.println("X * Y = "+mul());
        System.out.println("X / y ="+div());
    }
    public static void main(String[] args) {
        TEST_01 obj = new TEST_01();
        //TEST_01 obj;
        //obj = new TEST_01();
        obj.Input();
        obj.Show();
        
    }
}
