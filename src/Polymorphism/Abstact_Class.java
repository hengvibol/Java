package Polymorphism;
public abstract class Abstact_Class { //Abstact Class
    private int a,b; // you can make datatype in abstact class
    public abstract void speak();//Abstract Method
    public abstract void Read();//Abstract Method
    public abstract int age();//Abstract Method
    
    public void show(){// you can make method in abstact class
        System.out.println("I can fly.");
    }
}
class Demo extends Abstact_Class {

    @Override
    public void speak() {
        System.out.println("I can speak.");
    }

    @Override
    public void Read() {
        System.out.println("I can read book");
    }

    @Override
    public int age() {
        return 10;
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.speak();
        d.Read();
        d.show();
        System.out.println(" Age = "+d.age());
    }
 
}
