package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form_01 extends Frame {
    public Form_01(){
        
        //Button
        Button btnsave = new Button("Save");
        btnsave.setBounds(200, 50, 130, 50);
        btnsave.setFont(new Font("Serif", Font.BOLD, 20));
        btnsave.setForeground(Color.BLUE);
        btnsave.setBackground(Color.WHITE);
        add(btnsave);
        
        //lable
        Label LB = new Label("Hello World.");
        LB.setBounds(190, 150, 310, 40);
        LB.setFont(new Font("Serif", Font.ITALIC, 30));
        LB.setForeground(Color.GREEN);
        add(LB);
        
        //Set Color into Frame
        setBackground(new Color(224, 224, 224));
        
        setLayout(null);
        setSize(500, 300);
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
        new Form_01();
    }
}
