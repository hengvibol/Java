package Loop_Of_Java;
public class While_Loop_01 {
    public static void main(String[] args) {
        int i;
        System.out.println("Form Incremental Loop");
        i=1;
        while(i<=10){
            System.out.print(" "+i);
            i++;
        }
        System.out.println(" ");
        i=10;
        while(i>=1){
           System.out.print(" "+i);
           i--;
        }
    }
}
