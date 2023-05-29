package Polymorphism;
import static java.lang.Math.pow;
public class Area { // constructor Overloading
    public Area(){
        
    }
    public Area(int r){ // Circle
        System.out.println("Area of cirfcle = "+3.14*pow(r,2));
    }
    public Area(float l,float b){
        System.out.println("Area of Rectagle = "+(l*b)+"cm^2");
    }public Area(float a){
            System.out.println("Area of Squarre = "+pow(a,2));
    }
    public static void main(String[] args) {
        Area a = new Area(10);
        Area a1 = new Area(2.3f,4.3f);
        Area a2 = new Area(3.3f);
        
    }
    
}
