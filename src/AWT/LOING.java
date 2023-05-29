package AWT;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class LOING extends Frame{
    JLabel lbimage;
    public LOING() {
        lbimage = new JLabel();
        lbimage.setBounds(0, 0, 400, 700);
        lbimage.setBackground(Color.red);
        lbimage.setIcon(new ImageIcon("D:\\Photo\\Pic Study\\Loing.jpg"));
        add(lbimage);
        
        
        setLayout(null);
        setSize(400, 700);
        setVisible(true);
        setLocationRelativeTo(this);
        //close Frame
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
    }
    public static void main(String[] args) {
        new LOING();
    }
}
