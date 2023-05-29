package AWT;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Demo extends Frame{
    public Demo(){
        setLayout(null);
        setSize(600, 500);
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
        new Demo();
    }
}
