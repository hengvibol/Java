package Swing.StudentRegister;
import java.util.ArrayList;
public class List_Account {
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    private String username;
    private String password;

    public List_Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    static ArrayList<List_Account> listaccount = new ArrayList<>();
}
