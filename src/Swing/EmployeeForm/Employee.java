package Swing.EmployeeForm;

import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JFrame { 
    DefaultTableModel model;
    public Employee() {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        rbfemale = new javax.swing.JRadioButton();
        rbmale = new javax.swing.JRadioButton();
        cbposition = new javax.swing.JComboBox<>();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaaddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        cbsearch = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 568));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Information");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(4, 4, 1040, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1040, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Address :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 430, 90, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID           :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 90, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Name     :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 180, 90, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Gender   :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 230, 90, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Position :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 280, 90, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Salary     :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 340, 90, 40);

        txtsalary.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        jPanel1.add(txtsalary);
        txtsalary.setBounds(150, 340, 230, 40);

        txtid.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        jPanel1.add(txtid);
        txtid.setBounds(150, 120, 230, 40);

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        rbfemale.setText("Female");
        jPanel1.add(rbfemale);
        rbfemale.setBounds(290, 230, 80, 40);

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        rbmale.setText("Male");
        jPanel1.add(rbmale);
        rbmale.setBounds(160, 230, 70, 40);

        cbposition.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        cbposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jobs", "Mobile App", "Web Developer", "Designer", "Seller", "Accountant", "Network", "Fluter Developer" }));
        jPanel1.add(cbposition);
        cbposition.setBounds(150, 280, 230, 40);

        txtname.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        jPanel1.add(txtname);
        txtname.setBounds(150, 180, 230, 40);

        txtaaddress.setColumns(20);
        txtaaddress.setFont(new java.awt.Font("!Khmer OS Siemreap", 1, 14)); // NOI18N
        txtaaddress.setRows(5);
        jScrollPane1.setViewportView(txtaaddress);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 420, 230, 70);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "GENDER", "POSITION", "SALARY", "ADDRESS"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(430, 180, 570, 260);

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(860, 120, 100, 35);

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(470, 120, 100, 35);

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(600, 120, 100, 35);

        btnremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove);
        btnremove.setBounds(730, 120, 100, 35);

        cbsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search Option", "ID", "NAME" }));
        cbsearch.setToolTipText("");
        cbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsearchActionPerformed(evt);
            }
        });
        jPanel1.add(cbsearch);
        cbsearch.setBounds(800, 460, 180, 30);

        txtsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch);
        txtsearch.setBounds(600, 460, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Getdate(){
        model.setRowCount(0);
        for(int i=0;i<List_Employee.listemployee.size();i++){
            Object row[]={
                List_Employee.listemployee.get(i).getId(),
                List_Employee.listemployee.get(i).getName(),
                List_Employee.listemployee.get(i).getGender(),
                List_Employee.listemployee.get(i).getPosition(),
                List_Employee.listemployee.get(i).getSalary()+"$",
                List_Employee.listemployee.get(i).getAddress(),
            };
            model.addRow(row);
        }
    }
    private void Clear(){
        txtid.setText("");
        txtname.setText("");
        buttonGroup1.clearSelection();
        cbposition.setSelectedIndex(0);
        txtsalary.setText("");
        txtaaddress.setText("");
    }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender = (rbmale.isSelected())?"Male":"Female";
        String position = cbposition.getSelectedItem().toString();
        float salary = Float.parseFloat(txtsalary.getText());
        String address = txtaaddress.getText();
        List_Employee.listemployee.add(new List_Employee(id, name, gender, position, address, salary));
        Getdate();
        Clear();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender = (rbmale.isSelected())?"Male":"Female";
        String position = cbposition.getSelectedItem().toString();
        float salary = Float.parseFloat(txtsalary.getText());
        String address = txtaaddress.getText();
        int index = tbtable.getSelectedRow();
        List_Employee.listemployee.set(index, new List_Employee(id, name, gender, position, address, salary));
        Getdate();
        Clear();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int index = tbtable.getSelectedRow();
        List_Employee.listemployee.remove(index);
        Getdate();
        Clear();
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
        cbposition.setSelectedItem(model.getValueAt(row, 3).toString());
        String salary = model.getValueAt(row, 4).toString();
        salary = salary.substring(0,salary.length()-1);
        txtsalary.setText(salary);
        txtaaddress.setText(model.getValueAt(row, 5).toString());
        
    }//GEN-LAST:event_tbtableMouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        int index = cbsearch.getSelectedIndex();
        switch(index){
            case 1:{
                boolean b = false;
                int sid = Integer.parseInt(txtsearch.getText());
                for(int i=0;i<List_Employee.listemployee.size();i++){
                    if(sid==List_Employee.listemployee.get(i).getId()){
                        model.setRowCount(0);
                        Object row[]={
                            List_Employee.listemployee.get(i).getId(),
                            List_Employee.listemployee.get(i).getName(),
                            List_Employee.listemployee.get(i).getGender(),
                            List_Employee.listemployee.get(i).getPosition(),
                            List_Employee.listemployee.get(i).getSalary()+"$",
                            List_Employee.listemployee.get(i).getAddress(),
                        };
                        model.addRow(row);
                        b=true;
                    }
                }
                if(b==false){
                    model.setRowCount(0);
                    Getdate();
                }
            }break;
            case 2:{
                boolean b = false;
                String sname = txtsearch.getText();
                for(int i=0;i<List_Employee.listemployee.size();i++){
                    if(sname.equalsIgnoreCase(List_Employee.listemployee.get(i).getName())){
                        model.setRowCount(0);
                        Object row[]={
                            List_Employee.listemployee.get(i).getId(),
                            List_Employee.listemployee.get(i).getName(),
                            List_Employee.listemployee.get(i).getGender(),
                            List_Employee.listemployee.get(i).getPosition(),
                            List_Employee.listemployee.get(i).getSalary()+"$",
                            List_Employee.listemployee.get(i).getAddress(),
                        };
                        model.addRow(row);
                        b=true;
                    }
                }
                if(b==false){
                    model.setRowCount(0);
                    Getdate();
                }
            }break;
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void cbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsearchActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbposition;
    private javax.swing.JComboBox<String> cbsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextArea txtaaddress;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
