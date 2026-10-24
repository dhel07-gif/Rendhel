package jurial_obo_system_oop;

import java.awt.Color;

public class studentInterface extends javax.swing.JFrame {

    Color beige = new Color(229, 221, 209);

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(studentInterface.class.getName());

    public studentInterface() {
        initComponents();
        setResizable(false);
        setSize(1200, 775);
        setTitle("Student Interface");
        getContentPane().setBackground(beige);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new Panel_Shapes.circlePanel();
        studentFirstChar = new javax.swing.JLabel();
        studentFirstname = new javax.swing.JLabel();
        menuPanelBG = new Panel_Shapes.LeftRoundPanel();
        menuItemLabel = new javax.swing.JLabel();
        ordersPanelBG = new Panel_Shapes.LeftRoundPanel();
        ordersLabel = new javax.swing.JLabel();
        historyPanelBG = new Panel_Shapes.LeftRoundPanel();
        historyLabel = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        menuItemsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        orderPanel = new javax.swing.JPanel();
        historyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(115, 138, 110));

        jPanel2.setBackground(new java.awt.Color(52, 76, 61));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        studentFirstChar.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        studentFirstChar.setForeground(new java.awt.Color(0, 0, 0));
        studentFirstChar.setText("J");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentFirstChar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentFirstChar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        studentFirstname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentFirstname.setForeground(new java.awt.Color(0, 0, 0));
        studentFirstname.setText("Juan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(studentFirstname)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentFirstname)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        menuPanelBG.setBackground(new java.awt.Color(229, 221, 209));
        menuPanelBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelBGMouseClicked(evt);
            }
        });

        menuItemLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        menuItemLabel.setForeground(new java.awt.Color(51, 51, 51));
        menuItemLabel.setText("MENU ITEMS");

        javax.swing.GroupLayout menuPanelBGLayout = new javax.swing.GroupLayout(menuPanelBG);
        menuPanelBG.setLayout(menuPanelBGLayout);
        menuPanelBGLayout.setHorizontalGroup(
            menuPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(menuPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPanelBGLayout.createSequentialGroup()
                    .addGap(0, 59, Short.MAX_VALUE)
                    .addComponent(menuItemLabel)
                    .addGap(0, 60, Short.MAX_VALUE)))
        );
        menuPanelBGLayout.setVerticalGroup(
            menuPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(menuPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPanelBGLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(menuItemLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ordersPanelBG.setBackground(new java.awt.Color(115, 138, 110));
        ordersPanelBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersPanelBGMouseClicked(evt);
            }
        });

        ordersLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        ordersLabel.setForeground(new java.awt.Color(255, 255, 255));
        ordersLabel.setText("ORDERS");

        javax.swing.GroupLayout ordersPanelBGLayout = new javax.swing.GroupLayout(ordersPanelBG);
        ordersPanelBG.setLayout(ordersPanelBGLayout);
        ordersPanelBGLayout.setHorizontalGroup(
            ordersPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ordersPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ordersPanelBGLayout.createSequentialGroup()
                    .addGap(0, 79, Short.MAX_VALUE)
                    .addComponent(ordersLabel)
                    .addGap(0, 82, Short.MAX_VALUE)))
        );
        ordersPanelBGLayout.setVerticalGroup(
            ordersPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(ordersPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ordersPanelBGLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ordersLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        historyPanelBG.setBackground(new java.awt.Color(115, 138, 110));
        historyPanelBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyPanelBGMouseClicked(evt);
            }
        });

        historyLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        historyLabel.setForeground(new java.awt.Color(255, 255, 255));
        historyLabel.setText("HISTORY");

        javax.swing.GroupLayout historyPanelBGLayout = new javax.swing.GroupLayout(historyPanelBG);
        historyPanelBG.setLayout(historyPanelBGLayout);
        historyPanelBGLayout.setHorizontalGroup(
            historyPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(historyPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(historyPanelBGLayout.createSequentialGroup()
                    .addGap(0, 76, Short.MAX_VALUE)
                    .addComponent(historyLabel)
                    .addGap(0, 80, Short.MAX_VALUE)))
        );
        historyPanelBGLayout.setVerticalGroup(
            historyPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(historyPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(historyPanelBGLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(historyLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historyPanelBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ordersPanelBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordersPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historyPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        parentPanel.setBackground(new java.awt.Color(191, 207, 187));
        parentPanel.setLayout(new java.awt.CardLayout());

        menuItemsPanel.setBackground(new java.awt.Color(229, 221, 209));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Search Item");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Find");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Category", "Price", "Stock Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout menuItemsPanelLayout = new javax.swing.GroupLayout(menuItemsPanel);
        menuItemsPanel.setLayout(menuItemsPanelLayout);
        menuItemsPanelLayout.setHorizontalGroup(
            menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(menuItemsPanelLayout.createSequentialGroup()
                            .addComponent(jTextField1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        menuItemsPanelLayout.setVerticalGroup(
            menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        parentPanel.add(menuItemsPanel, "card2");

        orderPanel.setBackground(new java.awt.Color(229, 221, 209));

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        parentPanel.add(orderPanel, "card3");

        historyPanel.setBackground(new java.awt.Color(229, 221, 209));

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        parentPanel.add(historyPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ordersPanelBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersPanelBGMouseClicked
        java.awt.CardLayout cl = (java.awt.CardLayout) parentPanel.getLayout();
        cl.show(parentPanel, "card3");
        setTitle("Orders List");
        //orders
        ordersPanelBG.setBackground(new Color(229,221,209));
        ordersLabel.setForeground(new Color(51,51,51));
        //menu
        menuPanelBG.setBackground(new Color(115,138,110));
        menuItemLabel.setForeground(new Color(255,255,255));
        //history
        historyPanelBG.setBackground(new Color(115,138,110));
        historyLabel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ordersPanelBGMouseClicked

    private void historyPanelBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelBGMouseClicked
        java.awt.CardLayout cl = (java.awt.CardLayout) parentPanel.getLayout();
        cl.show(parentPanel, "card4");
        setTitle("Purchase History");
        //history
        historyPanelBG.setBackground(new Color(229,221,209));
        historyLabel.setForeground(new Color(51,51,51));
        //menu
        menuPanelBG.setBackground(new Color(115,138,110));
        menuItemLabel.setForeground(new Color(255,255,255));
        //orders
        ordersPanelBG.setBackground(new Color(115,138,110));
        ordersLabel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_historyPanelBGMouseClicked

    private void menuPanelBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelBGMouseClicked
        java.awt.CardLayout cl = (java.awt.CardLayout) parentPanel.getLayout();
        cl.show(parentPanel, "card2");
        setTitle("Menu Items");
        //menu
        menuPanelBG.setBackground(new Color(229,221,209));
        menuItemLabel.setForeground(new Color(51,51,51));
        //history
        historyPanelBG.setBackground(new Color(115,138,110));
        historyPanelBG.setForeground(new Color(255,255,255));
        //orders
        ordersPanelBG.setBackground(new Color(115,138,110));
        ordersLabel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_menuPanelBGMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new studentInterface().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel historyLabel;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JPanel historyPanelBG;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel menuItemLabel;
    private javax.swing.JPanel menuItemsPanel;
    private javax.swing.JPanel menuPanelBG;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel ordersLabel;
    private javax.swing.JPanel ordersPanelBG;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel studentFirstChar;
    private javax.swing.JLabel studentFirstname;
    // End of variables declaration//GEN-END:variables
}
