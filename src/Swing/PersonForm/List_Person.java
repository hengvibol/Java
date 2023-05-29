package Swing.PersonForm;

import java.util.ArrayList;

public class List_Person {
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    private int id;
    private String name,gender;
    private int age;

    public List_Person(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    static ArrayList<List_Person> listperson = new ArrayList<>();
    
}
