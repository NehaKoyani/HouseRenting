package house_renting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableModel;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
public class updateOwner extends javax.swing.JFrame {

    public updateOwner() {
        initComponents();
        clearData();
        ownerData();
        showBarChart();
    }
     public void showBarChart() {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            try{
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
                PreparedStatement p=con.prepareStatement("select area,COUNT(*) AS count from owner_info GROUP BY area");
                ResultSet r=p.executeQuery();
                while(r.next()){
                    String area=r.getString("area");
                    int count=r.getInt("count");
                    dataset.setValue(count, "Count", area);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
            }

            JFreeChart chart = ChartFactory.createBarChart("Analysis", "Count", "Area",
                    dataset, PlotOrientation.VERTICAL, false, true, false);
            Color backgroundColor = new Color(242,242,242);
            chart.setBackgroundPaint(backgroundColor);
            CategoryPlot categoryPlot = chart.getCategoryPlot();
            categoryPlot.setBackgroundPaint(backgroundColor); // Set background color of the plot
            BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
            Color clr3 = new Color(240,80,80);
            renderer.setSeriesPaint(0, clr3); // Set color for the bars

            NumberAxis rangeAxis = (NumberAxis) categoryPlot.getRangeAxis();
            rangeAxis.setAutoRangeIncludesZero(false); // Exclude zero from the range
            rangeAxis.setLowerBound(0); // Set lower bound of the range
            rangeAxis.setUpperBound(10); // Set upper bound of the range

            renderer.setMaximumBarWidth(0.09); // 10% of the available space

        ChartPanel barChartPanel = new ChartPanel(chart);
        barChartPanel.setPreferredSize(new Dimension(930, 450));
        jPanel5.removeAll();
        jPanel5.add(barChartPanel, BorderLayout.CENTER);
        jPanel5.validate();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        jPanel5 = new javax.swing.JPanel();
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

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Update/Delete Owners");

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

        jPanel4.setBackground(new java.awt.Color(246, 246, 246));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, null, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel15.setText("ID");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel16.setText("Username");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel17.setText("Contact no");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel18.setText("Email");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel19.setText("Age");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel20.setText("City");

        jTextField1.setBackground(new java.awt.Color(246, 246, 246));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jTextField2.setBackground(new java.awt.Color(246, 246, 246));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(246, 246, 246));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jTextField4.setBackground(new java.awt.Color(246, 246, 246));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jTextField5.setBackground(new java.awt.Color(246, 246, 246));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jTextField6.setBackground(new java.awt.Color(246, 246, 246));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(42, 127, 202)));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 21, 21));
        jLabel2.setText("Update Owner");

        rSMaterialButtonRectangle1.setText("Update");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle3.setText("Clear");
        rSMaterialButtonRectangle3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel21.setText("Status");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "block" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(157, 157, 157))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15)))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField5)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMaterialButtonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "contactno", "email", "age", "city", "Status"
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

        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 652, Short.MAX_VALUE))
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
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
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
    public void ownerData(){
        try{
            DefaultTableModel model;
           Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root"); 
           PreparedStatement p=con1.prepareStatement("Select *from owner_info");
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

    private void rSTableMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro2MouseClicked
        // TODO add your handling code here:
        int rowNo=rSTableMetro2.getSelectedRow();
        TableModel model1=rSTableMetro2.getModel();
        jTextField2.setText(model1.getValueAt(rowNo, 0).toString());
        jTextField3.setText(model1.getValueAt(rowNo, 1).toString());
        jTextField4.setText(model1.getValueAt(rowNo, 2).toString());
        jTextField5.setText(model1.getValueAt(rowNo, 3).toString());
        jTextField1.setText(model1.getValueAt(rowNo, 4).toString());
        jTextField6.setText(model1.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_rSTableMetro2MouseClicked

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        String username=jTextField3.getText();
        String contact=jTextField4.getText();
        String email=jTextField5.getText();
        String age=jTextField1.getText();
        String area=jTextField6.getText();
        String id=jTextField2.getText();
        String status=(String)jComboBox1.getSelectedItem();
         if(id.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Id","Error",JOptionPane.ERROR_MESSAGE);
        }
         
         else if(username.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Username","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(contact.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Contactno","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(contact.length()!=10){
            JOptionPane.showMessageDialog(null,"Please Enter valid contactno","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Email","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(age.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter age","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(area.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter area","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root");
                PreparedStatement p=con.prepareStatement("update owner_info set username=?,contact=?,email=?,age=?,area=?,status=? where id=?");
                p.setString(1,username);
                p.setString(2,contact);
                p.setString(3,email);
                p.setString(4,age);
                p.setString(5,area);
                p.setString(6,status);
                p.setString(7,id);
                p.execute();
                clearData();
                ownerData();
                showBarChart();
                jTextField3.setText("");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                JOptionPane.showMessageDialog(null,"Data Updated");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jMenu22MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu22MenuSelected
        // TODO add your handling code here:
                setVisible(false);
        login obj7=new login();
        obj7.setVisible(true);
    }//GEN-LAST:event_jMenu22MenuSelected

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    // End of variables declaration//GEN-END:variables
}
