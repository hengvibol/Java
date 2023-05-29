package Function;
public class Ex_Function {
    // Non Return Functoin(No Parameter)
    void sum(){
        int a1=100,b1=200;
        System.out.println("A1 + B1 = "+(a1+b1));
    }
    // Non Return Functoin(Has Parameter)
    void sum2(int a2,int b2){
        System.out.println("A2 + B2 = "+(a2+b2));
    }
    //Return Functoin(No Parameter)
    int sum3(){
        int a3=100,b3=200;
        return a3+b3;
    }
    //Return Functoin(Has Parameter)
    int sum4(int a4,int b4){
        return a4+b4;
    }
    public Ex_Function(){
        sum();
        sum2(100,200);
        System.out.println("A3 + B3 = "+sum3());
        System.out.println("A4 + B4 = "+sum4(100,300));
        
    }
    public static void main(String[] args) {
        new Ex_Function();
    }
}
