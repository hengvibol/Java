package AWT.Student_Form;

import java.util.ArrayList;

public class List_Student {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return the grad
     */
    public String getGrad() {
        return grade;
    }

    /**
     * @return the cpp
     */
    public float getCpp() {
        return cpp;
    }

    /**
     * @return the java
     */
    public float getJava() {
        return java;
    }

    /**
     * @return the fluter
     */
    public float getFluter() {
        return fluter;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @return the average
     */
    public double getAverage() {
        return average;
    }
    
    private int id;
    private String name,gender,grade;
    private float cpp,java,fluter;
    private double total;
    private double average;

    public List_Student(int id, String name, String gender, String grade, float cpp, float java, float fluter, double total, double average) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.cpp = cpp;
        this.java = java;
        this.fluter = fluter;
        this.total = total;
        this.average = average;
    }
    

    
    static ArrayList<List_Student> list = new ArrayList<>();
}
