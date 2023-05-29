package Swing.StudentRegister;

import javax.swing.JOptionPane;

public class SingUp extends javax.swing.JFrame {
    public SingUp() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsingin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnregister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcomfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1051, 540));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/StudentRegister/TeacherRegister.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 50, 460, 490);

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
        jLabel7.setText("I'm a member.!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 150, 450, 20);

        btnsingin.setBackground(new java.awt.Color(153, 153, 255));
        btnsingin.setText("SING IN");
        btnsingin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinginActionPerformed(evt);
            }
        });
        jPanel1.add(btnsingin);
        btnsingin.setBounds(190, 190, 80, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 540);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" REGISTER YOUR ACCOUNT");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 40, 590, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 240, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Usermane");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 150, 110, 40);

        txtusername.setBackground(new java.awt.Color(153, 153, 255));
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtusername);
        txtusername.setBounds(150, 150, 300, 40);

        txtpassword.setBackground(new java.awt.Color(153, 153, 255));
        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtpassword);
        txtpassword.setBounds(150, 240, 300, 40);

        btnregister.setBackground(new java.awt.Color(153, 153, 255));
        btnregister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister);
        btnregister.setBounds(180, 390, 240, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Comfirm ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 320, 90, 40);

        txtcomfirm.setBackground(new java.awt.Color(153, 153, 255));
        txtcomfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcomfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtcomfirm);
        txtcomfirm.setBounds(150, 320, 300, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(460, 0, 600, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void Clear(){
    txtusername.setText("");
    txtpassword.setText("");
    txtcomfirm.setText("");
   }
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
            String username = txtusername.getText();
            String password = String.valueOf(txtpassword.getPassword());
            String comfirm = String.valueOf(txtcomfirm.getPassword());
            if(username.equals("") || password.equals("") || comfirm.equals("")){
                JOptionPane.showMessageDialog(null, "Please create your account", "REGISTER", JOptionPane.ERROR_MESSAGE);
            }else{
                if(password.equals(comfirm)){
                    List_Account.listaccount.add(new List_Account(username, password)); 
                    JOptionPane.showMessageDialog(null, "create your account successful.");
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect confirm password","REGISTER",JOptionPane.ERROR_MESSAGE);
                }
            }
            Clear();
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnsinginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinginActionPerformed
        Singin sin = new Singin();
        sin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsinginActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnsingin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtcomfirm;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
