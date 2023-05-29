package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Switch_ArrayList {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        int i,n,op;
        float value = 0;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("\n====M E N U=====");
            System.out.println("1.Add");
            System.out.println("2.Get");
            System.out.println("3.Search");
            System.out.println("4.Set");
            System.out.println("5.Remove");
            System.out.println("6.Sort");
            System.out.println("7.Find the maximum number");
            System.out.println("8.Find the minimum number");
            System.out.println("0.Exit");
            System.out.print("Please choose one option : ");
            op=cin.nextInt();
            switch(op){
                case 1 :{
                    System.out.print("Input element of arrylist : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("Input Value : ");
                        value=cin.nextFloat();
                        list.add(value);
                    }
                }break;
                case 2 :{
                    for(i=0;i<list.size();i++){
                        System.out.print("\t"+list.get(i));
                    }
                }break;
                case 3 :{
                    float svalue;
                    System.out.print("Input value for search : "); 
                    svalue=cin.nextFloat();
                   boolean b = list.contains(svalue);
                   if(b){
                        System.out.print(" Value = "+svalue+"is search found.");
                   }else{
                        System.out.print(" Value = "+svalue+"is search not found.");
                   }
                            
                }break;
                case 4 :{
                    float svalue,uvalue;
                    boolean b = false;
                    System.out.print("Input value for search to update : ");
                    svalue=cin.nextFloat();
                    for(i=0;i<list.size();i++){
                        if(svalue==list.get(i)){
                            System.out.print("Input value for update : ");
                            uvalue=cin.nextFloat();
                            list.set(i, value);
                            System.out.println("Update successful.");
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("search not found...!");
                    }
                }break;
                case 5 :{
                    float svalue;
                    boolean b = false;
                    System.out.print("Input value for search to remove : ");
                    svalue=cin.nextFloat();
                    for(i=0;i<list.size();i++){
                        if(svalue==list.get(i)){
                            list.remove(i); 
                            b=true;
                        }
                        System.out.println("Remove successful.");
                    }
                    if(b==false){
                        System.out.println("Search value not found..!");
                    }
                }break;
                case 6 :{
                    Collections.sort(list);
                    //Collections.sort(list,Collections.reverseOrder());
                }break;
                case 7 :{
                    System.out.println("Maximum number is : "+Collections.max(list));
                }break;
                case 8 :{
                    System.out.println("Minimum number is : "+Collections.min(list));
                }break;
            }
        }while(op!=0);
        
    }
}
