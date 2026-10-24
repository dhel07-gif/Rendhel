package jurial_obo_system_oop;

public class CanteenOrderDashboard extends javax.swing.JFrame {

    public CanteenOrderDashboard() {
        initComponents();
        styleTableHeaders();
    }

    private void styleTableHeaders() {
        java.awt.Font headerFont = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14);
        for (javax.swing.JTable t : new javax.swing.JTable[]{tblMenu, tblOrder}) {
            t.getTableHeader().setFont(headerFont);
            t.getTableHeader().setReorderingAllowed(false);
        }
        ((javax.swing.table.DefaultTableCellRenderer) tblMenu.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ((javax.swing.table.DefaultTableCellRenderer) tblOrder.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        sidebarPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnNavHome = new javax.swing.JButton();
        btnNavMenu = new javax.swing.JButton();
        btnNavHistory = new javax.swing.JButton();
        btnNavOffers = new javax.swing.JButton();
        btnNavReports = new javax.swing.JButton();
        btnNavSettings = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        btnRiceMeals = new javax.swing.JButton();
        btnBreakfast = new javax.swing.JButton();
        btnNoodles = new javax.swing.JButton();
        btnMerienda = new javax.swing.JButton();
        btnBeverages = new javax.swing.JButton();
        scrollMenu = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        orderPanel = new javax.swing.JPanel();
        lblMyOrder = new javax.swing.JLabel();
        btnDine = new javax.swing.JButton();
        btnPickUp = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        scrollOrder = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblSubtotal = new javax.swing.JLabel();
        lblSubtotalValue = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblDiscountValue = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTotalValue = new javax.swing.JLabel();
        lblPayments = new javax.swing.JLabel();
        btnCash = new javax.swing.JButton();
        btnDebit = new javax.swing.JButton();
        btnEWallet = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Canteen Ordering Dashboard"); // NOI18N
        setResizable(false);

        rootPanel.setPreferredSize(new java.awt.Dimension(1181, 728));
        rootPanel.setLayout(null);
        sidebarPanel.setBackground(new java.awt.Color(47, 74, 60));
        sidebarPanel.setLayout(null);
        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(47, 74, 60));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("C"); // NOI18N
        lblLogo.setOpaque(true);
        sidebarPanel.add(lblLogo);
        lblLogo.setBounds(15, 25, 50, 49);

        btnNavHome.setBackground(new java.awt.Color(111, 139, 110));
        btnNavHome.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnNavHome.setForeground(new java.awt.Color(255, 255, 255));
        btnNavHome.setText("\u2302"); // NOI18N
        btnNavHome.setBorderPainted(false);
        btnNavHome.setContentAreaFilled(false);
        btnNavHome.setFocusPainted(false);
        btnNavHome.setOpaque(true);
        sidebarPanel.add(btnNavHome);
        btnNavHome.setBounds(15, 99, 50, 50);

        btnNavMenu.setBackground(new java.awt.Color(111, 139, 110));
        btnNavMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnNavMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnNavMenu.setText("\u2630"); // NOI18N
        btnNavMenu.setBorderPainted(false);
        btnNavMenu.setContentAreaFilled(false);
        btnNavMenu.setFocusPainted(false);
        btnNavMenu.setOpaque(true);
        sidebarPanel.add(btnNavMenu);
        btnNavMenu.setBounds(15, 173, 50, 50);

        btnNavHistory.setBackground(new java.awt.Color(111, 139, 110));
        btnNavHistory.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnNavHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnNavHistory.setText("\u25f7"); // NOI18N
        btnNavHistory.setBorderPainted(false);
        btnNavHistory.setContentAreaFilled(false);
        btnNavHistory.setFocusPainted(false);
        btnNavHistory.setOpaque(true);
        sidebarPanel.add(btnNavHistory);
        btnNavHistory.setBounds(15, 248, 50, 50);

        btnNavOffers.setBackground(new java.awt.Color(111, 139, 110));
        btnNavOffers.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnNavOffers.setForeground(new java.awt.Color(255, 255, 255));
        btnNavOffers.setText("\u2709"); // NOI18N
        btnNavOffers.setBorderPainted(false);
        btnNavOffers.setContentAreaFilled(false);
        btnNavOffers.setFocusPainted(false);
        btnNavOffers.setOpaque(true);
        sidebarPanel.add(btnNavOffers);
        btnNavOffers.setBounds(15, 323, 50, 50);

        btnNavReports.setBackground(new java.awt.Color(111, 139, 110));
        btnNavReports.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnNavReports.setForeground(new java.awt.Color(255, 255, 255));
        btnNavReports.setText("\u25a4"); // NOI18N
        btnNavReports.setBorderPainted(false);
        btnNavReports.setContentAreaFilled(false);
        btnNavReports.setFocusPainted(false);
        btnNavReports.setOpaque(true);
        sidebarPanel.add(btnNavReports);
        btnNavReports.setBounds(15, 397, 50, 50);

        btnNavSettings.setBackground(new java.awt.Color(111, 139, 110));
        btnNavSettings.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnNavSettings.setForeground(new java.awt.Color(255, 255, 255));
        btnNavSettings.setText("\u2699"); // NOI18N
        btnNavSettings.setBorderPainted(false);
        btnNavSettings.setContentAreaFilled(false);
        btnNavSettings.setFocusPainted(false);
        btnNavSettings.setOpaque(true);
        sidebarPanel.add(btnNavSettings);
        btnNavSettings.setBounds(15, 471, 50, 50);

        rootPanel.add(sidebarPanel);
        sidebarPanel.setBounds(0, 0, 80, 728);

        mainPanel.setBackground(new java.awt.Color(229, 220, 208));
        mainPanel.setLayout(null);
        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblDate.setForeground(new java.awt.Color(110, 110, 110));
        lblDate.setText("June 15, 2026"); // NOI18N
        mainPanel.add(lblDate);
        lblDate.setBounds(29, 22, 159, 16);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(47, 74, 60));
        lblTitle.setText("Filipino Canteen Restaurant"); // NOI18N
        mainPanel.add(lblTitle);
        lblTitle.setBounds(29, 38, 358, 32);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        mainPanel.add(txtSearch);
        txtSearch.setBounds(398, 37, 258, 35);

        btnSearch.setBackground(new java.awt.Color(47, 74, 60));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search"); // NOI18N
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setFocusPainted(false);
        btnSearch.setOpaque(true);
        mainPanel.add(btnSearch);
        btnSearch.setBounds(665, 37, 80, 35);

        btnAll.setBackground(new java.awt.Color(255, 255, 255));
        btnAll.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnAll.setForeground(new java.awt.Color(47, 74, 60));
        btnAll.setText("All"); // NOI18N
        btnAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnAll.setContentAreaFilled(false);
        btnAll.setFocusPainted(false);
        btnAll.setOpaque(true);
        mainPanel.add(btnAll);
        btnAll.setBounds(41, 91, 24, 17);

        btnRiceMeals.setBackground(new java.awt.Color(255, 255, 255));
        btnRiceMeals.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnRiceMeals.setForeground(new java.awt.Color(47, 74, 60));
        btnRiceMeals.setText("Rice Meals"); // NOI18N
        btnRiceMeals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnRiceMeals.setContentAreaFilled(false);
        btnRiceMeals.setFocusPainted(false);
        btnRiceMeals.setOpaque(true);
        mainPanel.add(btnRiceMeals);
        btnRiceMeals.setBounds(66, 91, 68, 17);

        btnBreakfast.setBackground(new java.awt.Color(255, 255, 255));
        btnBreakfast.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnBreakfast.setForeground(new java.awt.Color(47, 74, 60));
        btnBreakfast.setText("Breakfast"); // NOI18N
        btnBreakfast.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnBreakfast.setContentAreaFilled(false);
        btnBreakfast.setFocusPainted(false);
        btnBreakfast.setOpaque(true);
        mainPanel.add(btnBreakfast);
        btnBreakfast.setBounds(140, 91, 60, 17);

        btnNoodles.setBackground(new java.awt.Color(255, 255, 255));
        btnNoodles.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnNoodles.setForeground(new java.awt.Color(47, 74, 60));
        btnNoodles.setText("Noodles"); // NOI18N
        btnNoodles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnNoodles.setContentAreaFilled(false);
        btnNoodles.setFocusPainted(false);
        btnNoodles.setOpaque(true);
        mainPanel.add(btnNoodles);
        btnNoodles.setBounds(206, 91, 52, 17);

        btnMerienda.setBackground(new java.awt.Color(255, 255, 255));
        btnMerienda.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnMerienda.setForeground(new java.awt.Color(47, 74, 60));
        btnMerienda.setText("Merienda"); // NOI18N
        btnMerienda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnMerienda.setContentAreaFilled(false);
        btnMerienda.setFocusPainted(false);
        btnMerienda.setOpaque(true);
        mainPanel.add(btnMerienda);
        btnMerienda.setBounds(264, 91, 60, 17);

        btnBeverages.setBackground(new java.awt.Color(255, 255, 255));
        btnBeverages.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnBeverages.setForeground(new java.awt.Color(47, 74, 60));
        btnBeverages.setText("Beverages"); // NOI18N
        btnBeverages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnBeverages.setContentAreaFilled(false);
        btnBeverages.setFocusPainted(false);
        btnBeverages.setOpaque(true);
        mainPanel.add(btnBeverages);
        btnBeverages.setBounds(329, 91, 67, 17);

        tblMenu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblMenu.setRowHeight(22);
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Category", "Price (\u20b1)", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollMenu.setViewportView(tblMenu);

        mainPanel.add(scrollMenu);
        scrollMenu.setBounds(29, 144, 715, 530);

        rootPanel.add(mainPanel);
        mainPanel.setBounds(80, 0, 762, 728);

        orderPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderPanel.setLayout(null);
        lblMyOrder.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblMyOrder.setForeground(new java.awt.Color(47, 74, 60));
        lblMyOrder.setText("My Order"); // NOI18N
        orderPanel.add(lblMyOrder);
        lblMyOrder.setBounds(19, 21, 159, 25);

        btnDine.setBackground(new java.awt.Color(47, 74, 60));
        btnDine.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnDine.setForeground(new java.awt.Color(255, 255, 255));
        btnDine.setText("Dine"); // NOI18N
        btnDine.setBorderPainted(false);
        btnDine.setContentAreaFilled(false);
        btnDine.setFocusPainted(false);
        btnDine.setOpaque(true);
        orderPanel.add(btnDine);
        btnDine.setBounds(19, 59, 84, 30);

        btnPickUp.setBackground(new java.awt.Color(255, 255, 255));
        btnPickUp.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnPickUp.setForeground(new java.awt.Color(47, 74, 60));
        btnPickUp.setText("Pick Up"); // NOI18N
        btnPickUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnPickUp.setContentAreaFilled(false);
        btnPickUp.setFocusPainted(false);
        btnPickUp.setOpaque(true);
        orderPanel.add(btnPickUp);
        btnPickUp.setBounds(114, 59, 94, 30);

        btnDelivery.setBackground(new java.awt.Color(255, 255, 255));
        btnDelivery.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnDelivery.setForeground(new java.awt.Color(47, 74, 60));
        btnDelivery.setText("Delivery"); // NOI18N
        btnDelivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnDelivery.setContentAreaFilled(false);
        btnDelivery.setFocusPainted(false);
        btnDelivery.setOpaque(true);
        orderPanel.add(btnDelivery);
        btnDelivery.setBounds(218, 59, 95, 30);

        tblOrder.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblOrder.setRowHeight(22);
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        scrollOrder.setViewportView(tblOrder);

        orderPanel.add(scrollOrder);
        scrollOrder.setBounds(19, 109, 292, 277);

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(47, 74, 60));
        lblSubtotal.setText("Subtotal"); // NOI18N
        orderPanel.add(lblSubtotal);
        lblSubtotal.setBounds(20, 410, 119, 16);

        lblSubtotalValue.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblSubtotalValue.setForeground(new java.awt.Color(47, 74, 60));
        lblSubtotalValue.setText("\u20b10.00"); // NOI18N
        lblSubtotalValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPanel.add(lblSubtotalValue);
        lblSubtotalValue.setBounds(233, 410, 80, 16);

        lblDiscount.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(47, 74, 60));
        lblDiscount.setText("Discount"); // NOI18N
        orderPanel.add(lblDiscount);
        lblDiscount.setBounds(20, 435, 119, 16);

        lblDiscountValue.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblDiscountValue.setForeground(new java.awt.Color(35, 140, 90));
        lblDiscountValue.setText("-\u20b10.00"); // NOI18N
        lblDiscountValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPanel.add(lblDiscountValue);
        lblDiscountValue.setBounds(233, 435, 80, 16);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(47, 74, 60));
        lblTotal.setText("Total Amount"); // NOI18N
        orderPanel.add(lblTotal);
        lblTotal.setBounds(19, 471, 159, 21);

        lblTotalValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalValue.setForeground(new java.awt.Color(35, 140, 90));
        lblTotalValue.setText("\u20b10.00"); // NOI18N
        lblTotalValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPanel.add(lblTotalValue);
        lblTotalValue.setBounds(193, 471, 119, 21);

        lblPayments.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblPayments.setForeground(new java.awt.Color(47, 74, 60));
        lblPayments.setText("Payments"); // NOI18N
        orderPanel.add(lblPayments);
        lblPayments.setBounds(19, 519, 159, 19);

        btnCash.setBackground(new java.awt.Color(47, 74, 60));
        btnCash.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnCash.setForeground(new java.awt.Color(255, 255, 255));
        btnCash.setText("Cash"); // NOI18N
        btnCash.setBorderPainted(false);
        btnCash.setContentAreaFilled(false);
        btnCash.setFocusPainted(false);
        btnCash.setOpaque(true);
        orderPanel.add(btnCash);
        btnCash.setBounds(19, 546, 90, 34);

        btnDebit.setBackground(new java.awt.Color(255, 255, 255));
        btnDebit.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnDebit.setForeground(new java.awt.Color(47, 74, 60));
        btnDebit.setText("Debit"); // NOI18N
        btnDebit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnDebit.setContentAreaFilled(false);
        btnDebit.setFocusPainted(false);
        btnDebit.setOpaque(true);
        orderPanel.add(btnDebit);
        btnDebit.setBounds(118, 546, 89, 34);

        btnEWallet.setBackground(new java.awt.Color(255, 255, 255));
        btnEWallet.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnEWallet.setForeground(new java.awt.Color(47, 74, 60));
        btnEWallet.setText("E-Wallet"); // NOI18N
        btnEWallet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)));
        btnEWallet.setContentAreaFilled(false);
        btnEWallet.setFocusPainted(false);
        btnEWallet.setOpaque(true);
        orderPanel.add(btnEWallet);
        btnEWallet.setBounds(218, 546, 95, 34);

        btnCheckout.setBackground(new java.awt.Color(35, 140, 90));
        btnCheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("Checkout"); // NOI18N
        btnCheckout.setBorderPainted(false);
        btnCheckout.setContentAreaFilled(false);
        btnCheckout.setFocusPainted(false);
        btnCheckout.setOpaque(true);
        orderPanel.add(btnCheckout);
        btnCheckout.setBounds(19, 606, 293, 45);

        rootPanel.add(orderPanel);
        orderPanel.setBounds(842, 0, 339, 728);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1200, 775));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CanteenOrderDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnBeverages;
    private javax.swing.JButton btnBreakfast;
    private javax.swing.JButton btnCash;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnDebit;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnDine;
    private javax.swing.JButton btnEWallet;
    private javax.swing.JButton btnMerienda;
    private javax.swing.JButton btnNavHistory;
    private javax.swing.JButton btnNavHome;
    private javax.swing.JButton btnNavMenu;
    private javax.swing.JButton btnNavOffers;
    private javax.swing.JButton btnNavReports;
    private javax.swing.JButton btnNavSettings;
    private javax.swing.JButton btnNoodles;
    private javax.swing.JButton btnPickUp;
    private javax.swing.JButton btnRiceMeals;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscountValue;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMyOrder;
    private javax.swing.JLabel lblPayments;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotalValue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JScrollPane scrollMenu;
    private javax.swing.JScrollPane scrollOrder;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
