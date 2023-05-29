package Polymorphism;
public class Method_Overriding { // Method Overriding
    public void show(){
        System.out.println("I can fly.");
    }
    public void Speak(String title){
        System.out.println("I can speak."+title);
    }
}
class Test extends Method_Overriding{
    @Override
    public void show(){
        super.show();
        System.out.println("I can run.");
    }
    public void speak(String title){
        System.out.println("I can speak khmer.");
    }
    public static void main(String[] args) {
        Test t =new Test();
        t.show();
        t.Speak("Japan");
    }
}

