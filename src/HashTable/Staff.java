package HashTable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Staff {
    private int id;
    private String name,gender,pusition;
    private float salary;
    
    public int getId(){
        return id;
    }
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID       = ");id=cin.nextInt();
        System.out.print("Input Name     = ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input Gender   = ");gender=cin.next();
        System.out.print("Input Pusition = ");pusition=cin.next();
        System.out.print("Input salary   = ");salary=cin.nextFloat();
    }
    public static void Header(){
        System.out.printf("%12s%14s%16s%18s%16s\n","ID","NAME","GENDER","PUSITION","SALARY");
    }
    public void Output(){
        System.out.printf("%12d%14s%16s%18s%16.2f$\n",id,name,gender,pusition,salary);
    }
}
class DemoSaff{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Hashtable<Integer,Staff> obj = new Hashtable<>();
        Staff sf = new Staff();
        int i,op,n = 0;
        do{
            System.out.println("=====M E N U=====");
            System.out.println(" 1.Input  Staff");
            System.out.println(" 2.Output Staff");
            System.out.println(" 3.Search Staff");
            System.out.println(" 4.Udate  Staff");
            System.out.println(" 5.Remove Staff");
            System.out.println(" 0.Exit Program");
            System.out.println("-----------------");
            System.out.print("Please choose one option :");
            op=cin.nextInt();
            switch(op){
                case  1:{
                    System.out.print("Input number Staff : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("____Staff ["+(i+1)+"]____");
                        sf = new Staff(); 
                        sf.Input();
                        obj.put(i, sf);
                    }
                    
                }break;
                case  2:{
                    Staff.Header();
                    for(Map.Entry<Integer,Staff> temp : obj.entrySet()){
                        temp.getValue().Output();
                    }
                    
                }break;
                case  3:{
                    boolean b=false;
                    int sid;
                    System.out.print("Input staff's id for search : ");
                    sid=cin.nextInt();
                    for(Map.Entry<Integer,Staff> temp : obj.entrySet()){
                        if(sid==temp.getValue().getId()){
                            Staff.Header();
                            temp.getValue().Output();
                            b=true;
                        }
                     }
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
                case  4:{
                    for(Map.Entry<Integer,Staff> temp : obj.entrySet()){
                        System.out.print("Key : "+temp.getKey()+" ");
                        temp.getValue().Output();
                    }
                    int skey;
                    boolean b=false;
                    System.out.print("Input key for remove : ");
                    skey=cin.nextInt();
                    for(Map.Entry<Integer,Staff> temp : obj.entrySet()){
                        if(skey==temp.getKey()){
                            sf = new Staff();
                            sf.Input();
                            obj.put(skey, sf);
                            b=true;
                            System.out.println("Update successful.");
                        }
                    }
                    if(b==false){
                        System.out.println("search not found...!");
                    }
                }break;
                case  5:{
                    for(Map.Entry<Integer,Staff> temp : obj.entrySet()){
                        System.out.print("Key : "+temp.getKey()+" ");
                        temp.getValue().Output();
                    }
                    int skey;
                    boolean b=false;
                    System.out.print("Input key for remove : ");
                    skey=cin.nextInt();
                    for(Map.Entry<Integer,Staff> temp : obj.entrySet()){
                        if(skey==temp.getKey()){
                            obj.remove(skey);
                            b=true;
                            System.out.println("Remove successful.");
                        }
                    }
                    if(b==false){
                        System.out.println("search not found...!");
                    }
                }break;
                
            }//end switch
    }while(op!=0);
    }
}
