package AWT.Person_Form;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Person  extends Frame implements ActionListener,MouseListener{
    Label lbtitle,lbid,lbname,lbgender,lbsalary,lbthank;
    TextField txtid,txtname,txtsalary;
    JCheckBox cbmale,cbfemale;
    Button btnsave,btnupdate,btndelete,btnexit;
    JTable tbtable;
    DefaultTableModel model;
    ButtonGroup bg = new ButtonGroup();
    public Person(){
        
        //Label title
        lbtitle = new Label("Person Information", Label.CENTER);
        lbtitle.setBounds(0, 30, 600, 50);
        lbtitle.setFont(new Font("Serif", Font.BOLD, 30));
       lbtitle.setBackground(Color.GRAY);
//        lbtitle.setForeground(Color.BLUE);
        add(lbtitle);
        //id
        lbid = new Label("ID");
        lbid.setBounds(80, 130, 30, 30);
        lbid.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbid);
        txtid = new TextField();
        txtid.setBounds(180, 130, 250, 30);
        txtid.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtid);
        
        //Name
        lbname = new Label("Name");
        lbname.setBounds(80, 180, 50, 30);
        lbname.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbname);
        txtname = new TextField();
        txtname.setBounds(180, 180, 250, 30);
        txtname.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtname);
        
        //Gender
        lbgender = new Label("Gender");
        lbgender.setBounds(80, 230, 70, 30);
        lbgender.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbgender);
        
        //male
        cbmale = new JCheckBox("Male");
        cbmale.setBounds(190, 230, 80, 30);
        cbmale.setBackground(new Color(225, 202, 202));
        cbmale.setFont(new Font("Serif", Font.PLAIN, 20));
        add(cbmale);
        //Female
        cbfemale = new JCheckBox("Female");
        cbfemale.setBounds(340, 230, 90, 30);
        cbfemale.setBackground(new Color(225, 202, 202));
        cbfemale.setFont(new Font("Serif", Font.PLAIN, 20));
        add(cbfemale); 
        //add to buttonGroup
        bg.add(cbmale);
        bg.add(cbfemale);
                
        //Salary
        lbsalary = new Label("Salary");
        lbsalary.setBounds(80, 280, 70, 30);
        lbsalary.setFont(new Font("Serif", Font.BOLD, 18));
        add(lbsalary);
        txtsalary = new TextField();
        txtsalary.setBounds(180, 280, 250, 30);
        txtsalary.setFont(new Font("Serif", Font.BOLD, 18));
        add(txtsalary); 
        
        lbthank = new Label("Thank you.",Label.CENTER);
        lbthank.setBounds(0, 680, 600, 50);
        lbthank.setFont(new Font("Serif", Font.ITALIC, 12));
        add(lbthank);
        
        //Button
        btnsave = new Button("Save");
        btnsave.setBounds(70, 330, 70, 30);
        btnsave.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btnsave); 
        btnupdate = new Button("Update");
        btnupdate.setBounds(190, 330, 70, 30);
        btnupdate.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btnupdate);
        btndelete = new Button("Delete");
        btndelete.setBounds(310, 330, 70, 30);
        btndelete.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btndelete);
        btnexit = new Button("Exit");
        btnexit.setBounds(430, 330, 70, 30);
        btnexit.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(btnexit);
        
        //Table
        String col[]={"ID","Name","Gender","Salary"};
        tbtable = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tbtable.setModel(model);
        JScrollPane js = new JScrollPane(tbtable);
        js.setBounds(40, 400,490, 250);
        add(js);
        
        //Add actionEvent for button
        btnsave.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnexit.addActionListener(this);
        //add MouseClicked for table
        tbtable.addMouseListener(this);
        
        
        setBackground(new Color(225, 202, 202));
        setLayout(null);
        setSize(570, 750);
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
        new Person();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnsave){
            int id = Integer.parseInt(txtid.getText());
            String name = txtname.getText();
            String gender;
            if(cbmale.isSelected()){ //swing
                gender="Male";
            }else{
                gender="Female";
            }
            float salary = Float.parseFloat(txtsalary.getText());
            
            //Save data into arrayList
            List_Person per = new List_Person(id, name, gender, salary);
            List_Person.list.add(per);
            //Clear all data form table
            model.setRowCount(0);
            //get data form arraylist into table
            for(int i=0;i<List_Person.list.size();i++){
                Object row[]={
                    List_Person.list.get(i).getId(),
                    List_Person.list.get(i).getName(),
                    List_Person.list.get(i).getGender(),
                    List_Person.list.get(i).getSalary()+"$",  
                };
                model.addRow(row);
            }
            //Clear data
            txtid.setText(null);
            txtname.setText(null);
            bg.clearSelection();
            txtsalary.setText(null);
            
        }else if(e.getSource()==btnupdate){
            int id = Integer.parseInt(txtid.getText());
            String name = txtname.getText();
            String gender;
            if(cbmale.isSelected()){ //swing
                gender="Male";
            }else{
                gender="Female";
            }
            float salary = Float.parseFloat(txtsalary.getText());
            List_Person per = new List_Person(id, name, gender, salary);
            int index = tbtable.getSelectedRow();
            List_Person.list.set(index, per);//Update data in array
            //Clear all data form table
            model.setRowCount(0);
            //get data form arraylist into table
            for(int i=0;i<List_Person.list.size();i++){
                Object row[]={
                    List_Person.list.get(i).getId(),
                    List_Person.list.get(i).getName(),
                    List_Person.list.get(i).getGender(),
                    List_Person.list.get(i).getSalary()+"$",  
                };
                model.addRow(row);
            }
            //Clear data
            txtid.setText(null);
            txtname.setText(null);
            bg.clearSelection();
            txtsalary.setText(null);
            
        }else if(e.getSource()==btndelete){
            int index = tbtable.getSelectedRow();
            List_Person.list.remove(index);
            //Clear all data form table
            model.setRowCount(0);
            //get data form arraylist into table
            for(int i=0;i<List_Person.list.size();i++){
                Object row[]={
                    List_Person.list.get(i).getId(),
                    List_Person.list.get(i).getName(),
                    List_Person.list.get(i).getGender(),
                    List_Person.list.get(i).getSalary()+"$",  
                };
                model.addRow(row);
            }
            //Clear data
            txtid.setText(null);
            txtname.setText(null);
            bg.clearSelection();
            txtsalary.setText(null);
        }else{
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // to data from table we use method : getValueAt(int row ,int column);
        int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equalsIgnoreCase("Male")){
            cbmale.setSelected(true);
        }else {
            cbfemale.setSelected(true);
        }
        String salary = model.getValueAt(row, 3).toString();
        salary = salary.substring(0, salary.length()-1);
        txtsalary.setText(salary);
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
