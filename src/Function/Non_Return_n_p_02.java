package Function;
public class Non_Return_n_p_02 {
    int a=300,b=200;
    void sum(){
        System.out.println("A + B ="+(a+b));
    }
    void sub(){
        System.out.println("A - B ="+(a-b));
    }
    void mul(){
        System.out.println("A * B ="+(a*b));
    }
    void div(){
        System.out.println("A / B ="+(a/b));
    }
    public Non_Return_n_p_02(){
        sum();
        sub();
        mul();
        div();
    }
    public static void main(String[] args) {
        new Non_Return_n_p_02();
    }
}
