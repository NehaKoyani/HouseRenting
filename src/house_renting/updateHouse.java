package house_renting;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class updateHouse extends javax.swing.JFrame {

    public updateHouse() {
        initComponents();
        clearData1();
        customerData();
        clearData();
        houseData();
    }
    
    public void customerData(){
        try{
            DefaultTableModel model;
           Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root"); 
           PreparedStatement p=con1.prepareStatement("Select *from owner_info where status=?");
           p.setString(1,"active");
           ResultSet r=p.executeQuery();
           while(r.next()){
               String t_id=r.getString(1);
               String t_name=r.getString(2);
               String t_contact=r.getString(3);
               String t_email=r.getString(4);
               String t_age=r.getString(5);
               String t_area=r.getString(6);
               String t_status=r.getString(7);
               Object[] obj={t_id,t_name,t_contact,t_email,t_age,t_area,t_status};
                model =(DefaultTableModel)rSTableMetro2.getModel();
                model.addRow(obj);
           }
        }catch(Exception e){
            
        }
    }

     public void clearData1(){
        DefaultTableModel model2;
        model2 = (DefaultTableModel) rSTableMetro3.getModel();
        model2.setRowCount(0);
    }
     
     public void clearData(){
        DefaultTableModel model2;
        model2 = (DefaultTableModel) rSTableMetro3.getModel();
        model2.setRowCount(0);
    }
    public void houseData(){
        try{
            DefaultTableModel model;
           Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root"); 
           PreparedStatement p=con1.prepareStatement("Select *from house_info");
           ResultSet r=p.executeQuery();
           while(r.next()){
               String t_id=r.getString(1);
               String o_name=r.getString(3);
               String t_type=r.getString(4);
               String t_sqft=r.getString(5);
               String t_address=r.getString(6);
               String t_rent=r.getString(7);
               String t_status=r.getString(8);
               String t_city=r.getString(9);
               
               Object[] obj={t_id,o_name,t_type,t_sqft,t_address,t_rent,t_status,t_city};
                model =(DefaultTableModel)rSTableMetro3.getModel();
                model.addRow(obj);
           }
        }catch(Exception e){
            
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rSTableMetro3 = new rojeru_san.complementos.RSTableMetro();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminIcons/male_user_50px.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(210, 210, 210));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 210, 210));
        jLabel3.setText("Admin");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Property");

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
                .addGap(698, 698, 698)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(24, 24, 24)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(246, 246, 246));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, null, java.awt.Color.black, java.awt.Color.gray));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel16.setText("Owner");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel17.setText("Type");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel18.setText("Sqft");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel19.setText("Rent");

        jTextField1.setBackground(new java.awt.Color(246, 246, 246));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jTextField5.setBackground(new java.awt.Color(246, 246, 246));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 21, 21));
        jLabel2.setText("Update Property Detail");

        rSMaterialButtonRectangle1.setText("update");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle2.setText("Delete");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duplex", "Flat", "Bunglows", "Shops", "Shades" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel20.setText("Address");

        jTextField2.setBackground(new java.awt.Color(246, 246, 246));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel21.setText("HouseID");

        rSMaterialButtonRectangle3.setText("Clear");
        rSMaterialButtonRectangle3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel24.setText("Status");

        jComboBox2.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "unavailable" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(100, 100, 100))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(102, 102, 102)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField2)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel16))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(49, 49, 49))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel6.setText("Property Information");

        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N

        rSTableMetro3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Owner", "type", "Sqft", "address", "Rent", "Status", "City"
            }
        ));
        rSTableMetro3.setColorBackgoundHead(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setColorFilasBackgound2(new java.awt.Color(225, 225, 225));
        rSTableMetro3.setColorFilasForeground1(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setColorFilasForeground2(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setColorSelBackgound(new java.awt.Color(42, 127, 202));
        rSTableMetro3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        rSTableMetro3.setRowHeight(35);
        rSTableMetro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(rSTableMetro3);

        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "contactno", "email", "age", "City", "Status"
            }
        ));
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(225, 225, 225));
        rSTableMetro2.setColorFilasForeground1(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setColorFilasForeground2(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setColorSelBackgound(new java.awt.Color(42, 127, 202));
        rSTableMetro2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        rSTableMetro2.setRowHeight(35);
        rSTableMetro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(rSTableMetro2);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel7.setText(" Owner Information");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)))
                .addContainerGap(1020, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(886, 886, 886)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1762, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 680, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel7)
                    .addContainerGap(1536, Short.MAX_VALUE)))
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
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
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
        jMenu10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

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
        setVisible(false);
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

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        String houseid=jLabel22.getText();
        String ownername=jLabel23.getText();
        String type=(String)jComboBox1.getSelectedItem();
        String sqft=jTextField5.getText();
        String address=jTextField2.getText();
        String rent=jTextField1.getText();
        String status=(String)jComboBox2.getSelectedItem();
        String city=jLabel8.getText();
        if(houseid.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter ownerid","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(ownername.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter ownerid","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(type.equals("")){
            JOptionPane.showMessageDialog(null,"Please select house type","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(sqft.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Sqft","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter address","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(rent.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Rent","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            try{
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
                PreparedStatement p=con.prepareStatement("update house_info set h_type=?,sqft=?,address=?,rent=?,status=? where h_id=?");
                p.setString(1,type);
                p.setString(2,sqft);
                p.setString(3,address);
                p.setString(4,rent);
                p.setString(5,status);
                p.setString(6,houseid);
                p.executeUpdate();
                clearData();
                houseData();
                jTextField5.setText("");
                jTextField2.setText("");
                jTextField1.setText("");
                JOptionPane.showMessageDialog(null,"Data updated");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    
    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
        String ownerid=jLabel22.getText();
        String ownername=jLabel23.getText();
        String type=(String)jComboBox1.getSelectedItem();
        String sqft=jTextField5.getText();
        String address=jTextField2.getText();
        String rent=jTextField1.getText();
        String status=(String)jComboBox2.getSelectedItem();
        if(ownerid.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter ownerid","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(ownername.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter ownerid","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(type.equals("")){
            JOptionPane.showMessageDialog(null,"Please select house type","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(sqft.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Sqft","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter address","Error",JOptionPane.ERROR_MESSAGE);
        }

        else if(rent.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Rent","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            try{
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
                PreparedStatement p=con.prepareStatement("delete from house_info where id=?");
                p.setString(1,ownerid);
                p.execute();
                clearData();
                houseData();
                jTextField5.setText("");
                jTextField2.setText("");
                jTextField1.setText("");
                JOptionPane.showMessageDialog(null,"Data Deleted");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void rSTableMetro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro3MouseClicked
        // TODO add your handling code here:
        int rowNo=rSTableMetro3.getSelectedRow();
        TableModel model1=rSTableMetro3.getModel();
        jLabel22.setText(model1.getValueAt(rowNo, 0).toString());
        jLabel23.setText(model1.getValueAt(rowNo, 1).toString());
        jTextField5.setText(model1.getValueAt(rowNo, 3).toString());
        jTextField2.setText(model1.getValueAt(rowNo, 4).toString());
        jTextField1.setText(model1.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_rSTableMetro3MouseClicked

    private void rSTableMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSTableMetro2MouseClicked

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
        jLabel22.setText("");
        jLabel23.setText("");
        jTextField5.setText("");
        jTextField2.setText("");
        jTextField1.setText("");        
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void jMenu22MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu22MenuSelected
        // TODO add your handling code here:
                setVisible(false);
        login obj7=new login();
        obj7.setVisible(true);
    }//GEN-LAST:event_jMenu22MenuSelected

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro3;
    // End of variables declaration//GEN-END:variables
}
