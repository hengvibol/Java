package AWT;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class User extends Frame{
    public User(){
        //Button
        
        
        //Label
        Label lbtitle = new Label("LOING");
        lbtitle.setBounds(250, 50, 68, 20);
        lbtitle.setFont(new Font("Monospaced",Font.BOLD, 20));
        lbtitle.setForeground(Color.BLUE);
        lbtitle.setBackground(new Color(165,42,42));
        add(lbtitle);
        //Label Register
        
        Label lbrg = new Label("Register Now");
        lbrg.setBounds(250, 200, 74, 20);
        lbrg.setForeground(Color.BLUE);
        lbrg.setBackground(new Color(255,255,255));
        add(lbrg);
        
        //Label Email
        Label lbemail = new Label("Email    :");
        lbemail.setBounds(50, 100, 120, 20);
        lbemail.setFont(new Font("Monospaced",Font.BOLD, 20));
        lbemail.setForeground(Color.WHITE);
        //lbemail.setBackground(new Color(192,192,192));
        add(lbemail);
        
        Label lb = new Label("___________________________________________________");
        lb.setBackground(new Color(192,192,192));
        lb.setBounds(142, 100,300, 20);
        add(lb);
        //Label Email
        Label lbPas = new Label("Password :");
        lbPas.setBounds(50, 150, 120, 20);
        lbPas.setFont(new Font("Monospaced",Font.BOLD, 20));
        lbPas.setForeground(Color.WHITE);
        add(lbPas);
        Label lbl = new Label("___________________________________________________");
        lbl.setBackground(new Color(192,192,192));
        lbl.setBounds(142, 150,300, 20);
        add(lbl);
        
        //Set color into Frame
        setBackground(new Color(0,128,128));
        
        //Frame
        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        
        //close form
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
    }
    public static void main(String[] args) {
        new User();
    }
}
