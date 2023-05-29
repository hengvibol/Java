package Swing.Store;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class Store extends javax.swing.JFrame {
    public Store() {
        initComponents();
        
        // Initalize product in arraylist
        ProductModel.product.add(new ProductModel(101,"FANTA",0.5f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Fanta.jpg"));
        ProductModel.product.add(new ProductModel(102,"CARABAO",0.2f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Carabao.jpg"));
        ProductModel.product.add(new ProductModel(103,"BACHUS",0.3f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Bacchus.jpg"));
        ProductModel.product.add(new ProductModel(104,"IZE",0.4f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\IZE.jpg"));
        ProductModel.product.add(new ProductModel(105,"Redbull",0.2f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\RedBull.jpg"));
        ProductModel.product.add(new ProductModel(106,"Pepsi",0.5f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Pepse.jpg"));
        ProductModel.product.add(new ProductModel(107,"Sprite",0.6f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\sprite.jpg"));
        ProductModel.product.add(new ProductModel(108,"Water",0.3f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Water.jpg"));
        ProductModel.product.add(new ProductModel(109,"Yoe's",0.4f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Yoe's.jpg"));
        ProductModel.product.add(new ProductModel(110,"Wurkz",0.2f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Wurkz.jpg"));
        ProductModel.product.add(new ProductModel(111,"Sting",0.1f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Sting.jpg"));
        ProductModel.product.add(new ProductModel(112,"Olatte",0.2f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Olatte.jpg"));
        ProductModel.product.add(new ProductModel(113,"Dew",0.4f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Dew.jpg"));
        ProductModel.product.add(new ProductModel(114,"AQRIUS",0.6f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\aqiuauis.jpg"));
        ProductModel.product.add(new ProductModel(115,"Joop",0.2f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Joop.jpg"));
        ProductModel.product.add(new ProductModel(116,"Vitamilk Soy",0.7f,"D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Drink\\Vatemilk.jpg"));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);//Margin
        int x = 0,y=0;
        for(int i=0;i<ProductModel.product.size();i++){
            ProductModel pro = new ProductModel();
            pro.setImage(ProductModel.product.get(i).getImage());
            pro.setCode(ProductModel.product.get(i).getCode());
            pro.setName(ProductModel.product.get(i).getName());
            pro.setPrice(ProductModel.product.get(i).getPrice());
            gbc.gridx=x;
            gbc.gridy=y;
            x++;
            MainPanel.add(pro,gbc);
            if(x==4){
                y++;
                x=0;
            }
        }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));
        MainPanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(MainPanel);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("សម្រាប់កូនខ្មែរ", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ភេសជ្ជៈស្មោះស្មេហ៍");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Order");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Order r = new Order(null, true);
        r.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
