package Swing.StudentRegister;

import java.util.ArrayList;

public class List_StudentRegister {

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getCourse() {
        return course;
    }
    public String getPhone() {
        return phone;
    }
    public String getRoom() {
        return room;
    }
    public String getTime() {
        return time;
    }
    public String getDate() {
        return date;
    }
    public String getImage() {
        return image;
    }
    public float getPrice() {
        return price;
    }
    private int id;
    private String name,gender,course,phone,room,time,date,image;
    private float price;

    public List_StudentRegister(int id, String name, String gender, String course, float price, String phone, String room, String time, String date, String image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.phone = phone;
        this.room = room;
        this.time = time;
        this.date = date;
        this.image = image;
        this.price = price;
    }
    static ArrayList <List_StudentRegister> Liststudent = new ArrayList<>();
}
