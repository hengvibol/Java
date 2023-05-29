package Calculator_Project;

import java.awt.Color;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class Calculator extends javax.swing.JFrame {
    private int temp=0;
    private int op;
    private double  value1,value2,result;
    public Calculator() {
        initComponents();
        cbdark.setSelected(true);
        txtresult.setText("0");
        
    }
    public void setNumber(String x){
        temp++;
        if(temp==1){
            txtresult.setText("");
            if(txtresult.getText().equals("")){
                txtresult.setText(x);
            }else{
                txtresult.setText(txtresult.getText()+x);
            }
        }else{
            if(txtresult.getText().equals("")){
                txtresult.setText(x);
            }else{
                txtresult.setText(txtresult.getText()+x);
            }
        }
    }
    public void calculatorNumber(){
        switch(op){
            case 1:{ //+
                value2 = Double.parseDouble(txtresult.getText());
                result = value1+value2;
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+" =");
            }break;
            case 2:{ //-
                value2 = Double.parseDouble(txtresult.getText());
                result = value1-value2;
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+" =");
            }break;
            case 3:{// *
                value2 = Double.parseDouble(txtresult.getText());
                result = value1*value2;
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+" =");
            }break;
            case 4:{ // %
                value2 = Double.parseDouble(txtresult.getText());
                result = value1%value2;
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+" =");
            }break;
            case 5:{ // /
                value2 = Double.parseDouble(txtresult.getText());
                result = value1/value2;
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+" =");
            }break;
            case 6:{
                value2 = Double.parseDouble(txtresult.getText());
                result = pow(value1,value2);
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+" =");
            }break;
            case 7:{
                value2 = Double.parseDouble(txtresult.getText());
                result = pow(value1,1/value2);
                txtresult.setText(String.valueOf(result));
                lbshow.setText(lbshow.getText()+String.valueOf(value2)+")=");
            }break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtresult = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnsin = new javax.swing.JButton();
        btnsum = new javax.swing.JButton();
        btnx2 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btnxy = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btnsqrt = new javax.swing.JButton();
        btntan = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnm = new javax.swing.JButton();
        btnsqrtx = new javax.swing.JButton();
        btnfact = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        bntequal = new javax.swing.JButton();
        btnpn = new javax.swing.JButton();
        btnII = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        lbshow = new javax.swing.JLabel();
        cbdark = new javax.swing.JCheckBox();
        cblight = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font(".Mondulkiri U h", 0, 48)); // NOI18N
        jLabel1.setText("Calculator");

        txtresult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnclear.setBackground(new java.awt.Color(51, 51, 51));
        btnclear.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("C");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnremove.setBackground(new java.awt.Color(51, 51, 51));
        btnremove.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("<−");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(51, 51, 51));
        btndiv.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btndiv.setForeground(new java.awt.Color(255, 255, 255));
        btndiv.setText("%");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnsin.setBackground(new java.awt.Color(51, 51, 51));
        btnsin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnsin.setForeground(new java.awt.Color(255, 255, 255));
        btnsin.setText("Sin");
        btnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinActionPerformed(evt);
            }
        });

        btnsum.setBackground(new java.awt.Color(51, 51, 51));
        btnsum.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsum.setForeground(new java.awt.Color(255, 255, 255));
        btnsum.setText("+");
        btnsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumActionPerformed(evt);
            }
        });

        btnx2.setBackground(new java.awt.Color(51, 51, 51));
        btnx2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnx2.setForeground(new java.awt.Color(255, 255, 255));
        btnx2.setIcon(new javax.swing.ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Math\\x2.png")); // NOI18N
        btnx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx2ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(51, 51, 51));
        btnsub.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsub.setForeground(new java.awt.Color(255, 255, 255));
        btnsub.setText("−");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btnxy.setBackground(new java.awt.Color(51, 51, 51));
        btnxy.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnxy.setForeground(new java.awt.Color(255, 255, 255));
        btnxy.setIcon(new javax.swing.ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Math\\xy.png")); // NOI18N
        btnxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxyActionPerformed(evt);
            }
        });

        btncos.setBackground(new java.awt.Color(51, 51, 51));
        btncos.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btncos.setForeground(new java.awt.Color(255, 255, 255));
        btncos.setText("Cos");
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnmul.setBackground(new java.awt.Color(51, 51, 51));
        btnmul.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnmul.setForeground(new java.awt.Color(255, 255, 255));
        btnmul.setText("×");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btnsqrt.setBackground(new java.awt.Color(51, 51, 51));
        btnsqrt.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsqrt.setForeground(new java.awt.Color(255, 255, 255));
        btnsqrt.setIcon(new javax.swing.ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Math\\x.png")); // NOI18N
        btnsqrt.setText("C");
        btnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtActionPerformed(evt);
            }
        });

        btntan.setBackground(new java.awt.Color(51, 51, 51));
        btntan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btntan.setForeground(new java.awt.Color(255, 255, 255));
        btntan.setText("Tan");
        btntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnm.setBackground(new java.awt.Color(51, 51, 51));
        btnm.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnm.setForeground(new java.awt.Color(255, 255, 255));
        btnm.setText("/");
        btnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmActionPerformed(evt);
            }
        });

        btnsqrtx.setBackground(new java.awt.Color(51, 51, 51));
        btnsqrtx.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsqrtx.setForeground(new java.awt.Color(255, 255, 255));
        btnsqrtx.setIcon(new javax.swing.ImageIcon("D:\\JAVALEARNING_ETEC\\JAVA_Programming_Image\\Math\\y.png")); // NOI18N
        btnsqrtx.setText("C");
        btnsqrtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtxActionPerformed(evt);
            }
        });

        btnfact.setBackground(new java.awt.Color(51, 51, 51));
        btnfact.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnfact.setForeground(new java.awt.Color(255, 255, 255));
        btnfact.setText("x!");
        btnfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btndot.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btndot.setText("∙");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        bntequal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        bntequal.setText("=");
        bntequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntequalActionPerformed(evt);
            }
        });

        btnpn.setBackground(new java.awt.Color(51, 51, 51));
        btnpn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnpn.setForeground(new java.awt.Color(255, 255, 255));
        btnpn.setText("+/-");
        btnpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpnActionPerformed(evt);
            }
        });

        btnII.setBackground(new java.awt.Color(51, 51, 51));
        btnII.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnII.setForeground(new java.awt.Color(255, 255, 255));
        btnII.setText("π");
        btnII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIIActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(51, 51, 51));
        jButton30.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("1/x");

        lbshow.setBackground(new java.awt.Color(204, 204, 204));
        lbshow.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbshow, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnm, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsqrtx, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnfact, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btntan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnsum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntequal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnII, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbshow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrtx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntequal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnII, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        buttonGroup1.add(cbdark);
        cbdark.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbdark.setText("Dark");
        cbdark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdarkActionPerformed(evt);
            }
        });

        buttonGroup1.add(cblight);
        cblight.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cblight.setText("Light");
        cblight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(cblight, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbdark, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbdark, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cblight, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtresult.setText("0");
        temp=0;
        lbshow.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        setNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void cbdarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdarkActionPerformed
        Panel.setBackground(new Color(102, 102, 102));
        cblight.setForeground(new Color(225, 255, 255));
        cbdark.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_cbdarkActionPerformed

    private void cblightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblightActionPerformed
        Panel.setBackground(Color.white);
        cblight.setForeground(new Color(51, 51, 51));
        cbdark.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_cblightActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        setNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        setNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        setNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        setNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        setNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        setNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        setNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        setNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        setNumber("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if(txtresult.getText().contains(".")==false){
            txtresult.setText(txtresult.getText()+".");
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        String number = txtresult.getText();
        number = number.substring(0,number.length()-1);
        txtresult.setText(number);
        if(number.length()==0){
            txtresult.setText("0");
            temp=0;
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpnActionPerformed
        String data = txtresult.getText();
        if(data.contains("-")){
            data=data.substring(1,data.length());
            txtresult.setText(data);
        }else{
            txtresult.setText("-"+data);
        }
    }//GEN-LAST:event_btnpnActionPerformed

    private void btnsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText(String.valueOf(value1)+" + ");
        txtresult.setText("");
        op=1;
    }//GEN-LAST:event_btnsumActionPerformed

    private void bntequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntequalActionPerformed
       calculatorNumber();
    }//GEN-LAST:event_bntequalActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText(String.valueOf(value1)+" - ");
        txtresult.setText("");
        op=2;
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText(String.valueOf(value1)+" * ");
        txtresult.setText("");
        op=3;
    }//GEN-LAST:event_btnmulActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText(String.valueOf(value1)+" % ");
        txtresult.setText("");
        op=4;
    }//GEN-LAST:event_btndivActionPerformed

    private void btnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText(String.valueOf(value1)+" / ");
        txtresult.setText("");
        op=5;
    }//GEN-LAST:event_btnmActionPerformed

    private void btnx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx2ActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        txtresult.setText(String.valueOf(pow(value1,2)));
        lbshow.setText("Pow("+value1+")");
    }//GEN-LAST:event_btnx2ActionPerformed

    private void btnxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxyActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText(String.valueOf(value1)+"^");
        txtresult.setText("");
        op=6;
        
    }//GEN-LAST:event_btnxyActionPerformed

    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrtActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        txtresult.setText(String.valueOf(sqrt(value1)));
        lbshow.setText("sqrt("+value1+")=");
    }//GEN-LAST:event_btnsqrtActionPerformed

    private void btnsqrtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrtxActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        lbshow.setText("Pow("+value1+",1/");
        txtresult.setText("");
        op=7;
    }//GEN-LAST:event_btnsqrtxActionPerformed

    private void btnIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIIActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        txtresult.setText(String.valueOf(3.14*value1));
        lbshow.setText(String.valueOf(value1)+"π");
    }//GEN-LAST:event_btnIIActionPerformed

    private void btnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        txtresult.setText(String.valueOf(sin(value1)));
        lbshow.setText("Sin("+value1+")=");
    }//GEN-LAST:event_btnsinActionPerformed

    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        txtresult.setText(String.valueOf(cos(value1)));
        lbshow.setText("cos("+value1+")=");
    }//GEN-LAST:event_btncosActionPerformed

    private void btntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        txtresult.setText(String.valueOf(tan(value1)));
        lbshow.setText("tan("+value1+")=");
    }//GEN-LAST:event_btntanActionPerformed

    private void btnfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactActionPerformed
        value1 = Double.parseDouble(txtresult.getText());
        double f=1;
        for(int i=1;i<=value1;i++){
            f*=i;
        }
        txtresult.setText(String.valueOf(f));
        lbshow.setText(value1+"!");
    }//GEN-LAST:event_btnfactActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton bntequal;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnII;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnfact;
    private javax.swing.JButton btnm;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnpn;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsin;
    private javax.swing.JButton btnsqrt;
    private javax.swing.JButton btnsqrtx;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btnsum;
    private javax.swing.JButton btntan;
    private javax.swing.JButton btnx2;
    private javax.swing.JButton btnxy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbdark;
    private javax.swing.JCheckBox cblight;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbshow;
    private javax.swing.JTextField txtresult;
    // End of variables declaration//GEN-END:variables

    private Object sprt(double value1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
