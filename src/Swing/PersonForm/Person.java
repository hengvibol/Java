package Swing.PersonForm;

import javax.swing.table.DefaultTableModel;

public class Person extends javax.swing.JFrame{
    DefaultTableModel model;
    public Person() {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        rbfemale = new javax.swing.JRadioButton();
        rbmale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(727, 362));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 60);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Age :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 180, 50, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 30, 50, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Name :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 80, 50, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Gender :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 130, 70, 30);

        txtage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtage);
        txtage.setBounds(120, 180, 170, 30);

        txtid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtid);
        txtid.setBounds(120, 30, 170, 30);

        txtname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtname);
        txtname.setBounds(120, 80, 170, 30);

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbfemale.setText("Female");
        jPanel2.add(rbfemale);
        rbfemale.setBounds(210, 130, 80, 27);

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbmale.setText("Male");
        jPanel2.add(rbmale);
        rbmale.setBounds(120, 130, 60, 27);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "GENDER", "AGE"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(310, 30, 390, 180);

        btnexit.setBackground(new java.awt.Color(204, 204, 255));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel2.add(btnexit);
        btnexit.setBounds(600, 230, 80, 30);

        btnsave.setBackground(new java.awt.Color(204, 204, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnsave);
        btnsave.setBounds(330, 230, 80, 30);

        btnupdate.setBackground(new java.awt.Color(204, 204, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate);
        btnupdate.setBounds(420, 230, 80, 30);

        btnremove.setBackground(new java.awt.Color(204, 204, 255));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnremove);
        btnremove.setBounds(510, 230, 80, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 730, 310);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Getdata(){
        model.setRowCount(0);
        for(int i =0;i<List_Person.listperson.size();i++){
            Object rom[]={
            List_Person.listperson.get(i).getId(),
            List_Person.listperson.get(i).getName(),
            List_Person.listperson.get(i).getGender(),
            List_Person.listperson.get(i).getAge(),
            };
            model.addRow(rom);
        }
    }
    private void Clear(){
        txtid.setText("");
        txtname.setText("");
        buttonGroup1.clearSelection();
        txtage.setText("");
    }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender = (rbmale.isSelected()) ? "Male":"Female";
        int age = Integer.parseInt(txtage.getText());
        List_Person.listperson.add(new List_Person(id, name, gender, age));
        Getdata();
        Clear();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender = (rbmale.isSelected()) ? "Male":"Female";
        int age = Integer.parseInt(txtage.getText());
        int index = tbtable.getSelectedRow();
        List_Person.listperson.set(index, new List_Person(id, name, gender, age));
        Getdata();
        Clear();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equalsIgnoreCase("Male")){
            rbmale.setSelected(true);
        }else {
            rbfemale.setSelected(true);
        }
        txtage.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int index = tbtable.getSelectedRow();
        List_Person.listperson.remove(index);
        Getdata();
        Clear();
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Person().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
