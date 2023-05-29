package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name,gender,position; 
    private float salary;
    
    public Employee(){
        
    }
    public int getId() {
       return id;
    }
    public float getSalary(){
        return salary;
    }
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID       = ");
        id=cin.nextInt();
        System.out.print("Input Name     = ");
        cin.nextLine();name=cin.nextLine();
        System.out.print("Input Gender   = ");
        gender=cin.next();
        System.out.print("Input Position = ");
        cin.nextLine();position=cin.nextLine();
        System.out.print("Input Salary   = ");
        salary=cin.nextFloat();
    }
    public static void Header(){
        System.out.printf("%12s%14s%16s%18s%16s\n","ID","NAME","GENDER","POSITION","SALRY");  
    }   
    public void Output(){
        System.out.printf("%12d%14s%16s%18s%16.2f$\n", getId(),name,gender,position,salary);
    }
    public int Search(ArrayList<Employee> list, int size){
        Scanner cin = new Scanner(System.in);
        int sid,index=-1;
        System.out.print("Input Employee's id for search : ");sid=cin.nextInt();
        for(int i=0;i<size;i++){
            if(sid==list.get(i).getId()){
                index=i;
            }
        }       
                
        return index;
    }
}

class EmployeeDetail{
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee Em = new Employee();
        Scanner cin = new Scanner(System.in);
        int i,n,op;
        do{
            System.out.println("===M E N U===");
            System.out.println(" 1. Input  Employees");
            System.out.println(" 2. Output Employees");
            System.out.println(" 3. search Employees");
            System.out.println(" 4. Remove Employees");
            System.out.println(" 5. Sort   Employees");
            System.out.println(" 6. Insert Employees");
            System.out.println(" 7. Update Employees");
            System.out.println(" 8. Maximum Employees");
            System.out.println(" 9. Minimum Employees");
            System.out.println(" 10.Same salry Employees");
            System.out.println(" 0. Exit");
            System.out.println("-------------");
            System.out.print(" Please choose one option : ");
            op=cin.nextInt();
            switch(op){
                case 1:{
                    System.out.print(" Input number of employee : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("----- Employee["+(1+i)+"] -----");
                        Em = new Employee();
                        Em.Input();
                        list.add(Em);
                    }
                }break;
                case 2:{
                    Employee.Header();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 3:{
                    int index=Em.Search(list,list.size());
                    if(index==-1){
                        System.out.println("Search not foun..!");
                    }else{
                        Employee.Header();
                        list.get(index).Output();
                    }
                }break;
                case 4:{
                    int index=Em.Search(list,list.size());
                    if(index==-1){
                        System.out.println("Search not foun..!");
                    }else{
                        list.remove(index);
                        System.out.println("Remove succesful.");
                    }
                }break;
                case 5:{
                    Collections.sort(list,Comparator.comparing(Employee::getId));
                    Employee.Header();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 6:{
                    int index=Em.Search(list,list.size());
                    if(index==-1){
                        System.out.println("Search not foun..!");
                    }else{
                        Em = new Employee();
                        Em.Input();
                        list.add(index, Em);
                        System.out.println("Insert successful.");
                    }
                }break;
                case 7:{
                    int index=Em.Search(list,list.size());
                    if(index==-1){
                        System.out.println("Search not foun..!");
                    }else{
                        Em = new Employee();
                        Em.Input();
                        list.set(index, Em);
                        System.out.println("Add successful.");
                    }
                }break;
                case 8:{                    
                   Employee Emp = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
                   Employee.Header();
                   for(i=0;i<list.size();i++){
                           if(list.get(i).getSalary()==Em.getSalary()){
                            list.get(i).Output();
                           }                      
                   }
                   
                }break;
                case 9:{
                   Employee Emp = list.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
                   Employee.Header();
                   for(i=0;i<list.size();i++){
                       if(list.get(i).getSalary()==Em.getSalary()){
                         list.get(i).Output();
                       }                      
                   } 
                }break;
                case 10:{
                    Employee.Header();
                    for(i=0;i<list.size();i++){
                        for(int j=i+1;j<list.size();j++){
                            if(list.get(i).getSalary()==list.get(j).getSalary()){
                                list.get(i).Output();
                                list.get(j).Output();
                            }
                        }
                    }
                }
                
            }//end switch
        }while(op!=0);
    }
}
