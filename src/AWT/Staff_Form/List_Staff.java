package AWT.Staff_Form;

import java.util.ArrayList;

public class List_Staff {
    private int id;
    private String name,gender,position,address,phone;
    private float salary;
        public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getPhone() {
        return phone;
    }
    public float getSalary() {
        return salary;
    }

    public List_Staff(int id, String name, String gender, String position, String address, String phone, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }
    static ArrayList<List_Staff> list = new ArrayList<>();
    
}
