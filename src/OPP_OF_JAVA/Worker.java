package OPP_OF_JAVA;

import java.util.Scanner;

public class Worker {
    private int id,hour;
    private String name,gender;
    private float salary,rate;
    
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.println("_____INFORMATION_____\n");
        System.out.print("Enter ID    = ");id=cin.nextInt();
        System.out.print("Enter Name  = ");cin.nextLine();name=cin.nextLine();
        System.out.print("Enter Gender= ");gender=cin.next();
        System.out.print("Enter Salary= ");salary=cin.nextFloat();
        System.out.print("Enter Hour  = ");hour=cin.nextInt();
        System.out.print("Enter Rate  = ");rate=cin.nextFloat();
    }
    public float Incone(){
        return (salary+(hour*rate));
        
    }
    public static void Header(){
        System.out.printf("%12s%14s%16s%16s%14s%14s\n","ID","Name","Gender","Salary","Hour","Rate","Incone");
    }
    public void output(){
        System.out.printf("%12d%14s%16s%16.2f%14d%14.2f\n",id,name,gender,salary,hour,rate);
    }
    
    
}
class workerdatail{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Worker wo[] = new Worker[100];
        int i,n=0,op;
        do{
            System.out.println("=====M E N U======");
            System.out.println("1.Input");
            System.out.println("2.Output");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.println("------------------");
            System.out.print("Pleas choose one option =");
            op=cin.nextInt();
            switch(op){
                case 1 -> {
                    System.out.print("Input number of worker : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        //System.out.println("-----Worker{"+(i+1)+"}-------");
                        wo[i] = new Worker();
                        wo[i].Input();
                    }
                }
                case 2 -> {
                    Worker.Header();
                    for(i=0;i<n;i++){
                       //System.out.println("-----Worker{"+(i+1)+"}-------");
                       wo[i].output();
                    }
                }
                case 3 -> {
                    int sid;
                    boolean b=false;
                    System.out.print("Input Worker's id for search : ");
                    sid=cin.nextInt();
                    for(i=0;i<n;i++){
                        if(sid==wo[i].getID()){
                        Worker.Header();
                        wo[i].output();
                        b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Search id not found...!");
                    }
                }
                case 4 -> {
                    String sname,uname;
                    int uid,op1;
                    boolean b=false;
                    System.out.print("Input worker's name for search to update : ");
                    cin.nextLine();sname=cin.nextLine();
                    for(i=0;i<n;i++){
                        if(sname.equalsIgnoreCase(wo[i].getName())){
                            do{
                                System.out.println("======Update worker=======");
                                System.out.println("1.Update ID");
                                System.out.println("2.Update Name");
                                System.out.println("3.Exit program");
                                System.out.println("--------------------------");
                                System.out.print("Please choose one option : ");
                                op1=cin.nextInt();
                                switch(op1){
                                    case 1 -> {
                                        System.out.print("Input id for update : ");
                                        uid=cin.nextInt();
                                        wo[i].setID(uid);
                                        System.out.println("Update id successful.");
                                        
                                    }
                                    case 2 -> {
                                        System.out.print("Input name for update : ");
                                       cin.nextLine();uname=cin.nextLine();
                                       wo[i].setName(uname);
                                       System.out.println("Update name successful.");
                                    }                                }
                                        
                            }while(op!=3);
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("search name not found.");
                    }
                }
            }
        }while(op!=5);
        
    }
            
}
