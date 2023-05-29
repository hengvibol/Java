package Loop_Of_Java;

import java.util.Random;

public class For_Each_02 {
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        System.out.println("Random Numbers :");
        System.out.println("**************");
        for(counter = 1;counter <= 20; counter++){
            System.out.println(rnum.nextInt(200));
        }
    }
}
