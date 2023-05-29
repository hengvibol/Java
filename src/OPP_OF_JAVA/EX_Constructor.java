package OPP_OF_JAVA;
class Test{
    private int x;
    private int y;
    private int z;
    // Defaul Constructor 
    public Test(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    // Constructor with Paramemter
    public Test(int a,int b,int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    private int sum(){
        return x+y+z;
    }
    private int  sub(){
        return x-y/z;
    }
    public void output(){
        System.out.print("X ="+x+"Y ="+y+"Z ="+"\n");
        System.out.println("Sum ="+sum());
        System.out.println("Sub ="+sub());
    }  
};
public class EX_Constructor {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.output();
        
    }          
};
