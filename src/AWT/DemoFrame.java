package AWT;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class DemoFrame extends Frame{
    DemoFrame(){
        //Label
        Label title = new Label("JAVA AWT");
        title.setBounds(300, 25, 500, 50);
        title.setBackground(Color.red);
        title.setFont(new Font("DialogInput", Font.BOLD, 20));
        add(title);
        Label title1 = new Label("");
        title1.setBounds(0, 25,500, 50);
        title1.setBackground(Color.red);
        add(title1);
        
        //Button save
        Button b = new Button("Save");
        b.setBounds(100, 100, 150, 50);
        b.setForeground(Color.YELLOW);
        b.setBackground(Color.red);
        b.setFont(new Font("Dialog", Font.BOLD, 20));
        add(b);
        
        // Label save
        Label save = new Label("Click here to save date");
        save.setBounds(300, 100, 250, 50);
        save.setForeground(Color.blue);
        save.setBackground(new Color(192, 192, 192));
        save.setFont(new Font("Serif", Font.BOLD, 20));
        add(save);
        
        //Button update
        Button update = new Button("Update");
        update.setBounds(100, 200, 150, 50);
        update.setForeground(Color.GREEN);
        update.setBackground(Color.yellow);
        update.setFont(new Font("Dialog", Font.BOLD, 20));
        add(update);
        
        // Label Update
        Label up = new Label("Click here to update date");
        up.setBounds(300, 200, 250, 50);
        up.setForeground(Color.orange);
        up.setBackground(new Color(192, 192, 192));
        up.setFont(new Font("Serif", Font.BOLD, 20));
        add(up);
        
        //Button Detete
        Button de = new Button("Detete");
        de.setBounds(100, 300, 150, 50);
        de.setForeground(Color.darkGray);
        de.setBackground(Color.magenta);
        de.setFont(new Font("Dialog", Font.BOLD, 20));
        add(de);
        
        // Label delete
        Label det = new Label("Click here to delete date");
        det.setBounds(300, 300, 250, 50);
        det.setForeground(Color.PINK);
        det.setBackground(new Color(192, 192, 192));
        det.setFont(new Font("Serif", Font.BOLD, 20));
        add(det);
        
        //Button Exit
        Button ex = new Button("EXIT");
        ex.setBounds(100, 400, 150, 50);
        ex.setForeground(Color.green);
        ex.setBackground(Color.gray);
        ex.setFont(new Font("Dialog", Font.BOLD, 20));
        add(ex);
        
        // Label Exit
        Label et = new Label("Click here to exit program");
        et.setBounds(300, 400, 250, 50);
        et.setForeground(Color.BLACK);
        et.setBackground(new Color(192, 192, 192));
        et.setFont(new Font("Serif", Font.BOLD, 20));
        add(et);
        
        //Frame
        setLayout(null);
        setSize(700, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(new Color(192, 192, 192));
        
         // close Frame
       addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
               
    }
    public static void main(String[] args) {
        new DemoFrame();
    }
}
