package jurial_obo_system_oop;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentInterface extends javax.swing.JFrame {

    DB_CONNECTION DB = new DB_CONNECTION();
    Color beige = new Color(229, 221, 209);

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(studentInterface.class.getName());

    public studentInterface() {
        initComponents();
        setResizable(false);
        setSize(1200, 775);
        setTitle("Student Interface");
        getContentPane().setBackground(beige);
        menuItemsTable.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        menuItemsTable.setRowHeight(28);
        menuItemsTable.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        loadMenuItems();
        sortComboBox.addActionListener(e -> {
            // Re-run the search method so it pulls data with the newly selected sorting order
            findButtonMouseClicked(null);
        });
    }

    private void loadMenuItems() {
        searchItemField.setText(""); // Clear search field on full load if desired
        DefaultTableModel model = (DefaultTableModel) menuItemsTable.getModel();
        model.setRowCount(0);

        String orderBy = " ORDER BY item_id ASC";
        int selectedSortIndex = sortComboBox.getSelectedIndex();

        switch (selectedSortIndex) {
            case 0:
                orderBy = " ORDER BY name ASC";
                break;
            case 1:
                orderBy = " ORDER BY name DESC";
                break;
            case 2:
                orderBy = " ORDER BY price ASC";
                break;
            case 3:
                orderBy = " ORDER BY price DESC";
                break;
        }

        String query = "SELECT item_id, name, category, price, stock_quantity, is_available FROM menu_items" + orderBy;

        try (PreparedStatement pst = DB.con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("item_id"),
                    rs.getString("name"),
                    rs.getString("category"),
                    rs.getDouble("price"),
                    rs.getInt("stock_quantity"),
                    rs.getBoolean("is_available")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Load Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
        searchItemField = new javax.swing.JTextField();
        findButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuItemsTable = new javax.swing.JTable();
        sortComboBox = new javax.swing.JComboBox<>();
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

        findButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        findButton.setText("Find");
        findButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findButtonMouseClicked(evt);
            }
        });

        menuItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Category", "Price", "Stock Quantity", "is Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuItemsTable);

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name: A - Z", "Name: Z - A", "Price: ASCEND", "Price: DESCEND" }));

        javax.swing.GroupLayout menuItemsPanelLayout = new javax.swing.GroupLayout(menuItemsPanel);
        menuItemsPanel.setLayout(menuItemsPanelLayout);
        menuItemsPanelLayout.setHorizontalGroup(
            menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(menuItemsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menuItemsPanelLayout.createSequentialGroup()
                        .addComponent(searchItemField, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuItemsPanelLayout.setVerticalGroup(
            menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchItemField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        ordersPanelBG.setBackground(new Color(229, 221, 209));
        ordersLabel.setForeground(new Color(51, 51, 51));
        //menu
        menuPanelBG.setBackground(new Color(115, 138, 110));
        menuItemLabel.setForeground(new Color(255, 255, 255));
        //history
        historyPanelBG.setBackground(new Color(115, 138, 110));
        historyLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ordersPanelBGMouseClicked

    private void historyPanelBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelBGMouseClicked
        java.awt.CardLayout cl = (java.awt.CardLayout) parentPanel.getLayout();
        cl.show(parentPanel, "card4");
        setTitle("Purchase History");
        //history
        historyPanelBG.setBackground(new Color(229, 221, 209));
        historyLabel.setForeground(new Color(51, 51, 51));
        //menu
        menuPanelBG.setBackground(new Color(115, 138, 110));
        menuItemLabel.setForeground(new Color(255, 255, 255));
        //orders
        ordersPanelBG.setBackground(new Color(115, 138, 110));
        ordersLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_historyPanelBGMouseClicked

    private void menuPanelBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelBGMouseClicked
        java.awt.CardLayout cl = (java.awt.CardLayout) parentPanel.getLayout();
        cl.show(parentPanel, "card2");
        setTitle("Menu Items");
        //menu
        menuPanelBG.setBackground(new Color(229, 221, 209));
        menuItemLabel.setForeground(new Color(51, 51, 51));
        //history
        historyPanelBG.setBackground(new Color(115, 138, 110));
        historyPanelBG.setForeground(new Color(255, 255, 255));
        //orders
        ordersPanelBG.setBackground(new Color(115, 138, 110));
        ordersLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuPanelBGMouseClicked

    private void findButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findButtonMouseClicked
        String searchText = searchItemField.getText().trim();
        DefaultTableModel model = (DefaultTableModel) menuItemsTable.getModel();
        model.setRowCount(0);

        // Determine the sorting rule based on ComboBox selection
        String orderBy = " ORDER BY item_id ASC"; // Default fallback
        int selectedSortIndex = sortComboBox.getSelectedIndex();

        switch (selectedSortIndex) {
            case 0: // Name: A - Z
                orderBy = " ORDER BY name ASC";
                break;
            case 1: // Name: Z - A
                orderBy = " ORDER BY name DESC";
                break;
            case 2: // Price: ASCEND
                orderBy = " ORDER BY price ASC";
                break;
            case 3: // Price: DESCEND
                orderBy = " ORDER BY price DESC";
                break;
        }

        String query = "SELECT item_id, name, category, price, stock_quantity, is_available FROM menu_items WHERE name LIKE ?" + orderBy;

        try (PreparedStatement pst = DB.con.prepareStatement(query)) {
            pst.setString(1, "%" + searchText + "%");

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("item_id"), // Column 0: Item ID
                        rs.getString("name"), // Column 1: Item Name
                        rs.getString("category"), // Column 2: Category
                        rs.getDouble("price"), // Column 3: Price
                        rs.getInt("stock_quantity"), // Column 4: Stock Quantity
                        rs.getBoolean("is_available") // Column 5: is Available (Boolean)
                    };
                    model.addRow(row);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search/Sort Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findButtonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new studentInterface().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findButton;
    private javax.swing.JLabel historyLabel;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JPanel historyPanelBG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel menuItemLabel;
    private javax.swing.JPanel menuItemsPanel;
    private javax.swing.JTable menuItemsTable;
    private javax.swing.JPanel menuPanelBG;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel ordersLabel;
    private javax.swing.JPanel ordersPanelBG;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JTextField searchItemField;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel studentFirstChar;
    private javax.swing.JLabel studentFirstname;
    // End of variables declaration//GEN-END:variables
}
