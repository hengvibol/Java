package Product_Management;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Connection_Database {


    public double getTotal() {
        return total;
    }

    public DefaultTableModel getModel() {
        return model;
    }
    
    
   private PreparedStatement ps; 
   private ResultSet r;
   private double total;
   private String col[]={"No","Name","Code","Price","Qty","Amount"};
   private DefaultTableModel model = new DefaultTableModel(col, 0) ;
   
   
   
    // connect to database
   public Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demodatabase","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;
    }
   
   public void addIteam(int code,String name,double price,int qty,double amount){
       try {
           ps=connection().prepareStatement("INSERT INTO tbproduct(Code,Name,Price,Qty,Amount) VALUES(?,?,?,?,?)");
           ps.setInt(1, code);
           ps.setString(2, name);
           ps.setDouble(3, price);
           ps.setInt(4, qty);
           ps.setDouble(5, amount);
           int index = ps.executeUpdate();
           if(index>0){
               JOptionPane.showMessageDialog(null,"Add Iteam successful.");
           }else{
               JOptionPane.showMessageDialog(null,"Error.....Add Iteam.");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
   
   }
   public void Fetchdata(){
       try {
           int no=0;
           ps=connection().prepareStatement("SELECT * FROM tbproduct");
           r=ps.executeQuery();
           while(r.next()){
               Object row[]={
               ++no,
               r.getInt("Code"),
               r.getString("Name"),
               r.getDouble("Price")+"$",
               r.getInt("Qty"),
               r.getDouble("Amount")+"$"
                 };
               model.addRow(row);
               total+=r.getDouble("Amount");
               // add in list
               List_Product.list.add(new List_Product(
               r.getInt("Code"),
               r.getString("Name"),
               r.getDouble("Price"),
               r.getInt("Qty"),
               r.getDouble("Amount")
               ));
                
             }
       
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
         }
       
   }
}
