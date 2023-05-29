package Loop_Of_Java;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class EXERCISE_02 {
    public static void main(String[] args) {
        int n,i,op;
        Scanner sc=new Scanner(System.in);   
        do{
            System.out.println("\n_____MENU______");
            System.out.println("1). 1+2+3+...+n");
            System.out.println("2). 2+4+6+...+(2n)");
            System.out.println("3). 2+5+8+...+(3n-1)");
            System.out.println("4). 1*2*3*...*n");
            System.out.println("5). pow(1,2)+pow(2,2)+pow(3,2)+...+pow(n,2)");
            System.out.println("6). pow(2,3)+pow(4,3)+pow(6,3)+...+pow2n,3)");
            System.out.println("7). sqrt(1)+sqrt(2)+sqrt(3)+...+sqrt(n)");
            System.out.println("8). sqrt(2)+sqrt(4)+sqrt(6)+...+sqrt(2n)");
            System.out.println("9). sin(0)+sin(1)+sin(2)+...+sin(n)");
            System.out.println("10). cos(0)+cos(1)+cos(2)+...+cos(n)");
            System.out.println("11). 1!+2!+3!+...+n!");
            System.out.println("0). Exit");
            System.out.print("Choose your option = ");op=sc.nextInt();
            switch(op){
                case 1:{
                    int sum=0;
                    System.out.println("1). 1+2+3+...+n");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=1;i<=n;i++){
                        sum+=i;
                        System.out.print(i+" + ");
                    }
                    System.out.print("\b\b= "+sum);
                }break;
                case 2:{
                    int sum=0;
                    System.out.println("2). 2+4+6+...+(2n)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=2;i<=2*n;i++){
                        sum+=i;
                        System.out.print(i+" + ");
                    }
                    System.out.print("\b\b= "+sum);
                }break;
                case 3:{
                    int sum=0;
                    System.out.println("3). 2+5+8+...+(3n-1)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=2;i<=3*n-1;i+=3){
                        sum+=i;
                        System.out.print(i+" + ");
                    }
                    System.out.print("\b\b= "+sum);
                }break;
                case 4:{
                    int mult=1;
                    System.out.println("4). 1*2*3*...*n");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=1;i<=n;i++){
                        mult*=i;
                        System.out.print(i+" + ");
                    }
                    System.out.print("\b\b= "+mult);
                }break;
                case 5:{
                    int sum=0;
                    System.out.println("5). pow(1,2)+pow(2,2)+pow(3,2)+...+pow(n,2)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=1;i<=n;i++){
                        sum+=pow(i,2);
                        System.out.print("pow"+"("+i+")"+"+");
                    }
                    System.out.print("\b= "+sum);
                }break;
                case 6:{
                   int sum=0;
                    System.out.println("6). pow(2,3)+pow(4,3)+pow(6,3)+...+pow2n,3)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=2;i<=2*n;i+=2){
                        sum+=pow(i,3);
                        System.out.print("pow("+i+",2)"+"+");
                    }
                    System.out.print("\b= "+sum); 
                }break;
                case 7:{
                    int sum=0;
                    System.out.println("7). sqrt(1)+sqrt(2)+sqrt(3)+...+sqrt(n)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=1;i<=n;i++){
                        sum+=sqrt(i);
                        System.out.print("sqrt"+"("+i+")"+"+");
                    }
                    System.out.print("\b= "+sum);
                }break;
                case 8:{
                    int sum=0;
                    System.out.println("8). sqrt(2)+sqrt(4)+sqrt(6)+...+sqrt(2n)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=2;i<=2*n;i+=2){
                        sum+=sqrt(i);
                       System.out.print("sqrt"+"("+i+")"+"+"); 
                    }
                    System.out.print("\b= "+sum);
                }break;
                case 9:{
                    float sum=0;
                    System.out.println("9). sin(0)+sin(1)+sin(2)+...+sin(n)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=0;i<=n;i++){
                        sum+=sin(i);
                        System.out.print("sin"+"("+i+")"+"+");
                    }
                    System.out.print("\b= "+sum);
                }break;
                case 10:{
                    float sum=0;
                    System.out.println("10). cos(0)+cos(1)+cos(2)+...+cos(n)");
                    System.out.print("Input n = ");n=sc.nextInt();
                    for(i=0;i<=n;i++){
                        sum+=cos(i);
                        System.out.print("cos"+"("+i+")"+"+");
                    }
                    System.out.print("\b= "+sum);
                }break;
                case 11:{
                    int sum=0;
                  System.out.println("11). 1!+2!+3!+...+n!");  
                  System.out.print("Input n = ");n=sc.nextInt();
                  for(i=1;i<=n;i++){
                      int fact=1;
                      for(int j=1;j<=i;j++){ 
                          fact=fact*j;
                      }
                      sum=sum+fact;
                      System.out.print(+i+"!"+"+");
                  }
                  System.out.print("\b= "+sum);                
                }
            }
        }while(op!=0); 
    }
}
      