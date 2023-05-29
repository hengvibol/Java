package Polymorphism;
public interface Interface { // Interface class
    public void speak(); // Abstract method
    public void Read(); // Abstract method
}
class demo implements Interface{

    @Override
    public void speak() {
        System.out.println("I can speak khmer");
    }

    @Override
    public void Read() {
        System.out.println("I can read book");
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.speak();
        d.Read();
    }
}