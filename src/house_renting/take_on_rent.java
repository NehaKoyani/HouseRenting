package house_renting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.TableModel;
import javax.swing.*;
public class take_on_rent extends javax.swing.JFrame {

    public take_on_rent() {
        initComponents();
        clearData();
        comboVal();
        comboVal1();
        houseData();
        clearData1();
        customerData();
    }
    
    public void printData(){
        java.util.Date date = new java.util.Date();
        String ownerId=jLabel20.getText();
        String ownerName=jTextField1.getText();
        String customerID =jLabel21.getText();
        String customerName =jTextField2.getText();
        String houseType =jTextField3.getText();
        String sqft = jTextField4.getText();
        String address = jTextField5.getText();
        String rent = jTextField6.getText();
        String city = jTextField7.getText();
        String commission = jTextField8.getText();

        // Date formatting
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yy");
        String formattedDate = dFormat.format(date);

        // Bill formatting
        String billFormat = "****************************************************\n" +
                    "                      House Renting Platform                   *\n"+
                    "****************************************************\n"+
                    "\t\tDate:" + formattedDate +
                    "\n\nCustomer ID: " + customerID +
                    "\nCustomer Name: " + customerName +
                    "\nHouse Type: " + houseType +
                    "\nSquare Footage: " + sqft +
                    "\nAddress: " + address +
                    "\nRent: " + rent +
                    "\nCity: " + city +
                    "\n--------------------------------------------------------------"+
                    "\nCommission: " + commission +
                    "\n--------------------------------------------------------------"+
                    "\n\n" +
                    "*********************Thank You********************\n";
        jTextArea1.setText(billFormat);
        try{
            jTextArea1.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void comboVal(){
        try{
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
            PreparedStatement p=con.prepareStatement("Select *from house_info");
            ResultSet r=p.executeQuery();
            while(r.next()){
                jComboBox1.addItem(r.getString("city"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    } 
    
    public void comboVal1(){
        try{
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
            PreparedStatement p=con.prepareStatement("Select *from house_info");
            ResultSet r=p.executeQuery();
            while(r.next()){
                jComboBox2.addItem(r.getString("h_type"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }           
  
    
        public void houseData(){
            try{
               DefaultTableModel model;
               Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root"); 
               PreparedStatement p=con1.prepareStatement("Select *from house_info where status=? ");
               p.setString(1,"available");
               ResultSet r=p.executeQuery();
               while(r.next()){
                   String h_id=r.getString(1);
                   String t_id=r.getString(2);
                   String o_name=r.getString(3);
                   String t_type=r.getString(4);
                   String t_sqft=r.getString(5);
                   String t_address=r.getString(6);
                   String t_rent=r.getString(7);
                   String t_city=r.getString(9);

                   Object[] obj={h_id,t_id,o_name,t_type,t_sqft,t_address,t_rent,t_city};
                    model =(DefaultTableModel)rSTableMetro2.getModel();
                    model.addRow(obj);
               }
            }catch(Exception e){
                   JOptionPane.showMessageDialog(null,e);
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane4 = new javax.swing.JScrollPane();
        rSTableMetro3 = new rojeru_san.complementos.RSTableMetro();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(42, 127, 202));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(255, 255, 255));
        rSMaterialButtonCircle1.setForeground(new java.awt.Color(42, 127, 202));
        rSMaterialButtonCircle1.setText("X");
        rSMaterialButtonCircle1.setFont(new java.awt.Font("Roboto Medium", 1, 35)); // NOI18N
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Take On Rent");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "H_ID", "O_ID", "Owner", "Type", "Sqft", "Address", "Rent", "City"
            }
        ));
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(225, 225, 225));
        rSTableMetro2.setColorFilasForeground1(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setColorFilasForeground2(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setColorSelBackgound(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rSTableMetro2.setFuenteFilas(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        rSTableMetro2.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        rSTableMetro2.setFuenteHead(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        rSTableMetro2.setRowHeight(35);
        rSTableMetro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(rSTableMetro2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setText("Type");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel6.setText("City");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel7.setText("Rent");

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5000", "10000", "15000", "25000", "50000", "100000" }));

        rSMaterialButtonRectangle1.setText("Search");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Roboto Medium", 0, 23)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });

        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N

        rSTableMetro3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "contactno", "email", "age", "status"
            }
        ));
        rSTableMetro3.setColorBackgoundHead(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setColorFilasBackgound2(new java.awt.Color(225, 225, 225));
        rSTableMetro3.setColorFilasForeground1(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setColorFilasForeground2(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setColorSelBackgound(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        rSTableMetro3.setRowHeight(45);
        rSTableMetro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(rSTableMetro3);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel9.setText("Customer information");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel10.setText("Take On Rent");

        jLabel11.setBackground(new java.awt.Color(42, 127, 202));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 127, 202));
        jLabel11.setText("Owner");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel12.setBackground(new java.awt.Color(42, 127, 202));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(42, 127, 202));
        jLabel12.setText("Customer");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(42, 127, 202));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(42, 127, 202));
        jLabel13.setText("Type");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(42, 127, 202));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(42, 127, 202));
        jLabel14.setText("Sqft");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel15.setBackground(new java.awt.Color(42, 127, 202));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(42, 127, 202));
        jLabel15.setText("Address");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel16.setBackground(new java.awt.Color(42, 127, 202));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(42, 127, 202));
        jLabel16.setText("City");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(42, 127, 202));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(42, 127, 202));
        jLabel17.setText("Rent");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        rSMaterialButtonRectangle2.setText("Clear");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle3.setText("Take On Rent");
        rSMaterialButtonRectangle3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(42, 127, 202));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(42, 127, 202));
        jLabel18.setText("commission");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addContainerGap(149, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(257, 257, 257))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel16)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jMenu1.setBackground(new java.awt.Color(242, 242, 242));
        jMenu1.setText("Dashboard");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("     ");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Owners");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenu8.setText("Add Owner");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu8.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu8MenuSelected(evt);
            }
        });
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu8);

        jMenu14.setText("Update/Delete owner");
        jMenu14.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu14.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu14MenuSelected(evt);
            }
        });
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu14);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("     ");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Property");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });

        jMenu17.setText("Add Property");
        jMenu17.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu17.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu17MenuSelected(evt);
            }
        });
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu17);

        jMenu18.setText("Update/Delete Property");
        jMenu18.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu18.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu18MenuSelected(evt);
            }
        });
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu18);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("     ");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Customers");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu7.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu7MenuSelected(evt);
            }
        });

        jMenu19.setText("Add customers");
        jMenu19.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu19.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu19MenuSelected(evt);
            }
        });
        jMenu19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu19MouseClicked(evt);
            }
        });
        jMenu7.add(jMenu19);

        jMenu20.setText("Update/Delete customer");
        jMenu20.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu20.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu20MenuSelected(evt);
            }
        });
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenu7.add(jMenu20);

        jMenuBar1.add(jMenu7);

        jMenu9.setText("     ");
        jMenuBar1.add(jMenu9);

        jMenu10.setText("Take On Rent");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jMenu10.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu10MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu11.setText("     ");
        jMenuBar1.add(jMenu11);

        jMenu12.setText("Manage Profile");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu12.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu12MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu12);

        jMenu15.setText("     ");
        jMenuBar1.add(jMenu15);

        jMenu16.setText("Rental Details");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu16.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu16MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu16);

        jMenu21.setText("     ");
        jMenuBar1.add(jMenu21);

        jMenu22.setText("Logout");
        jMenu22.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jMenu22.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu22MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu22);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       public void clearData(){
        DefaultTableModel model2;
        model2 = (DefaultTableModel) rSTableMetro2.getModel();
        model2.setRowCount(0);
    }
    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
        setVisible(false);
        admin_dashboard obj4=new admin_dashboard();
        obj4.setVisible(true);
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected

    }//GEN-LAST:event_jMenu8MenuSelected

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        addOwner obj=new addOwner();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu14MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu14MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu14MenuSelected

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        updateOwner obj1=new updateOwner();
        obj1.setVisible(true);
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected

    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu17MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu17MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu17MenuSelected

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        // TODO add your handling code here:
        setVisible(true);
        addHouse obj2=new addHouse();
        obj2.setVisible(true);
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu18MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu18MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu18MenuSelected

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        updateHouse obj3=new updateHouse();
        obj3.setVisible(true);
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu19MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu19MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu19MenuSelected

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        addCustomer obj4=new addCustomer();
        obj4.setVisible(true);
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu20MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu20MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu20MenuSelected

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        updateCustomer obj5=new updateCustomer();
        obj5.setVisible(true);
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected

    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu10MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu10MenuSelected
        // TODO add your handling code here:
        setVisible(false);
        take_on_rent obj5=new take_on_rent();
        obj5.setVisible(true);
    }//GEN-LAST:event_jMenu10MenuSelected

    private void jMenu12MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu12MenuSelected
        // TODO add your handling code here:
        setVisible(false);
        manage_profile obj6=new manage_profile();
        obj6.setVisible(true);
    }//GEN-LAST:event_jMenu12MenuSelected

    private void jMenu16MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu16MenuSelected
        setVisible(false);
        rentingDetails obj7=new rentingDetails();
        obj7.setVisible(true);
    }//GEN-LAST:event_jMenu16MenuSelected
    
    public void clearData1(){
        DefaultTableModel model2;
        model2 = (DefaultTableModel) rSTableMetro3.getModel();
        model2.setRowCount(0);
    }
    public void customerData(){
        try{
            DefaultTableModel model;
           Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root"); 
           PreparedStatement p=con1.prepareStatement("Select *from customer_info where status=?");
           p.setString(1,"active");
           ResultSet r=p.executeQuery();
           while(r.next()){
               String t_id=r.getString(1);
               String t_name=r.getString(2);
               String t_contact=r.getString(3);
               String t_email=r.getString(4);
               String t_age=r.getString(5);
               String t_status=r.getString(6);
               Object[] obj={t_id,t_name,t_contact,t_email,t_age,t_status};
                model =(DefaultTableModel)rSTableMetro3.getModel();
                model.addRow(obj);
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void jMenu22MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu22MenuSelected
        // TODO add your handling code here:
                setVisible(false);
        login obj7=new login();
        obj7.setVisible(true);
    }//GEN-LAST:event_jMenu22MenuSelected

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
        String owner_name=jTextField1.getText();
        String customer_name=jTextField2.getText();
        String type=jTextField3.getText();
        String sqft=jTextField4.getText();
        String address=jTextField5.getText();
        String city=jTextField7.getText();
        String rent=jTextField6.getText();
        String commission=jTextField8.getText();

        if(owner_name.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter owner name","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(customer_name.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Customer name","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(type.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter house type","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(sqft.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter sqft","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(address.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter address","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(city.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter city","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(rent.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter rent","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(commission.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter commission","Error",JOptionPane.ERROR_MESSAGE);
        }

        else{
            try{
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
                PreparedStatement p=con.prepareStatement("update house_info set status=? where h_id=? ");
                p.setString(1,"unavailable");
                p.setString(2,jLabel19.getText());
                p.execute();
                JOptionPane.showMessageDialog(null,"Successfully take on rent");
                clearData();
                houseData();
                Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
                PreparedStatement p1=con1.prepareStatement("insert into renting_details(owner_id,owner_name,customer_id,customer_name,house_type,sqft,address,rent,city,commission) values(?,?,?,?,?,?,?,?,?,?)");
                p1.setString(1,jLabel20.getText());
                p1.setString(2,jTextField1.getText());
                p1.setString(3,jLabel21.getText());
                p1.setString(4,jTextField2.getText());
                p1.setString(5,jTextField3.getText());
                p1.setString(6,jTextField4.getText());
                p1.setString(7,jTextField5.getText());
                p1.setString(8,jTextField6.getText());
                p1.setString(9,jTextField7.getText());
                p1.setString(10,jTextField8.getText());
                p1.execute();
                printData();
                setVisible(false);
                admin_dashboard obj=new admin_dashboard();
                obj.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        int rent = Integer.parseInt(jTextField6.getText());
        float commission = (float) (rent * 0.25);
        jTextField8.setText(String.valueOf(commission));
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void rSTableMetro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro3MouseClicked
        // TODO add your handling code here:
        int rowNo=rSTableMetro3.getSelectedRow();
        TableModel model1=rSTableMetro3.getModel();
        jLabel21.setText(model1.getValueAt(rowNo, 0).toString());
        jTextField2.setText(model1.getValueAt(rowNo, 1).toString());
    }//GEN-LAST:event_rSTableMetro3MouseClicked

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        String city=(String)jComboBox1.getSelectedItem();
        String type=(String)jComboBox2.getSelectedItem();
        //int minRent = Integer.parseInt(jComboBox4.getSelectedItem().toString());
        int maxRent = Integer.parseInt(jComboBox3.getSelectedItem().toString());
        try{
            clearData();
            DefaultTableModel model;
            Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
            PreparedStatement p1=con1.prepareStatement("Select *from house_info where status=? and city=? and h_type=? and rent between ? and ? ");
            p1.setString(1,"available");
            p1.setString(2,city);
            p1.setString(3,type);
            p1.setInt(4,0);
            p1.setInt(5,maxRent);
            ResultSet r1=p1.executeQuery();
            while(r1.next()){
                String h_id=r1.getString(1);
                String t_id=r1.getString(2);
                String o_name=r1.getString(3);
                String t_type=r1.getString(4);
                String t_sqft=r1.getString(5);
                String t_address=r1.getString(6);
                String t_rent=r1.getString(7);
                String t_city=r1.getString(9);

                Object[] obj={h_id,t_id,o_name,t_type,t_sqft,t_address,t_rent,t_city};
                model =(DefaultTableModel)rSTableMetro2.getModel();
                model.addRow(obj);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void rSTableMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro2MouseClicked
        // TODO add your handling code here:
        int rowNo=rSTableMetro2.getSelectedRow();

        TableModel model1=rSTableMetro2.getModel();
        jLabel19.setText(model1.getValueAt(rowNo, 0).toString());
        jLabel20.setText(model1.getValueAt(rowNo, 1).toString());
        jTextField1.setText(model1.getValueAt(rowNo, 2).toString());
        jTextField3.setText(model1.getValueAt(rowNo, 3).toString());
        jTextField4.setText(model1.getValueAt(rowNo, 4).toString());
        jTextField5.setText(model1.getValueAt(rowNo, 5).toString());
        jTextField7.setText(model1.getValueAt(rowNo, 7).toString());
        jTextField6.setText(model1.getValueAt(rowNo, 6).toString());
    }//GEN-LAST:event_rSTableMetro2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new take_on_rent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro3;
    // End of variables declaration//GEN-END:variables
}
