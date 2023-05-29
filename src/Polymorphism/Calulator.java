package Polymorphism;
public class Calulator { //Method Ovrerloading
    public void Sum(int a,int b){
        System.out.println("A + B = "+(a+b));
    }
    public void Sum(int a,float c, int b){
        System.out.println("A + C + B = "+(a+c+b));
    }
    public void Sum(float a,float b){
        System.out.println("A + B = "+(a+b));
    }
    public int Sum(int a, int b,int c){
        return(a+b+c);
    }
    public static void main(String[] args) {
        Calulator c = new Calulator();
        c.Sum(10, 20);
        c.Sum(14.2f, 23.3f);
        c.Sum(10, 12.33f, 12);
        System.out.println("A + B + C = "+c.Sum(10, 20, 30));
    }
}
