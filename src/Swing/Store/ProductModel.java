package Swing.Store;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class ProductModel extends javax.swing.JPanel {

    public static void setModel(DefaultTableModel aModel) {
        model = aModel;
    }
    
    public static DefaultTableModel getModel(){
        return model;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
        lbcode.setText(lbcode.getText()+String.valueOf(code));
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        lbname1.setText(lbname1.getText()+name);
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
        lbimage1.setIcon(new ImageIcon(image));
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
        lbprice1.setText(lbprice1.getText()+String.valueOf(price)+"$");
    }
    
    private int code;
    private String name,image;
    private int qty=0;
    private float price;
    
    private static DefaultTableModel model = new DefaultTableModel(new String[]{"ID","Name","Price","QTY","Amount"},0);
    DecimalFormat df = new DecimalFormat("##0.00$");
    public ProductModel(int code,String name,float price,String image){
        this.code = code;
        this.name = name;
        this.price = price;
        this.image = image;
    }
     static ArrayList<ProductModel> product = new ArrayList<>();
    
    public ProductModel() {
        initComponents();
       btncanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbimage = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbprice = new javax.swing.JLabel();
        tbncancel = new javax.swing.JButton();
        btnbuy = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbimage1 = new javax.swing.JLabel();
        lbname1 = new javax.swing.JLabel();
        lbprice1 = new javax.swing.JLabel();
        btncanel = new javax.swing.JButton();
        btnbuy1 = new javax.swing.JButton();
        lbcode = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/Store/Defaultimage.jpg"))); // NOI18N

        lbname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbname.setText("Name :");

        lbprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbprice.setText("Price :");

        tbncancel.setBackground(new java.awt.Color(255, 102, 102));
        tbncancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbncancel.setText("Cancel");

        btnbuy.setBackground(new java.awt.Color(51, 255, 255));
        btnbuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuy.setText("Buy");

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbimage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/Store/Default.jpg"))); // NOI18N

        lbname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbname1.setText("Name  :  ");

        lbprice1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbprice1.setText("Price   :  ");

        btncanel.setBackground(new java.awt.Color(255, 102, 102));
        btncanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncanel.setText("Cancel");
        btncanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanelActionPerformed(evt);
            }
        });

        btnbuy1.setBackground(new java.awt.Color(0, 255, 51));
        btnbuy1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuy1.setText("Buy");
        btnbuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuy1ActionPerformed(evt);
            }
        });

        lbcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbcode.setText("Code    :  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbimage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbprice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbname1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbcode, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncanel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lbimage1)
                .addGap(18, 18, 18)
                .addComponent(lbcode, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbname1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuy1)
                    .addComponent(btncanel))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    
    private int findrow(int code){
        for(int i=0;i<getModel().getRowCount();i++){
        code = (int) getModel().getValueAt(i, 0);
            if(code==this.code){
                return i;
           }
        } 
        return -1;
    }
    
    private void btnbuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuy1ActionPerformed
        qty++;
        btnbuy1.setText("Buy("+qty+")");
        btncanel.setVisible(true);
        int index = findrow(code);
        if(qty==1){
            Object row[]={code,name,price+"$",qty,price+"$"};
            getModel().addRow(row);
        }else{
            double amount = price*qty;
            // setvalueAt(object value, int row,int column);
            getModel().setValueAt(qty, index, 3); //qty
            getModel().setValueAt(df.format(amount), index, 4); // amout
        }
    }//GEN-LAST:event_btnbuy1ActionPerformed

    private void btncanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanelActionPerformed
        qty--;
        int index = findrow(code);
        if(qty<=0){ // Remove
            btncanel.setVisible(false);
            btnbuy1.setText("Buy");
            qty=0;
            model.removeRow(index);
        }else{ //Update
            btnbuy1.setText("Buy("+qty+")");
            double amount = price*qty;
            getModel().setValueAt(qty, index, 3); //qty
            getModel().setValueAt(df.format(amount), index, 4); // amout
        }
    }//GEN-LAST:event_btncanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuy;
    private javax.swing.JButton btnbuy1;
    private javax.swing.JButton btncanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcode;
    private javax.swing.JLabel lbimage;
    private javax.swing.JLabel lbimage1;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbname1;
    private javax.swing.JLabel lbprice;
    private javax.swing.JLabel lbprice1;
    private javax.swing.JButton tbncancel;
    // End of variables declaration//GEN-END:variables
}
