package house_renting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class admin_dashboard extends javax.swing.JFrame {

    public admin_dashboard() {
        initComponents();
        clearData();
        rentalData();
        showPieChart();
        showLineChart();
    }
    
     public void showLineChart(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting", "root", "root");
            PreparedStatement p = con.prepareStatement("SELECT city, COUNT(*) AS count FROM renting_details GROUP BY city");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                String city = r.getString("city");
                int count = r.getInt("count");
                dataset.addValue(count, "Count", city);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }  

        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Analys city","City","Count", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
       Color c=new Color(240,240,240); 
       lineCategoryPlot.setBackgroundPaint(c);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        jPanel5.removeAll();
        jPanel5.add(lineChartPanel, BorderLayout.CENTER);
        jPanel5.validate();
    }

    
    public void showPieChart(){
        
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting", "root", "root");
            PreparedStatement p = con.prepareStatement("SELECT house_type, COUNT(*) AS count FROM renting_details GROUP BY house_type");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                String status = r.getString("house_type");
                int count = r.getInt("count");
                barDataset.setValue(status, count);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }  

            //create chart
             JFreeChart piechart = ChartFactory.createPieChart("Renting Details",barDataset, false,true,false);//explain

              PiePlot piePlot =(PiePlot) piechart.getPlot();

               piePlot.setSectionPaint("Apartment", Color.BLUE);
                piePlot.setSectionPaint("House", new Color(100,10,240));
                piePlot.setSectionPaint("Villa", Color.RED);
    
              Color c=new Color(240,240,240);
              piePlot.setBackgroundPaint(c);

              //create chartPanel to display chart(graph)
              ChartPanel barChartPanel = new ChartPanel(piechart);
              jPanel4.removeAll();
              jPanel4.add(barChartPanel, BorderLayout.CENTER);
              jPanel4.validate();
        }
    
    public void clearData(){
        DefaultTableModel model2;
        model2 = (DefaultTableModel) rSTableMetro4.getModel();
        model2.setRowCount(0);
    }
    public void rentalData(){
        try{
            DefaultTableModel model;
           Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/house_renting","root","root"); 
           PreparedStatement p=con1.prepareStatement("Select *from renting_details");
           ResultSet r=p.executeQuery();
           while(r.next()){
               String t_oid=r.getString(1);
               String t_oname=r.getString(2);
               String t_cid=r.getString(3);
               String t_cname=r.getString(4);
               String t_type=r.getString(5);
               String t_sqft=r.getString(6);
               String t_address=r.getString(7);
               String t_rent=r.getString(8);
               String t_city=r.getString(9);
               String t_commission=r.getString(10);
               
               Object[] obj={t_oid,t_oname,t_cid,t_cname,t_type,t_sqft,t_address,t_rent,t_city,t_commission};
                model =(DefaultTableModel)rSTableMetro4.getModel();
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
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        rSTableMetro4 = new rojeru_san.complementos.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(42, 127, 202));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("House Renting Platform");

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
        jLabel3.setText("Welcome,Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(700, 700, 700))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel6.setText("Rental information");

        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N

        rSTableMetro4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OwnerID", "OwnerName", "CustomerID", "CustomerName", "H_type", "Sqft", "Address", "Rent", "City", "Commission"
            }
        ));
        rSTableMetro4.setColorBackgoundHead(new java.awt.Color(42, 127, 202));
        rSTableMetro4.setColorFilasBackgound2(new java.awt.Color(225, 225, 225));
        rSTableMetro4.setColorFilasForeground1(new java.awt.Color(42, 127, 202));
        rSTableMetro4.setColorFilasForeground2(new java.awt.Color(42, 127, 202));
        rSTableMetro4.setColorSelBackgound(new java.awt.Color(42, 127, 202));
        rSTableMetro4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        rSTableMetro4.setRowHeight(35);
        jScrollPane5.setViewportView(rSTableMetro4);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1746, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(712, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 873, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(242, 242, 242));
        jMenu1.setText("Dashboard");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
        setVisible(false);
        admin_dashboard obj4=new admin_dashboard();
        obj4.setVisible(true);
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MenuSelected

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

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected

    }//GEN-LAST:event_jMenu8MenuSelected

    private void jMenu14MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu14MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu14MenuSelected

    private void jMenu17MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu17MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu17MenuSelected

    private void jMenu18MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu18MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu18MenuSelected

    private void jMenu19MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu19MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu19MenuSelected

    private void jMenu20MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu20MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu20MenuSelected

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        addOwner obj=new addOwner();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        updateOwner obj1=new updateOwner();
        obj1.setVisible(true);
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        // TODO add your handling code here:
        setVisible(true);
        addHouse obj2=new addHouse();
        obj2.setVisible(true);
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        updateHouse obj3=new updateHouse();
        obj3.setVisible(true);
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        addCustomer obj4=new addCustomer();
        obj4.setVisible(true);
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        updateCustomer obj5=new updateCustomer();
        obj5.setVisible(true);
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu22MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu22MenuSelected
        // TODO add your handling code here:
        setVisible(false);
        login obj7=new login();
        obj7.setVisible(true);
    }//GEN-LAST:event_jMenu22MenuSelected

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro4;
    // End of variables declaration//GEN-END:variables
}
