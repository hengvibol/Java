package HashTable;
import Function.Conver_code;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class BOOKSHOP {
    private String word;
    private String speech;
    private String descrition;
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Work       = ");word=cin.nextLine();
        System.out.print("Input Speech     = ");speech=cin.nextLine();
        System.out.print("Input Descrition = ");descrition=cin.nextLine();
    }
    public static void Header(){
        System.out.printf("%14s%16s%20s\n","WORK","SPEECH","DESCRITION");
    }
    public void Output(){
        System.out.printf("%14s%16s%20s\n",word,speech,descrition);
    }
    public static void main(String[] args) {
        Hashtable<Integer,BOOKSHOP> bk = new Hashtable<>();
        BOOKSHOP bs = new BOOKSHOP();
        Scanner cin = new Scanner(System.in);
        int i,n,op;
        do{
            System.out.println("=====[MENU]=====");
            System.out.println(" 1.Input");
            System.out.println(" 2.Output");
            System.out.println(" 3.Search");
            System.out.println(" 4.Update");
            System.out.println(" 0.Exit");
            System.out.print("Please one option : ");
            op=cin.nextInt();
            switch(op){
                case 1:{
                    System.out.print("Input number bookshop : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("____BOOK ["+(i+1)+"]____");
                        bs = new BOOKSHOP(); 
                        bs.Input();
                        bk.put(i, bs);
                    }
                }break;
                case 2:{
                    BOOKSHOP.Header();
                   for(Map.Entry<Integer,BOOKSHOP> temp : bk.entrySet()){
                       temp.getValue().Output();
                   } 
                }break;
                case 3:{
                     boolean b=false;
                    String swork;
                    System.out.print("Input book's word for search : ");
                    swork=cin.next();
                    for(Map.Entry<Integer,BOOKSHOP> temp : bk.entrySet()){
                        if(swork.equalsIgnoreCase(temp.getValue().word)){
                            BOOKSHOP.Header();
                            temp.getValue().Output();
                            b=true;
                        }
                     }
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
                case 4:{
                    for(Map.Entry<Integer,BOOKSHOP> temp : bk.entrySet()){
                        System.out.print("Key : "+temp.getKey()+" ");
                        temp.getValue().Output();
                    }
                    
                    boolean b=false;
                    String sword;
                    System.out.print("Input book's word for search : ");
                    sword=cin.next();
                    for(Map.Entry<Integer,BOOKSHOP> temp : bk.entrySet()){
                        if(sword.equalsIgnoreCase(temp.getValue().word)){
                            BOOKSHOP.Header();
                            bs.Input();
                            //bk.put(,bs);
                            b=true;
                        }
                     }
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
            }
        }while(op!=0);
    }
}
