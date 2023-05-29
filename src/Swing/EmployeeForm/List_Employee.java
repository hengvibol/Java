package Swing.EmployeeForm;

import java.util.ArrayList;

public class List_Employee {

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getPosition() {
        return position;
    }
    public String getAddress() {
        return address;
    }
    public float getSalary() {
        return salary;
    }
    private int id;
    private String name,gender,position,address;
    private float salary;

    public List_Employee(int id, String name, String gender, String position, String address, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }
    static ArrayList<List_Employee> listemployee = new ArrayList<>();
    
}
