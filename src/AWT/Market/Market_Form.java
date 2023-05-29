package AWT.Market;
import java.awt.*;
import java.awt.event.*;;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Market_Form extends Frame implements ActionListener,MouseListener{
    Label lbtitle,lbcode,lbname,lbprice,lbqty;
    TextField txtcode,txtname,txtprice,txtqty;
    Button btnsave,btnupdate,btndelete,btnexit;
    JLabel lbimage;
    JTable tbtable;
    DefaultTableModel model;
    public Market_Form() {
        //Title
        lbtitle = new Label("Small Mall",Label.CENTER);
        lbtitle.setBounds(0, 50, 400, 30);
        lbtitle.setFont(new Font("Serif", Font.BOLD, 30));
        lbtitle.setBackground(Color.WHITE);
        add(lbtitle);
        //Image
        lbimage = new JLabel();
        lbimage.setBounds(0, 0, 400, 500);
        lbimage.setIcon(new ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Employee_Image\\market.jpg"));
        add(lbimage);
        
        //Label code
        lbcode = new Label("Code");
        lbcode.setBounds(500, 100, 70, 30);
        lbcode.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbcode);
        
        //Label name
        lbname = new Label("Name");
        lbname.setBounds(500, 170, 70, 30);
        lbname.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbname);
        
        //Label price
        lbprice = new Label("Price");
        lbprice.setBounds(500, 250, 70, 30);
        lbprice.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbprice);
        
        //Label qty
        lbqty = new Label("Qty");
        lbqty.setBounds(500, 330, 70, 30);
        lbqty.setFont(new Font("Serif", Font.BOLD, 20));
        add(lbqty);
        
        //Taxt Field code
        txtcode = new TextField();
        txtcode.setBounds(600, 100, 200, 30);
        txtcode.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtcode);
        //Taxt Field name
        txtname = new TextField();
        txtname.setBounds(600, 170, 200, 30);
        txtname.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtname);
        //Taxt Field price
        txtprice = new TextField();
        txtprice.setBounds(600, 250, 200, 30);
        txtprice.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtprice);
        //Taxt Field qty
        txtqty = new TextField();
        txtqty.setBounds(600, 330, 200, 30);
        txtqty.setFont(new Font("Serif", Font.BOLD, 20));
        add(txtqty);
        
        //Button Save
        btnsave = new Button("Save");
        btnsave.setBounds(850, 380, 70, 30);
        btnsave.setFont(new Font("Serif", Font.ITALIC, 20));
        btnsave.setBackground(Color.green);
        add(btnsave);
        //Button update
        btnupdate = new Button("Update");
        btnupdate.setBounds(990, 380, 70, 30);
        btnupdate.setFont(new Font("Serif", Font.ITALIC, 20));
        btnupdate.setBackground(Color.MAGENTA);
        add(btnupdate);
        //Button update
        btndelete = new Button("Delete");
        btndelete.setBounds(1160, 380, 70, 30);
        btndelete.setFont(new Font("Serif", Font.ITALIC, 20));
        btndelete.setBackground(Color.red);
        add(btndelete);
        //Button update
        btnexit = new Button("Exit");
        btnexit.setBounds(1330, 380, 70, 30);
        btnexit.setFont(new Font("Serif", Font.ITALIC, 20));
        btnexit.setBackground(Color.cyan);
        add(btnexit);
        
        //Table
        String col[]={"CODE","NAME","PRICE","QTY","TOTAL","DISCOUNT","PAYMENT"};
        tbtable = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tbtable.setModel(model);
        JScrollPane js = new JScrollPane(tbtable);
        js.setBounds(850, 100,550, 260);
        add(js);
        //add action to button
        btnsave.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnexit.addActionListener(this);
        tbtable.addMouseListener(this);
        
        setBackground(new Color(250, 215, 0));
        setLayout(null);
        setSize(1500, 500);
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
        new Market_Form();
    }
    public void getdata(){
        model.setRowCount(0);
        for(var i=0;i<List_Market.list.size();i++){
            Object row[]={
                List_Market.list.get(i).getCode(),
                List_Market.list.get(i).getName(),
                List_Market.list.get(i).getPrice()+"$",
                List_Market.list.get(i).getQty(),
                List_Market.list.get(i).getTotal()+"$",
                List_Market.list.get(i).getDiscount()+"%",
                List_Market.list.get(i).getPayment()+"$",   
            };
            model.addRow(row);
        }       
    }
    public void clear(){
        txtcode.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtqty.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnsave){
        int code = Integer.parseInt(txtcode.getText());
        String name = txtname.getText();
        float price = Float.parseFloat(txtprice.getText());
        int qty = Integer.parseInt(txtqty.getText());
        double total = price*qty;
        int discount = (total>0 && total<=10) ? 10 :
                       (total>10 && total<=20) ? 20 :
                       (total>20 && total<=30) ? 30 :
                       (total>30 && total<=40) ? 40 :
                       (total>40 && total<=50) ? 50 :
                       (total>50 && total<=60) ? 60 :70;
        double payment = total-(total*discount)/100;
        // Save into array list
        List_Market.list.add(new List_Market(code, qty, discount, name, price, total, payment));
        getdata();
        clear();
    }else if(e.getSource()==btnupdate){
        int code = Integer.parseInt(txtcode.getText());
        String name = txtname.getText();
        float price = Float.parseFloat(txtprice.getText());
        int qty = Integer.parseInt(txtqty.getText());
        double total = price*qty;
        int discount = (total>0 && total<=10) ? 10 :
                       (total>10 && total<=20) ? 20 :
                       (total>20 && total<=30) ? 30 :
                       (total>30 && total<=40) ? 40 :
                       (total>40 && total<=50) ? 50 :
                       (total>50 && total<=60) ? 60 :70;
        double payment = total-(total*discount)/100;
        int index = tbtable.getSelectedRow();
        // Save into array list
        List_Market.list.set(index,new List_Market(code, qty, discount, name, price, total, payment));
        getdata();
        clear();
    }else if(e.getSource()==btndelete){
        int index = tbtable.getSelectedRow();
        List_Market.list.remove(index);
        getdata();
        clear();
    }else{
       System.exit(0);
    }
}

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = tbtable.getSelectedRow();
        txtcode.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        String price =model.getValueAt(row, 2).toString();
        price =price.substring(0, price.length()-1);
        txtprice.setText(price);
        txtqty.setText(model.getValueAt(row, 3).toString());
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
