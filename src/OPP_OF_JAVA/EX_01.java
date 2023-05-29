package OPP_OF_JAVA;

import java.util.Scanner;

public class EX_01 {
    private int x;
    private int y;
    private int z;
    
    public void input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input value X = ");
        x=cin.nextInt();
        System.out.print("Input value Y = ");
        y=cin.nextInt();
        System.out.print("Input value Z = ");
        z=cin.nextInt();
    }
    private int sum(){
        return x+y+z;
    }
    private int sub(){
        return x-y/z;
    }
    public void output(){
        System.out.print("X ="+x+"Y ="+y+"Z ="+"\n");
        System.out.println("Sum ="+sum());
        System.out.println("Sub ="+sub());
    }
    
    public static void main(String[] args) {
        EX_01 obj = new EX_01();
        obj.input();
        obj.output();
        
    }
}
