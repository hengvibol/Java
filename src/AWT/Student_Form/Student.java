package AWT.Student_Form;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Student extends Frame implements ActionListener,MouseListener{
    Label lbtitle,lbid,lbname,lbgender,lbcpp,lbjava,lbfluter;
    TextField txtid,txtname,txtgender,txtcpp,txtjava,txtfluter;
    Button btnsave,btnupdate,btndelete,btnexit;
    JCheckBox cbmale,cbfemale;
    ButtonGroup bg = new ButtonGroup();
    JTable tbtable;
    DefaultTableModel model;
    public Student() {
        //title
        lbtitle = new Label("Student Management",Label.CENTER);
        lbtitle.setBounds(0, 10, 1200, 100);
        lbtitle.setFont(new Font("Serif", Font.BOLD, 40));
        lbtitle.setBackground(new Color(0, 204, 204));
        add(lbtitle);
        //Label Id
        lbid = new Label("ID");
        lbid.setBounds(50, 150, 50, 30);
        lbid.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbid);
        //Label name
        lbname = new Label("Name");
        lbname.setBounds(50, 200, 50, 30);
        lbname.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbname);
        //Label gender
        lbgender = new Label("Gender");
        lbgender.setBounds(50, 250, 70, 30);
        lbgender.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbgender);
        //Label C++
        lbcpp = new Label("C++");
        lbcpp.setBounds(50, 300, 50, 30);
        lbcpp.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbcpp);
        //Label Java
        lbjava = new Label("Java");
        lbjava.setBounds(50, 350, 50, 30);
        lbjava.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbjava);
        //Label Java
        lbfluter = new Label("Fluter");
        lbfluter.setBounds(50, 400, 50, 30);
        lbfluter.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbfluter);
        
        //TextField id
        txtid = new TextField();
        txtid.setBounds(150, 150, 250, 30);
        txtid.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtid);
        //TextField name
        txtname = new TextField();
        txtname.setBounds(150, 200, 250, 30);
        txtname.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtname);
        
        //male
        cbmale = new JCheckBox("Male");
        cbmale.setBounds(150, 250, 100, 30);
        cbmale.setBackground(new Color(255, 102, 102));
        cbmale.setFont(new Font("Serif", Font.PLAIN, 20));
        //cbmale.setForeground(Color.WHITE);
        add(cbmale);
        //Female
        cbfemale = new JCheckBox("Female");
        cbfemale.setBounds(300, 250, 90, 30);
        cbfemale.setBackground(new Color(255, 102, 102));
       // cbfemale.setForeground(Color.WHITE);
        cbfemale.setFont(new Font("Serif", Font.PLAIN, 20));
        add(cbfemale);
        //add to buttonGroup
        bg.add(cbmale);
        bg.add(cbfemale);
        //TextField c++
        txtcpp = new TextField();
        txtcpp.setBounds(150, 300, 250, 30);
        txtcpp.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtcpp);
        //TextField java
        txtjava = new TextField();
        txtjava.setBounds(150, 350, 250, 30);
        txtjava.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtjava);
        //TextField java
        txtfluter = new TextField();
        txtfluter.setBounds(150, 400, 250, 30);
        txtfluter.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtfluter);
        
        //Table
        String col[]={"ID","NAME","GENDER","C++","JAVA","FLUTER","TOTAL","AVERAGE","GRAD"};
        tbtable = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tbtable.setModel(model);
        JScrollPane js = new JScrollPane(tbtable);
        js.setBounds(450, 150,700, 200);
        add(js);
        
        //Button
        btnsave = new Button("Save");
        btnsave.setBounds(500, 370, 100, 30);
        btnsave.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnsave);
        btnupdate = new Button("Update");
        btnupdate.setBounds(650, 370, 100, 30);
        btnupdate.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnupdate);
        btndelete = new Button("Delete");
        btndelete.setBounds(800, 370, 100, 30);
        btndelete.setFont(new Font("Serif", Font.BOLD, 18));
        add(btndelete);
        btnexit = new Button("Exit");
        btnexit.setBounds(950, 370, 100, 30);
        btnexit.setFont(new Font("Serif", Font.BOLD, 18));
        add(btnexit);
        
        //Add action into button
        btnsave.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnexit.addActionListener(this);
        tbtable.addMouseListener(this);
        
        
        
        
        
        setBackground(new Color(255, 102, 102));
        setLayout(null);
        setSize(1200, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        //close Frame
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
    }
    public static void main(String[] args) {
        new Student();
    }
    public void getdate(){
        model.setRowCount(0);
        for(int i=0;i<List_Student.list.size();i++){
            Object row []={
                List_Student.list.get(i).getId(),
                List_Student.list.get(i).getName(),
                List_Student.list.get(i).getGender(),
                List_Student.list.get(i).getCpp(),
                List_Student.list.get(i).getJava(),
                List_Student.list.get(i).getFluter(),
                List_Student.list.get(i).getTotal(),
                List_Student.list.get(i).getAverage(),
                List_Student.list.get(i).getGrad(),
            };
           model.addRow(row);
        }
    }
    public void clear(){
        txtid.setText("");
        txtname.setText("");
        bg.clearSelection();
        txtcpp.setText("");
        txtjava.setText("");
        txtfluter.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnsave){
           int id = Integer.parseInt(txtid.getText());
           String name = txtname.getText();
           String gender = (cbmale.isSelected())? "Male":"Female"; 
           float cpp = Float.parseFloat(txtcpp.getText());
           float java = Float.parseFloat(txtjava.getText());
           float fluter = Float.parseFloat(txtfluter.getText());
           double total = cpp+java+fluter;
           double average = total/3;
           String grade;
           if(average>=90 && average<=100){
               grade="A";
           }else if(average>=80 && average<=90){
               grade="B";
           }else if(average>=70 && average<=80){
               grade="C";
           }else if(average>=60 && average<=70){
               grade="D";
           }else if(average>=50 && average<=60){
               grade="E";
           }else{
               grade="F";
           }
           List_Student.list.add(new List_Student(id, name, gender, grade, cpp, java, fluter, total, average));
           getdate();
           clear();
       }else if(e.getSource()==btnupdate){
           int id = Integer.parseInt(txtid.getText());
           String name = txtname.getText();
           String gender = (cbmale.isSelected())? "Male":"Female"; 
           float cpp = Float.parseFloat(txtcpp.getText());
           float java = Float.parseFloat(txtjava.getText());
           float fluter = Float.parseFloat(txtfluter.getText());
           double total = cpp+java+fluter;
           double average = total/3;
           String grade;
           if(average>=90 && average<=100){
               grade="A";
           }else if(average>=80 && average<=90){
               grade="B";
           }else if(average>=70 && average<=80){
               grade="C";
           }else if(average>=60 && average<=70){
               grade="D";
           }else if(average>=50 && average<=60){
               grade="E";
           }else{
               grade="F";
           }
           int index = tbtable.getSelectedRow();
           List_Student.list.set(index,new List_Student(id, name, gender, grade, cpp, java, fluter, total, average));
           getdate();
           clear();
       }else if(e.getSource()==btndelete){
           int index = tbtable.getSelectedRow();
           List_Student.list.remove(index);
           getdate();
           clear();
       }else{
           System.exit(0);
       }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equalsIgnoreCase("Male")){
            cbmale.setSelected(true);
        }else {
            cbfemale.setSelected(true);
        }
        txtcpp.setText(model.getValueAt(row, 3).toString());
        txtjava.setText(model.getValueAt(row, 4).toString());
        txtfluter.setText(model.getValueAt(row, 5).toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
         
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
}
