package Collection; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private int id;
    private String name ,Gender;
    private float Score;
    
    public int getId() {
        return id;
    }
    
    public void Student(){
        
    }
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID     = ");id=cin.nextInt();
        System.out.print("Input Name   = ");cin.nextLine();name=cin.nextLine();
        System.out.print("Input Gender = ");Gender=cin.next();
        System.out.print("Input Score  = ");Score=cin.nextFloat();
    }
    public static void Heander(){
        System.out.printf("%12s%14s%16s%15s\n","ID","NAME","GENDER","SCORE");
    }
    public void Output(){
        System.out.printf("%12d%14s%16s%15.2f\n", getId(),name,Gender,Score);
    }
}
class StudentDetail{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu = new Student();
        Scanner cin = new Scanner(System.in);
        int i,n,op;
        do{
            System.out.println("===M E N U===");
            System.out.println(" 1. Input");
            System.out.println(" 2. Output");
            System.out.println(" 3. search");
            System.out.println(" 4. Remove");
            System.out.println(" 5. Sort");
            System.out.println(" 6. Insert");
            System.out.println(" 7. Update");
            System.out.println(" 0. Exit");
            System.out.println("-------------");
            System.out.print(" Please choose one option : ");
            op=cin.nextInt(); 
            switch(op){
                case 1:{
                    System.out.print(" Input number of student : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("----- student["+(1+i)+"] -----");
                        stu = new Student();
                        stu.Input();
                        list.add(stu);
                    }
                }break;
                case 2:{
                    Student.Heander();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 3:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search : ");
                    svalue=cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(svalue==list.get(i).getId()){
                            Student.Heander();
                            list.get(i).Output();
                             b=true;     
                        }
                    }
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
                case 4:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search to remove : ");
                    svalue=cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(svalue==list.get(i).getId()){
                            list.remove(i);
                            b=true;
                            System.out.println("Remove successful.");
                        }
                    }
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
                case 5:{
                    Collections.sort(list,Comparator.comparing(Student::getId));
                    Student.Heander();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 6:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search to insert : ");
                    svalue=cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(svalue==list.get(i).getId()){
                            stu = new Student();
                            stu.Input();
                            list.add(i, stu);
                            b=true;
                            System.out.println("Insert successful.");
                            break;
                        }
                    }
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
                case 7:{
                    int svalue;
                    boolean b=false;
                    System.out.print("Input value for search : ");
                    svalue=cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(svalue==list.get(i).getId()){
                            stu = new Student();
                            stu.Input();
                           list.set(i, stu);
                           b=true;
                            System.out.println("Update successful.");
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
