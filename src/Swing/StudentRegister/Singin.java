package Swing.StudentRegister;
import javax.swing.JOptionPane;
public class Singin extends javax.swing.JFrame {

    public Singin() {
        initComponents();
        List_Account.listaccount.add(new List_Account("VIBOL Tech", "vibol2023"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsingup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnsingin = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1051, 540));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/StudentRegister/Login.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 80, 460, 460);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HELLO AGAIN!");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 20, 450, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WELCOME TO OUR MEMBER");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 90, 460, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Don't have an account?");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 170, 450, 20);

        btnsingup.setBackground(new java.awt.Color(153, 153, 255));
        btnsingup.setText("SING UP");
        btnsingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsingupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsingup);
        btnsingup.setBounds(200, 210, 80, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 540);

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SING IN YOUR ACCOUNT");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 80, 590, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 280, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Usermane");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 190, 110, 40);

        txtusername.setBackground(new java.awt.Color(204, 153, 255));
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtusername);
        txtusername.setBounds(150, 190, 300, 40);

        txtpassword.setBackground(new java.awt.Color(204, 153, 255));
        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtpassword);
        txtpassword.setBounds(150, 280, 300, 40);

        btnsingin.setBackground(new java.awt.Color(204, 153, 255));
        btnsingin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsingin.setText("SING IN");
        btnsingin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinginActionPerformed(evt);
            }
        });
        jPanel2.add(btnsingin);
        btnsingin.setBounds(180, 360, 240, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(460, 0, 600, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsinginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinginActionPerformed
           String username = txtusername.getText();
           String password = String.valueOf(txtpassword.getPassword());
           boolean Isusername=false;
           boolean Ispassword=false;
           for(int i=0;i<List_Account.listaccount.size();i++){
               if(username.equals(List_Account.listaccount.get(i).getUsername())){
                   Isusername=true;
               }
               if(password.equals(List_Account.listaccount.get(i).getPassword())){
                   Ispassword=true;
               }
           }
           if(Isusername==true && Ispassword==true){
               StudentRegister stu = new StudentRegister();
               stu.setVisible(true);
               dispose();
           }
           if(Isusername==false && Ispassword==true){
               JOptionPane.showMessageDialog(null, "Incorret username...!","SING IN",JOptionPane.ERROR_MESSAGE);
               
           }
           if(Ispassword==false && Isusername==true){
               JOptionPane.showMessageDialog(null, "Incorret password...!","SING IN",JOptionPane.ERROR_MESSAGE);
           }
           if(Ispassword==false && Isusername==false){
               JOptionPane.showMessageDialog(null, "Incorret username and password...!","SING IN",JOptionPane.ERROR_MESSAGE);
           }
           
    }//GEN-LAST:event_btnsinginActionPerformed

    private void btnsingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsingupActionPerformed
        SingUp singup = new SingUp();
        singup.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsingupActionPerformed

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
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Singin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsingin;
    private javax.swing.JButton btnsingup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
