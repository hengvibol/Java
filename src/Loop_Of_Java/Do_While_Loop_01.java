package Loop_Of_Java;
public class Do_While_Loop_01 {
    public static void main(String[] args) {
        int i;
        System.out.println("Form Incremental Loop");
        i=1;
        do{
            System.out.print(" "+i);
            i++;
        }while(i<=10);
        System.out.println("");
        i=10;
        do{
            System.out.print(" "+i);
            i--;
        }while(i>=1);
    }   
}
