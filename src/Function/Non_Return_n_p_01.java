package Function;
public class Non_Return_n_p_01 {
    //Non Return function (non patameter
    void Hello(){
        System.out.println("Hello Mr.Meng.");
        System.out.println("How are you?");
    }
    void speak(){
        System.out.println("I can speak English.");
        System.out.println("I can speak Engkish.");
    }
    //Default constructor
    public Non_Return_n_p_01(){
        Hello();
        speak();
    }
    public static void main(String[] args) {
        //call Default constructor
        new Non_Return_n_p_01();
    }
}
