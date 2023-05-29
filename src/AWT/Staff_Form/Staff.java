package AWT.Staff_Form;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Staff extends Frame implements ActionListener,MouseListener{
    JLabel lbimage;
    Label lbtitle,lbid,lbname,lbposition,lbphone,lbgender,lbsalary,lbaddress;
    TextField txtid,txtname,txtposition,txtphone,txtgender,txtsalary,txtaddress;
    JCheckBox cbmale,cbfemale;
    Button btnsave,btnupdate,btndelete,btnexit;
    ButtonGroup bg = new ButtonGroup();
    JTable tbtable;
    DefaultTableModel model;
    public Staff(){
        lbtitle = new Label("Staff Information", Label.CENTER);
        lbtitle.setBounds(0, 50, 300, 30);
        lbtitle.setForeground(new Color(0, 102, 102));
        lbtitle.setBackground(Color.WHITE);
        lbtitle.setFont(new Font("Serif", Font.BOLD, 28));
        add(lbtitle);
        lbimage = new JLabel();
        lbimage.setBounds(0,0 , 300, 700);
        lbimage.setIcon(new ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Employee_Image\\make1.jpg"));
        add(lbimage);
        //Label id
        lbid = new Label("ID");
        lbid.setBounds(350, 100, 60, 30);
        lbid.setForeground(Color.WHITE);
        lbid.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbid);
        //Label name
        lbname = new Label("Name");
        lbname.setBounds(350, 180, 60, 30);
        lbname.setForeground(Color.WHITE);
        lbname.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbname);
        //Label Position
        lbposition = new Label("Position");
        lbposition.setBounds(350, 260, 70, 30);
        lbposition.setForeground(Color.WHITE);
        lbposition.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbposition);
        //Label Phone
        lbphone = new Label("Phone");
        lbphone.setBounds(350, 340, 60, 30);
        lbphone.setForeground(Color.WHITE);
        lbphone.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbphone);
        //Label Gender
        lbgender = new Label("Gender");
        lbgender.setBounds(750, 100, 70, 30);
        lbgender.setForeground(Color.WHITE);
        lbgender.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbgender);
        //Label Salary
        lbsalary = new Label("Salary");
        lbsalary.setBounds(750, 180, 70, 30);
        lbsalary.setForeground(Color.WHITE);
        lbsalary.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbsalary);
        //Label address
        lbaddress = new Label("Address");
        lbaddress.setBounds(750, 260, 80, 30);
        lbaddress.setForeground(Color.WHITE);
        lbaddress.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbaddress);
        //TextField Id
        txtid = new TextField();
        txtid.setBounds(450, 100, 250, 30);
        txtid.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtid);
        //TextField name
        txtname = new TextField();
        txtname.setBounds(450, 180, 250, 30);
        txtname.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtname);
        //TextField Position
        txtposition = new TextField();
        txtposition.setBounds(450, 260, 250, 30);
        txtposition.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtposition);
        //TextField Phone
        txtphone = new TextField();
        txtphone.setBounds(450, 340, 250, 30);
        txtphone.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtphone);
        //male
        cbmale = new JCheckBox("Male");
        cbmale.setBounds(870, 100, 100, 30);
        cbmale.setBackground(new Color(0, 102, 102));
        cbmale.setFont(new Font("Serif", Font.PLAIN, 20));
        cbmale.setForeground(Color.WHITE);
        add(cbmale);
        //Female
        cbfemale = new JCheckBox("Female");
        cbfemale.setBounds(1025, 100, 90, 30);
        cbfemale.setBackground(new Color(0, 102, 102));
        cbfemale.setForeground(Color.WHITE);
        cbfemale.setFont(new Font("Serif", Font.PLAIN, 20));
        add(cbfemale);
        //add to buttonGroup
        bg.add(cbmale);
        bg.add(cbfemale);
        //TextField salary
        txtsalary = new TextField();
        txtsalary.setBounds(870, 180, 250, 30);
        txtsalary.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtsalary);
        //TextField address
        txtaddress = new TextField();
        txtaddress.setBounds(870, 260, 250, 30);
        txtaddress.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtaddress);
        //Table
        String col[]={"ID","Name","Position","Phone","Gender","Salary","Address"};
        tbtable = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tbtable.setModel(model);
        JScrollPane js = new JScrollPane(tbtable);
        js.setBounds(350, 400,770, 200);
        add(js);
        //Button
        btnsave = new Button("Save");
        btnsave.setBounds(450, 630, 70, 30);
        btnsave.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btnsave); 
        btnupdate = new Button("Update");
        btnupdate.setBounds(600, 630, 70, 30);
        btnupdate.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btnupdate);
        btndelete = new Button("Delete");
        btndelete.setBounds(760, 630, 70, 30);
        btndelete.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btndelete);
        btnexit = new Button("Exit");
        btnexit.setBounds(930, 630, 70, 30);
        btnexit.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btnexit);
        
        //Add actionEvent for button
        btnsave.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnexit.addActionListener(this);
        //add MouseClicked for table
        tbtable.addMouseListener(this);
        
        
        setBackground(new Color(0, 102, 102));
        setLayout(null);
        setSize(1200, 700);
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
        new Staff();
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnsave){
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String position = txtposition.getText();
        String phone = txtphone.getText();
//        String gender;
//            if(cbmale.isSelected()){ //swing isSelected use check condition in checkbox
//                gender="Male";
//            }else{
//                gender="Female";
//            }
        String gender = (cbmale.isSelected())? "Male":"Female"; 
        float salary = Float.parseFloat(txtsalary.getText());
        String address = txtaddress.getText();
        // Save into array list
        List_Staff staff = new List_Staff(id, name, gender, position, address, phone, salary);
        List_Staff.list.add(staff);
        //Clear all data form table
        model.setRowCount(0);
        for(int i=0;i<List_Staff.list.size();i++){
            Object row[]={
                List_Staff.list.get(i).getId(),
                List_Staff.list.get(i).getName(),
                List_Staff.list.get(i).getPosition(),
                List_Staff.list.get(i).getPhone(),
                List_Staff.list.get(i).getGender(),
                List_Staff.list.get(i).getSalary()+"$",
                List_Staff.list.get(i).getAddress()
            };
            model.addRow(row);
        }
        txtid.setText("");
        txtname.setText("");
        txtposition.setText("");
        txtphone.setText("");
        bg.clearSelection(); // method in button group
        txtsalary.setText("");
        txtaddress.setText("");
       }else if(e.getSource()==btnupdate){
           int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String position = txtposition.getText();
        String phone = txtphone.getText();
        String gender;
            if(cbmale.isSelected()){ //swing
                gender="Male";
            }else{
                gender="Female";
            }
        float salary = Float.parseFloat(txtsalary.getText());
        String address = txtaddress.getText();
        // Save into array list
        List_Staff staff = new List_Staff(id, name, gender, position, address, phone, salary);
        int index = tbtable.getSelectedRow();
        List_Staff.list.set(index, staff);//Update in array
        //Clear all data form table
        model.setRowCount(0);
        for(int i=0;i<List_Staff.list.size();i++){
            Object row[]={
                List_Staff.list.get(i).getId(),
                List_Staff.list.get(i).getName(),
                List_Staff.list.get(i).getPosition(),
                List_Staff.list.get(i).getPhone(),
                List_Staff.list.get(i).getGender(),
                List_Staff.list.get(i).getSalary()+"$",
                List_Staff.list.get(i).getAddress()
            };
            model.addRow(row);
        }
        txtid.setText("");
        txtname.setText("");
        txtposition.setText("");
        txtphone.setText("");
        bg.clearSelection();
        txtsalary.setText("");
        txtaddress.setText("");
        
       }else if(e.getSource()==btndelete){
           int index = tbtable.getSelectedRow();
        List_Staff.list.remove(index);//Remove in array
        //Clear all data form table
        model.setRowCount(0);
        for(int i=0;i<List_Staff.list.size();i++){
            Object row[]={
                List_Staff.list.get(i).getId(),
                List_Staff.list.get(i).getName(),
                List_Staff.list.get(i).getPosition(),
                List_Staff.list.get(i).getPhone(),
                List_Staff.list.get(i).getGender(),
                List_Staff.list.get(i).getSalary()+"$",
                List_Staff.list.get(i).getAddress()
            };
            model.addRow(row);
        }
        txtid.setText("");
        txtname.setText("");
        txtposition.setText("");
        txtphone.setText("");
        bg.clearSelection();
        txtsalary.setText("");
        txtaddress.setText("");
        
       }else{
          // System.exit(0);
           dispose();
       }
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      // to data from table we use method : getValueAt(int row ,int column);
        int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        txtposition.setText(model.getValueAt(row, 2).toString());
        txtphone.setText(model.getValueAt(row, 3).toString());
        String gender = model.getValueAt(row, 4).toString();
        if(gender.equalsIgnoreCase("Male")){
            cbmale.setSelected(true);
        }else {
            cbfemale.setSelected(true);
        }
        String salary = model.getValueAt(row, 5).toString();
        salary = salary.substring(0, salary.length()-1);
        txtsalary.setText(salary); 
        txtaddress.setText(model.getValueAt(row, 6).toString());
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
