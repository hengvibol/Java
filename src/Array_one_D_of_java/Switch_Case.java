package Array_one_D_of_java;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int array[]= new int [50];
        int n = 0,op;
        Scanner cin=new Scanner(System.in);
        do{
            System.out.println("\n_____M E N U______");
            System.out.println("1.>>Inout");
            System.out.println("2.>>Output");
            System.out.println("3.>>Search");
            System.out.println("4.>>Update");
            System.out.println("5.>>Dalete");
            System.out.println("6.>>Insert");
            System.out.println("7.>>Sort");
            System.out.println("8.>>Add");
            System.out.println("9.>>Exit");
            System.out.print("chose one option :");
            op=cin.nextInt();
            switch(op){
                case 1:{
                    do{
                        System.out.print("Input element of array =");
                        n=cin.nextInt();
                        if(n>50)
                            System.out.println("Please input element under 50...!");
                    }while(n>50);
                    for(int i=0;i<n;i++){
                        System.out.print("Input array["+i+"]=");
                        array[i]=cin.nextInt();
                    }
                }break;
                case 2:{
                    for(int i=0;i<n; i++){
                        System.out.print(" "+array[i]);
                    }
                }break;
                case 3:{
                    int svalue;
                    boolean b=false;
                    System.out.print("input value for search =");
                    svalue=cin.nextInt();
                    for(int i=0;i<n;i++){
                        if(svalue==array[i]){
                            System.out.println("Value = "+svalue+"is search found.");
                            b=true;
                        }
                            }
                        if(b==false){
                            System.out.println("Value = "+svalue+"is search not found...!");
                        }
                }break;
                case 4:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search to update =");
                    svalue=cin.nextInt();
                    for(int i=0;i<n;i++){
                        if(svalue==array[i]){
                            System.out.print("Input value for update =");
                            array[i]=cin.nextInt();
                            System.out.println("update successful.");
                            b=true;
                            
                        }
                    }
                    if(b==false){
                        System.out.println("Value ="+svalue+"is search not found...!");
                    }
                }break;
                case 5:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search to delete = ");
                    svalue=cin.nextInt();
                    for(int i=0;i<n;i++){
                        if(svalue==array[i]){
                            for(int j=i;j<n;j++){
                                array[j]=array[j+1];   
                            }
                        }
                        n--;
                        b=true;
                        System.out.println("delet successful.");
                    }
                    if(b==false){
                        System.out.println("value = "+svalue+"is not found...!");
                    }
                }break;
                case 6:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search to insert = ");
                    svalue=cin.nextInt();
                    for(int i=0;i<n;i++){
                        if(svalue==array[i]){
                            for(int j=n;j>i;j--){
                                array[j]=array[j-1];   
                            }
                            n++;
                            System.out.print("Input value for insert =");
                            array[i]=cin.nextInt();                       
                            System.out.println("insert successful.");
                            b=true;
                            break;
                        }  
                    }
                    if(b==false){
                        System.out.println("value = "+svalue+"is not found...!");
                    }  
                }break;
                case 7:{
                    int temp;
                    for(int i=0;i<n;i++){
                        for(int j=i+1;j<n;j++){
                            if(array[i]>array[j]){
                                temp=array[i];
                                array[i]=array[j];
                                array[j]=temp;
                            }
                        }
                        System.out.print(" "+array[i]);
                    }
                }break;
                case 8:{
                    int m;
                    System.out.print("Input element of array to add =");
                    m=cin.nextInt();
                    for(int i=n;i<n+m;i++){
                        System.out.print("Input array["+i+"]=");
                        array[i]=cin.nextInt();
                    }
                    n+=m;
                    System.out.println("add successful.");
                }break;
                case 9:{
                    System.out.println("You select exit program...!");
                }break;
            }
        }while(op!=9);
    }
}
