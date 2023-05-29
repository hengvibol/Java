package AWT;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Smallcalculator extends Frame implements ActionListener{
    Label lbtitle,lbvalue1,lbvalue2,lbresult;
    TextField textvalue1,textvalue2,textresult;
    Button btnsum,btnsub,btnmul,btndiv,btnclear;
   public Smallcalculator(){
       lbtitle = new Label("Small Calculator", Label.CENTER);
       lbtitle.setBounds(0, 30, 600, 40);
       lbtitle.setFont(new Font("", Font.BOLD, 18));
       lbtitle.setBackground(Color.GRAY);
       add(lbtitle);
       
       lbvalue1 = new Label("Input Value1 :");
       lbvalue1.setBounds(50, 110, 130, 30);
       lbvalue1.setFont(new Font("DialogInput", Font.BOLD, 14));
       add(lbvalue1);
       textvalue1 = new TextField();
       textvalue1.setBounds(180, 110, 200, 30);
       textvalue1.setFont(new Font("DialogInput", Font.BOLD, 14));
       add(textvalue1);
       
       lbvalue2 = new Label("Input Value2 :");
       lbvalue2.setBounds(50, 190, 130, 30);
       lbvalue2.setFont(new Font("DialogInput", Font.BOLD, 14));
       add(lbvalue2);
       textvalue2 = new TextField();
       textvalue2.setBounds(180, 190, 200, 30);
       textvalue2.setFont(new Font("DialogInput", Font.BOLD, 14));
       add(textvalue2);
       
       lbresult = new Label("Result :");
       lbresult.setBounds(50, 270, 120, 30);
       lbresult.setFont(new Font("DialogInput", Font.BOLD, 14));
       add(lbresult);
       textresult = new TextField();
       textresult.setBounds(180, 270, 200, 30);
       textresult.setFont(new Font("DialogInput", Font.BOLD, 14));
       add(textresult);
       
       btnsum = new Button("Sum");
       btnsum.setBounds(50, 320, 50, 30);
       btnsum.setFont(new Font("Dialog", Font.BOLD, 14));
       btnsum.setBackground(new Color(192, 192, 192));
       add(btnsum);
       btnsub = new Button("Sub");
       btnsub.setBounds(150, 320, 50, 30);
       btnsub.setFont(new Font("Dialog", Font.BOLD, 14));
       btnsub.setBackground(new Color(192, 192, 192));
       add(btnsub);
       btnmul = new Button("Mul");
       btnmul.setBounds(250, 320, 50, 30);
       btnmul.setFont(new Font("Dialog", Font.BOLD, 14));
       btnmul.setBackground(new Color(192, 192, 192));
       add(btnmul);
       btndiv = new Button("Div");
       btndiv.setBounds(350, 320, 50, 30);
       btndiv.setFont(new Font("Dialog", Font.BOLD, 14));
       btndiv.setBackground(new Color(192, 192, 192));
       add(btndiv);
       btnclear = new Button("Clear");
       btnclear.setBounds(450, 320, 50, 30);
       btnclear.setFont(new Font("Dialog", Font.BOLD, 14));
       btnclear.setForeground(Color.red);
       add(btnclear);
       
       //Add ActionEvent for Button
       btnsum.addActionListener(this);
       btnsub.addActionListener(this);
       btnmul.addActionListener(this);
       btndiv.addActionListener(this);
       btnclear.addActionListener(this);
       
       //Frame
       setLayout(null);
       setSize(600, 400);
       setVisible(true);
       setLocationRelativeTo(null);
       
       
       // close Frame
       addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
   }    
    public static void main(String[] args) {
        new Smallcalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double value1 = Double.parseDouble(textvalue1.getText());
        double value2 = Double.parseDouble(textvalue2.getText());
        if(e.getSource()==btnsum){
            double result=value1+value2;
            textresult.setText(String.valueOf(result));
        }else if(e.getSource()==btnsub){
            double result=value1-value2;
            textresult.setText(String.valueOf(result));
        }else if(e.getSource()==btnmul){
            double result=value1*value2;
            textresult.setText(String.valueOf(result));
        }else if(e.getSource()==btndiv){
            double result=value1/value2;
            textresult.setText(String.valueOf(result));
        }else{
            textvalue1.setText("");
            textvalue2.setText("");
            textresult.setText("");
        }
    }
}
