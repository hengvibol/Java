package Loop_Of_Java;
import java.util.Scanner;
public class For_Each_05 {
    public static void main(String[] args) {
        int row, number=1, counter,j;
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter the number of row for floyd's triangle :");
        //Copying user input onto an variable named rows
        row = cin.nextInt();
        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for(counter =1;counter<=row;counter++){
            for(j=1;j<=counter;j++){
                System.out.print(number+" ");
                //Incremeting the number value
                number++;
            }
            //For new line
            System.out.println();
        }
        
    }
}
