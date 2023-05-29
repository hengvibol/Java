package Swing.CrossFormStudent;
public class List_Student {

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public float getScore() {
        return score;
    }
    private int id;
    private String name,gender;
    private float score;

    public List_Student(int id, String name, String gender, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    
}
