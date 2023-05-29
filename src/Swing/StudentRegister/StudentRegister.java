package Swing.StudentRegister;

import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentRegister extends javax.swing.JFrame {
    DefaultTableModel model;
    private float payment[]={500.00f,600.00f,350.00f,700.00f,350.00f,400.00f};
    SimpleDateFormat sdf = new SimpleDateFormat("MMM,dd,yyyy");
    public StudentRegister() {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
        txtprice.setText(String.valueOf(payment[0])+"$");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbgender = new javax.swing.JLabel();
        lbphone = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        lbdate = new javax.swing.JLabel();
        lbprice = new javax.swing.JLabel();
        lbcourse = new javax.swing.JLabel();
        lbroom = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        cbtime = new javax.swing.JComboBox<>();
        rbfemale = new javax.swing.JRadioButton();
        rbmale = new javax.swing.JRadioButton();
        cbcourse = new javax.swing.JComboBox<>();
        cbroom = new javax.swing.JComboBox<>();
        lbimage = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        txtimage = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnimgae = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        cbsort = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        txtloguot = new javax.swing.JButton();
        txtdate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1313, 716));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/StudentRegister/Register.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 470, 510);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Register");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 480, 50);

        lbgender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbgender.setText("Gender");
        jPanel1.add(lbgender);
        lbgender.setBounds(540, 160, 60, 30);

        lbphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbphone.setText("Phone");
        jPanel1.add(lbphone);
        lbphone.setBounds(810, 160, 60, 30);

        lbname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbname.setText("Name");
        jPanel1.add(lbname);
        lbname.setBounds(540, 100, 60, 30);

        lbid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbid.setText("ID");
        jPanel1.add(lbid);
        lbid.setBounds(540, 40, 60, 30);

        lbdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbdate.setText("Date");
        jPanel1.add(lbdate);
        lbdate.setBounds(1070, 160, 60, 30);

        lbprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbprice.setText("Price");
        jPanel1.add(lbprice);
        lbprice.setBounds(810, 100, 60, 30);

        lbcourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbcourse.setText("Course");
        jPanel1.add(lbcourse);
        lbcourse.setBounds(810, 40, 60, 30);

        lbroom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbroom.setText("Room");
        jPanel1.add(lbroom);
        lbroom.setBounds(1070, 40, 60, 30);

        lbtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbtime.setText("Time");
        jPanel1.add(lbtime);
        lbtime.setBounds(1070, 100, 60, 30);

        txtphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtphone);
        txtphone.setBounds(870, 160, 180, 30);

        txtid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtid);
        txtid.setBounds(610, 40, 180, 30);

        txtname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtname);
        txtname.setBounds(610, 100, 180, 30);

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtprice);
        txtprice.setBounds(870, 100, 180, 30);

        cbtime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Evening" }));
        jPanel1.add(cbtime);
        cbtime.setBounds(1130, 100, 180, 30);

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbfemale.setText("Female");
        jPanel1.add(rbfemale);
        rbfemale.setBounds(720, 160, 70, 30);

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbmale.setText("Male");
        jPanel1.add(rbmale);
        rbmale.setBounds(610, 160, 60, 30);

        cbcourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology(IT)", "Information Technolog ​​Engineer(ITE)", "Architecture", "Khmer History", "Khmer Language", "English", " " }));
        cbcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcourseActionPerformed(evt);
            }
        });
        jPanel1.add(cbcourse);
        cbcourse.setBounds(870, 40, 180, 30);

        cbroom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101 A1", "102 A2", "103 A3", "104 A4", "201 E1", "202 E2", "203 E3", "204 E4", "301 M1", "302 M2", "303 M3", "304 M4" }));
        jPanel1.add(cbroom);
        cbroom.setBounds(1130, 40, 180, 30);

        lbimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lbimage);
        lbimage.setBounds(550, 230, 120, 150);

        btnexit.setBackground(new java.awt.Color(204, 204, 204));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(970, 400, 100, 30);

        txtimage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtimage);
        txtimage.setBounds(710, 350, 220, 30);

        btnsave.setBackground(new java.awt.Color(204, 204, 204));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(570, 400, 100, 30);

        btnimgae.setBackground(new java.awt.Color(204, 204, 204));
        btnimgae.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnimgae.setText("Image");
        btnimgae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimgaeActionPerformed(evt);
            }
        });
        jPanel1.add(btnimgae);
        btnimgae.setBounds(710, 310, 90, 30);

        btnremove.setBackground(new java.awt.Color(204, 204, 204));
        btnremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove);
        btnremove.setBounds(830, 400, 100, 30);

        btnupdate.setBackground(new java.awt.Color(204, 204, 204));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(700, 400, 100, 30);

        cbsort.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbsort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort Option", "Sort ID", "Sort Name" }));
        cbsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsortActionPerformed(evt);
            }
        });
        jPanel1.add(cbsort);
        cbsort.setBounds(1110, 400, 160, 30);

        tbtable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Gender", "Course", "Price", "Phone", "Room", "Time", "Date", "Image"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 450, 820, 200);

        txtloguot.setBackground(new java.awt.Color(255, 153, 153));
        txtloguot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtloguot.setText("Log Out");
        txtloguot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloguotActionPerformed(evt);
            }
        });
        jPanel1.add(txtloguot);
        txtloguot.setBounds(220, 570, 110, 40);
        jPanel1.add(txtdate);
        txtdate.setBounds(1130, 160, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-50, 0, 1380, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Getdata(){
        model.setRowCount(0);
        for(int i=0;i<List_StudentRegister.Liststudent.size();i++){
            Object row[]={
            List_StudentRegister.Liststudent.get(i).getId(),
            List_StudentRegister.Liststudent.get(i).getName(),
            List_StudentRegister.Liststudent.get(i).getGender(),
            List_StudentRegister.Liststudent.get(i).getCourse(),
            List_StudentRegister.Liststudent.get(i).getPrice(),
            List_StudentRegister.Liststudent.get(i).getPhone(),
            List_StudentRegister.Liststudent.get(i).getRoom(),
            List_StudentRegister.Liststudent.get(i).getTime(),
            List_StudentRegister.Liststudent.get(i).getDate(),
            List_StudentRegister.Liststudent.get(i).getImage(),    
            };
            model.addRow(row);
        }
    }
    private void Clear(){
        txtid.setText("");
        txtname.setText("");
        buttonGroup1.clearSelection();
        cbcourse.setSelectedIndex(0);
        txtprice.setText("");
        txtphone.setText("");
        cbroom.setSelectedIndex(0);
        cbtime.setSelectedIndex(0);
        txtdate.setDate(null);
        txtimage.setText("");
        lbimage.setIcon(null);
    }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender = (rbmale.isSelected())? "Male" : "Female";
        String course = cbcourse.getSelectedItem().toString();
        String sprice = txtprice.getText();
        sprice=sprice.replace("$", "");
        float price = Float.parseFloat(sprice);
        String phone = txtphone.getText();
        String room = cbroom.getSelectedItem().toString();
        String time = cbtime.getSelectedItem().toString();
        String date = sdf.format(txtdate.getDate());
        String imgae = txtimage.getText();
        List_StudentRegister.Liststudent.add(new List_StudentRegister(id, name, gender, course,price, phone, room, time, date, imgae));
        Getdata();
        Clear();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void cbcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcourseActionPerformed
        txtprice.setText(String.valueOf(payment[cbcourse.getSelectedIndex()])+"$");
    }//GEN-LAST:event_cbcourseActionPerformed

    private void btnimgaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimgaeActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtimage.setText(filename);
        Image getAbsolutePath=null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(lbimage.getWidth(), lbimage.getHeight(), Image.SCALE_SMOOTH);
        lbimage.setIcon(icon);

    }//GEN-LAST:event_btnimgaeActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equals("Male")){
            rbmale.setSelected(true);
        }else{
            rbfemale.setSelected(true);
        }
        cbcourse.setSelectedItem(model.getValueAt(row, 3));
        txtprice.setText(model.getValueAt(row, 4).toString());
        txtphone.setText(model.getValueAt(row, 5).toString());
        cbroom.setSelectedItem(model.getValueAt(row, 6));
        cbtime.setSelectedItem(model.getValueAt(row, 7));
        try{
            java.util.Date st = sdf.parse(model.getValueAt(row, 8).toString());
            txtdate.setDate(st);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        txtimage.setText(model.getValueAt(row, 9).toString());
        lbimage.setIcon(new ImageIcon(model.getValueAt(row, 9).toString()));
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender = (rbmale.isSelected())? "Male" : "Female";
        String course = cbcourse.getSelectedItem().toString();
        String sprice = txtprice.getText();
        sprice=sprice.replace("$", "");
        float price = Float.parseFloat(sprice);
        String phone = txtphone.getText();
        String room = cbroom.getSelectedItem().toString();
        String time = cbtime.getSelectedItem().toString();
        String date = sdf.format(txtdate.getDate());
        String imgae = txtimage.getText();
        int index = tbtable.getSelectedRow();
        List_StudentRegister.Liststudent.set(index, new List_StudentRegister(id, name, gender, course, price, phone, room, time, date, imgae));
        Getdata();
        Clear();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int index = tbtable.getSelectedRow();
        List_StudentRegister.Liststudent.remove(index);
        Getdata();
        Clear();
          
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void cbsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsortActionPerformed
        int index = cbsort.getSelectedIndex();
        switch(index){
            case 1:{ // Sort ID
                Collections.sort(List_StudentRegister.Liststudent,Comparator.comparing(List_StudentRegister::getId));
                model.setRowCount(0);
                Getdata();
            }break;
            case 2:{ // sort Name
                Collections.sort(List_StudentRegister.Liststudent,Comparator.comparing(List_StudentRegister::getName));
                model.setRowCount(0);
                Getdata();
            }break;
        }
    }//GEN-LAST:event_cbsortActionPerformed

    private void txtloguotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloguotActionPerformed
       Singin sin = new Singin();
        sin.setVisible(true);
        dispose();
    }//GEN-LAST:event_txtloguotActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnimgae;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbcourse;
    private javax.swing.JComboBox<String> cbroom;
    private javax.swing.JComboBox<String> cbsort;
    private javax.swing.JComboBox<String> cbtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcourse;
    private javax.swing.JLabel lbdate;
    private javax.swing.JLabel lbgender;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbimage;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbphone;
    private javax.swing.JLabel lbprice;
    private javax.swing.JLabel lbroom;
    private javax.swing.JLabel lbtime;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbtable;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtimage;
    private javax.swing.JButton txtloguot;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
