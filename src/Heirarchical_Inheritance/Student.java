package Heirarchical_Inheritance;

import java.util.Scanner;

public class Student extends Person{
    private String SchoolName,ClassName;
    private int year;
    
    
    public int getId(){
        return id;
    }
    public Student(){
        super();
        SchoolName="RUPP";
        ClassName="A9";
        year=2;
        
    }

    public Student(int id,String name,String gender,int age,String SchoolName, String ClassName, int year) {
        super(id, name, gender, age);
        this.SchoolName = SchoolName;
        this.ClassName = ClassName;
        this.year = year;
    }
    @Override
    public void Input(){
        super.Input();
        Scanner cin = new Scanner(System.in);
        System.out.print("Input School Name : ");SchoolName=cin.nextLine();
        System.out.print("Input Class Name  : ");ClassName=cin.next();
        System.out.print("Input Year        : ");year=cin.nextInt();
    }
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%21s%19s%14s\n","SCHOOL NAME","CLASS NAME","YEAR");
    }
    @Override
    public void Output(){
        super.Output();
        System.out.printf("%21s%19s%14d\n",SchoolName,ClassName,year);
    }
            
}
class DemoStudent{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Student st[] = new Student[100];
        Student h = new Student();
        int op,n = 0;
        do{
            System.out.println("=======[ M E N U ]=======");
            System.out.println(" 1.Input Student");  
            System.out.println(" 2.Output Student");
            System.out.println(" 3.Defualt Constructor");
            System.out.println(" 4.Constructor With Parameter");
            System.out.println(" 5.Search Student");
            System.out.println(" 0.Exit Program");
            System.out.println("<<<<<<<<<<<<->>>>>>>>>>>>>");
            System.out.print("Please choose one option : ");op=cin.nextInt();
            switch(op){
                case 1:{
                    System.out.print("Input number of student : ");n=cin.nextInt();
                    for(int i=0;i<n;i++){
                        st[i] = new Student();
                        st[i].Input();
                    }
                }break;
                case 2:{
                    h.Header();
                    for(int i=0;i<n;i++){
                        st[i].Output();
                    }
                }break;
                case 3:{
                    h.Header();
                    Student st1 = new Student();
                    st1.Output();
                }break;
                case 4:{
                    h.Header();
                    Student st2 = new Student(1002,"BOL","Male",21,"SETEC","A9",2);
                    st2.Output();
                }break;
                case 5:{
                    int sid;
                    System.out.print("Input ID for to search : ");sid=cin.nextInt();
                    h.Header();
                    for(int i=0;i<n;i++){
                        if(sid==st[i].getId()){
                            st[i].Output();
                        }
                    }
                }break;
            }
        }while(op!=0);
    }
}


