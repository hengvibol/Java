
package Database.Student;
import Swing.StudentRegister.List_StudentRegister;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Main_Student extends javax.swing.JFrame {
    
    private PreparedStatement ps; 
    private ResultSet r;
    private String sql;
    private DefaultTableModel model;
    
    private int id;
    private String name,gender,grade;
    private double javaa,cshap,php,total,average;
    DecimalFormat df = new DecimalFormat("###0.00");
    public Main_Student() {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
        Fetchdata();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorLine2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorLine2D();
        app1 = new com.k33ptoo.App();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtjava = new javax.swing.JTextField();
        txtcsharp = new javax.swing.JTextField();
        txtphp = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtaverage = new javax.swing.JTextField();
        txtgrade = new javax.swing.JTextField();
        cmgender = new javax.swing.JComboBox<>();
        tbnsave = new com.k33ptoo.components.KButton();
        btnupdate = new com.k33ptoo.components.KButton();
        btnexit = new com.k33ptoo.components.KButton();
        btnremove = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtable = new rojeru_san.complementos.RSTableMetro();
        cbserch = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        cbsort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Studen Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JAVA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("C#");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PHP");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grade");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Average");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtid.setText("Auto ID");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtjava.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtjava.setText("0");
        txtjava.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjavaKeyReleased(evt);
            }
        });

        txtcsharp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcsharp.setText("0");
        txtcsharp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcsharpKeyReleased(evt);
            }
        });

        txtphp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtphp.setText("0");
        txtphp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtphpKeyReleased(evt);
            }
        });

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtaverage.setEditable(false);
        txtaverage.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtgrade.setEditable(false);
        txtgrade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cmgender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        tbnsave.setText("Save");
        tbnsave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tbnsave.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        tbnsave.setkEndColor(new java.awt.Color(0, 204, 204));
        tbnsave.setkHoverEndColor(new java.awt.Color(0, 204, 51));
        tbnsave.setkHoverForeGround(new java.awt.Color(0, 204, 0));
        tbnsave.setkHoverStartColor(new java.awt.Color(255, 255, 0));
        tbnsave.setkIndicatorColor(new java.awt.Color(255, 255, 51));
        tbnsave.setkPressedColor(new java.awt.Color(0, 204, 51));
        tbnsave.setkSelectedColor(new java.awt.Color(0, 204, 51));
        tbnsave.setkStartColor(new java.awt.Color(0, 204, 204));
        tbnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsaveActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnupdate.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btnupdate.setkEndColor(new java.awt.Color(0, 204, 204));
        btnupdate.setkHoverEndColor(new java.awt.Color(0, 204, 51));
        btnupdate.setkHoverForeGround(new java.awt.Color(0, 204, 0));
        btnupdate.setkHoverStartColor(new java.awt.Color(255, 255, 0));
        btnupdate.setkIndicatorColor(new java.awt.Color(255, 255, 51));
        btnupdate.setkPressedColor(new java.awt.Color(0, 204, 51));
        btnupdate.setkSelectedColor(new java.awt.Color(0, 204, 51));
        btnupdate.setkStartColor(new java.awt.Color(0, 204, 204));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnexit.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btnexit.setkEndColor(new java.awt.Color(0, 204, 204));
        btnexit.setkHoverEndColor(new java.awt.Color(204, 0, 0));
        btnexit.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        btnexit.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnexit.setkIndicatorColor(new java.awt.Color(255, 153, 255));
        btnexit.setkPressedColor(new java.awt.Color(204, 0, 0));
        btnexit.setkSelectedColor(new java.awt.Color(204, 0, 51));
        btnexit.setkStartColor(new java.awt.Color(0, 204, 204));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnremove.setText("Remove");
        btnremove.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnremove.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        btnremove.setkEndColor(new java.awt.Color(0, 204, 204));
        btnremove.setkHoverEndColor(new java.awt.Color(204, 0, 0));
        btnremove.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        btnremove.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        btnremove.setkIndicatorColor(new java.awt.Color(255, 153, 255));
        btnremove.setkPressedColor(new java.awt.Color(204, 0, 0));
        btnremove.setkSelectedColor(new java.awt.Color(204, 0, 51));
        btnremove.setkStartColor(new java.awt.Color(0, 204, 204));
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "GENDER", "JAVA", "C#", "PHP", "TOTAL", "AVERAGE", "GRADE"
            }
        ));
        tbtable.setAltoHead(40);
        tbtable.setColorBackgoundHead(new java.awt.Color(0, 153, 204));
        tbtable.setFuenteHead(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtable);

        cbserch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbserch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search Option", "Search ID", "Search Name" }));
        cbserch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbserchActionPerformed(evt);
            }
        });

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
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

        cbsort.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbsort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort Option", "Sort ID", "Sort Name" }));
        cbsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtjava)
                            .addComponent(txtgrade)
                            .addComponent(txtaverage)
                            .addComponent(txttotal)
                            .addComponent(txtphp)
                            .addComponent(txtcsharp)
                            .addComponent(cmgender, 0, 271, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbserch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbsort, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbserch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbsort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtjava, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtphp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection connection(){
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
    
    private void Fetchdata(){
        try {
            sql="SELECT * FROM student";
            ps=connection().prepareStatement(sql);
            r=ps.executeQuery();
            while(r.next()){
                Object row[]={
                    r.getInt(1),
                    r.getString(2),
                    r.getString(3),
                    r.getDouble(4),
                    r.getDouble(5),
                    r.getDouble(6),
                    r.getDouble(7),
                    r.getDouble(8),
                    r.getString(9)
                };
                model.addRow(row);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void Calculator(){
        average=total/3;
       grade = (average>=90 && average <=100)? "A":
               (average>=80 && average <90)? "B":
               (average>=70 && average <80)? "C":
               (average>=60 && average <70)? "D":
               (average>=50 && average <60)? "E":"F";
       txttotal.setText(df.format(total));
       txtaverage.setText(df.format(average));
       txtgrade.setText(grade);
    }
    private void Clear(){
        txtid.setText("Auto ID");
        txtname.setText("");
        cmgender.setSelectedIndex(0);
        txtjava.setText("");
        txtcsharp.setText("");
        txtphp.setText("");
        txtaverage.setText("");
        txttotal.setText("");
        txtgrade.setText("");
    }
    private void tbnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsaveActionPerformed
        try {
            name = txtname.getText();
            gender = cmgender.getSelectedItem().toString();
            javaa = Double.parseDouble(txtjava.getText());
            cshap = Double.parseDouble(txtcsharp.getText());
            php = Double.parseDouble(txtphp.getText());
            total = Double.parseDouble(txttotal.getText());
            average = Double.parseDouble(txtaverage.getText());
            grade = txtgrade.getText();
            sql = "INSERT INTO student(Name,Gender,Java,Csharp,PHP,Total,Average,Grade) VALUE(?,?,?,?,?,?,?,?)";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setDouble(3, javaa);
            ps.setDouble(4, cshap);
            ps.setDouble(5, php);
            ps.setDouble(6, total);
            ps.setDouble(7, average);
            ps.setString(8, grade);
            int index = ps.executeUpdate();
            if(index>0){
                JOptionPane.showMessageDialog(this,"Save data successful.");
                model.setRowCount(0);
                Fetchdata();
                Clear();
            }else{
                JOptionPane.showMessageDialog(this,"Error Save data...!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_tbnsaveActionPerformed

    private void txtjavaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjavaKeyReleased
         javaa = Double.parseDouble(txtjava.getText());
        total = javaa;
        Calculator();
    }//GEN-LAST:event_txtjavaKeyReleased

    private void txtcsharpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcsharpKeyReleased
         javaa = Double.parseDouble(txtjava.getText());
         cshap = Double.parseDouble(txtcsharp.getText());
        total = javaa+cshap;
        Calculator();
    }//GEN-LAST:event_txtcsharpKeyReleased

    private void txtphpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphpKeyReleased
        javaa = Double.parseDouble(txtjava.getText());
        cshap = Double.parseDouble(txtcsharp.getText());
        php = Double.parseDouble(txtphp.getText());
        total = Double.parseDouble(txttotal.getText());
        average= Double.parseDouble(txtaverage.getText());
        total=javaa+cshap+php;
        Calculator();
    }//GEN-LAST:event_txtphpKeyReleased

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            id = Integer.parseInt(txtid.getText());
            name = txtname.getText();
            gender = cmgender.getSelectedItem().toString();
            javaa = Double.parseDouble(txtjava.getText());
            cshap = Double.parseDouble(txtcsharp.getText());
            php = Double.parseDouble(txtphp.getText());
            total = Double.parseDouble(txttotal.getText());
            average = Double.parseDouble(txtaverage.getText());
            grade = txtgrade.getText();
            sql = "UPDATE student SET Name=?,Gender=?,Java=?,Csharp=?,PHP=?,Total=?,Average=?,Grade=? WHERE ID=?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setDouble(3, javaa);
            ps.setDouble(4, cshap);
            ps.setDouble(5, php);
            ps.setDouble(6, total);
            ps.setDouble(7, average);
            ps.setString(8, grade);
            ps.setInt(9, id);
            int index = ps.executeUpdate();
            if(index>0){
                JOptionPane.showMessageDialog(this,"Update data successful.");
                model.setRowCount(0);
                Fetchdata();
                Clear();
            }else{
                JOptionPane.showMessageDialog(this,"Error Udate data...!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
       int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        cmgender.setSelectedItem(model.getValueAt(row, 2).toString());
        txtjava.setText(model.getValueAt(row, 3).toString());
        txtcsharp.setText(model.getValueAt(row, 4).toString());
        txtphp.setText(model.getValueAt(row, 5).toString());
        txttotal.setText(model.getValueAt(row, 6).toString());
        txtaverage.setText(model.getValueAt(row, 7).toString());
        txtgrade.setText(model.getValueAt(row, 8).toString());
        
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        try {
           int id = Integer.parseInt(txtid.getText());
           sql="DELETE FROM student WHERE ID=?";
           ps=connection().prepareStatement(sql);
           ps.setInt(1, id);
           int index = ps.executeUpdate();
           if(index>0){
                JOptionPane.showMessageDialog(this,"Remove data successful.");
                model.setRowCount(0);
                Fetchdata();
                Clear();
            }else{
                JOptionPane.showMessageDialog(this,"Error remove data...!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void cbsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsortActionPerformed
       int index = cbsort.getSelectedIndex();
        switch(index){
            case 1:{ // Sort ID
                
                
            }break;
            case 2:{ // sort Name
               
            }break;
        }
    }//GEN-LAST:event_cbsortActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        int index;
    }//GEN-LAST:event_txtsearchKeyReleased

    private void cbserchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbserchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbserchActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

   
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
            java.util.logging.Logger.getLogger(Main_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.App app1;
    private com.k33ptoo.components.KButton btnexit;
    private com.k33ptoo.components.KButton btnremove;
    private com.k33ptoo.components.KButton btnupdate;
    private javax.swing.JComboBox<String> cbserch;
    private javax.swing.JComboBox<String> cbsort;
    private javax.swing.JComboBox<String> cmgender;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorLine2D evaluatorLine2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KButton tbnsave;
    private rojeru_san.complementos.RSTableMetro tbtable;
    private javax.swing.JTextField txtaverage;
    private javax.swing.JTextField txtcsharp;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjava;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphp;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
