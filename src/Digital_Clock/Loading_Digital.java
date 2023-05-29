
package Digital_Clock;

import Swing.*;

public class Loading_Digital extends javax.swing.JFrame implements Runnable{

    public Loading_Digital() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
    }
     @Override
    public void run() {
       for(int i = 1;i<=100; i++){
           try{
               Thread.sleep(25);
               prosessbar.setValue(i);
               lbcount.setText(Integer.toString(i)+"%");
               
           }catch (Exception e){
               e.printStackTrace();
           }
           
       }
       Digital_Clock dc = new Digital_Clock();
       dc.setVisible(true);
       dispose();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prosessbar = new javax.swing.JProgressBar();
        lbcount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(621, 395));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Loading\\loading.gif")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 30, 220, 220);

        prosessbar.setBackground(new java.awt.Color(51, 255, 255));
        prosessbar.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(prosessbar);
        prosessbar.setBounds(80, 300, 440, 14);

        lbcount.setBackground(new java.awt.Color(255, 255, 255));
        lbcount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbcount.setForeground(new java.awt.Color(255, 255, 255));
        lbcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbcount);
        lbcount.setBounds(80, 250, 440, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading_Digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading_Digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading_Digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading_Digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading_Digital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcount;
    private javax.swing.JProgressBar prosessbar;
    // End of variables declaration//GEN-END:variables

   

   
}
