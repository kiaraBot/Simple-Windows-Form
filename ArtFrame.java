/** ****************************************************************
 *Alix Field     afield@cnm.edu     FieldP4_Java
 *Art Frame Class
 *
 *
 *GUI User Interface Components
 ****************************************************************** */
// Packages
package field.p4_java;

// Imports
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ArtFrame extends javax.swing.JFrame {

    private ArtData data;

    public ArtFrame() {
        data = new ArtData();
        intializeFormComponents();
    }

    // Component /Controls Intialization
    private void intializeFormComponents() {
        
        // Class Header JOption Pane
        JOptionPane.showMessageDialog(null, "\nAlix Field" + "\nFieldP4_Java" + "\nProgram Objective: "
        + "\n     Windows Form \n     JComponents", "Class Header", JOptionPane.INFORMATION_MESSAGE);
        
        
        // Nimbus Look & Feel      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArtFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            initComponents();
            setVisible(true);
            setTitle("Artist Network");
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        });
    }

    // WARNING: Do NOT modify this code!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtngrpShipment = new javax.swing.ButtonGroup();
        jbtngrpCreditCard = new javax.swing.ButtonGroup();
        jlbJasmine = new javax.swing.JLabel();
        jlbHerArt = new javax.swing.JLabel();
        jslrSizePrice = new javax.swing.JSlider();
        jlbSelectSize = new javax.swing.JLabel();
        jcomboGiftWrap = new javax.swing.JComboBox<>();
        jbtnInvoiceSummary = new javax.swing.JButton();
        jcbArt1 = new javax.swing.JCheckBox();
        jcbArt2 = new javax.swing.JCheckBox();
        jcbArt3 = new javax.swing.JCheckBox();
        jcbArt4 = new javax.swing.JCheckBox();
        jbtnSaveInvoice = new javax.swing.JButton();
        jlbShipOption = new javax.swing.JLabel();
        jlbCreditCardInfo = new javax.swing.JLabel();
        jtxFCardNumber = new javax.swing.JTextField();
        jtxFCardExpDate = new javax.swing.JTextField();
        jtxFCardCIN = new javax.swing.JTextField();
        jlbCreditNumber = new javax.swing.JLabel();
        jlbExperationDate = new javax.swing.JLabel();
        jlbCreditCIN = new javax.swing.JLabel();
        jrdbtnGroundShip = new javax.swing.JRadioButton();
        jrdbtnTwoDay = new javax.swing.JRadioButton();
        jrdbtnNextDay = new javax.swing.JRadioButton();
        jrdbtnMaster = new javax.swing.JRadioButton();
        jrdbtnVisa = new javax.swing.JRadioButton();
        jrdbtnAmericanExp = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtInvoiceSummary = new javax.swing.JTextArea();
        jlbPainting1 = new javax.swing.JLabel();
        jlbPainting2 = new javax.swing.JLabel();
        jlbPainting3 = new javax.swing.JLabel();
        jlbPainting4 = new javax.swing.JLabel();
        jlbSizePrize12 = new javax.swing.JLabel();
        jlbSizePrice24 = new javax.swing.JLabel();
        jlbSizePrice36 = new javax.swing.JLabel();
        jlbSizePrice48 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        jlbJasmine.setFont(new java.awt.Font("Harrington", 1, 16)); // NOI18N
        jlbJasmine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbJasmine.setText("Jasmine Becket-Griffith");
        jlbJasmine.setToolTipText("Artist Name");
        jlbJasmine.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jlbHerArt.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jlbHerArt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHerArt.setText("Her Art Your Way");
        jlbHerArt.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jslrSizePrice.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jslrSizePrice.setMajorTickSpacing(12);
        jslrSizePrice.setMaximum(48);
        jslrSizePrice.setMinimum(12);
        jslrSizePrice.setPaintLabels(true);
        jslrSizePrice.setPaintTicks(true);
        jslrSizePrice.setSnapToTicks(true);
        jslrSizePrice.setToolTipText("Size in Inches Dictates Price of Painting");
        jslrSizePrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jslrSizePrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jslrSizePrice.setName("jslPaintingSize"); // NOI18N

        jlbSelectSize.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbSelectSize.setText("Please Select Painting Size (all sizes are in inches)");

        jcomboGiftWrap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcomboGiftWrap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Christmas", "Anniversary", "Birthday", "No Wrap" }));
        jcomboGiftWrap.setToolTipText("Gift Wrap Options");
        jcomboGiftWrap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnInvoiceSummary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnInvoiceSummary.setText("Invoice Summary");
        jbtnInvoiceSummary.setToolTipText("Displays Invoice Summary in Text Area");
        jbtnInvoiceSummary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnInvoiceSummary.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnInvoiceSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInvoiceSummaryActionPerformed(evt);
            }
        });

        jcbArt1.setText("Snow White");
        jcbArt1.setToolTipText("Check Box w/ Painting Name");
        jcbArt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbArt2.setText("Alice");
        jcbArt2.setToolTipText("Check Box w/ Painting Name");
        jcbArt2.setActionCommand("");
        jcbArt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbArt3.setText("Baby Strange");
        jcbArt3.setToolTipText("Check Box w/ Painting Name");
        jcbArt3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbArt4.setText("Van Eyke");
        jcbArt4.setToolTipText("Check Box w/ Painting Name");
        jcbArt4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnSaveInvoice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSaveInvoice.setText("Save Invoice");
        jbtnSaveInvoice.setToolTipText("Saves Invoice Summary to User File");
        jbtnSaveInvoice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSaveInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnSaveInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveInvoiceActionPerformed(evt);
            }
        });

        jlbShipOption.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbShipOption.setText("Shipment Type");

        jlbCreditCardInfo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbCreditCardInfo.setText("Credit Card Information");

        jtxFCardNumber.setToolTipText("Credit Card Information");
        jtxFCardNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtxFCardExpDate.setToolTipText("Credit Card Information");
        jtxFCardExpDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtxFCardCIN.setToolTipText("Credit Card Information");
        jtxFCardCIN.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbCreditNumber.setText(" Card Number Last 4 Digits");

        jlbExperationDate.setText(" Experation Date 0000");
        jlbExperationDate.setToolTipText("");

        jlbCreditCIN.setText("CIN");

        jbtngrpShipment.add(jrdbtnGroundShip);
        jrdbtnGroundShip.setText("Ground Shipment $0.00");
        jrdbtnGroundShip.setToolTipText("Shipment Choices");

        jbtngrpShipment.add(jrdbtnTwoDay);
        jrdbtnTwoDay.setText("Two Day Shipment $5.00");
        jrdbtnTwoDay.setToolTipText("Shipment Choices");

        jbtngrpShipment.add(jrdbtnNextDay);
        jrdbtnNextDay.setText("Next Day Shipment $10.00");
        jrdbtnNextDay.setToolTipText("Shipment Choices");

        jbtngrpCreditCard.add(jrdbtnMaster);
        jrdbtnMaster.setText("Mater Card");
        jrdbtnMaster.setToolTipText("Credit Card Choice");
        jrdbtnMaster.setActionCommand("");

        jbtngrpCreditCard.add(jrdbtnVisa);
        jrdbtnVisa.setText("Visa Card");
        jrdbtnVisa.setToolTipText("Credit Card Choice");

        jbtngrpCreditCard.add(jrdbtnAmericanExp);
        jrdbtnAmericanExp.setText("American Express Card");
        jrdbtnAmericanExp.setToolTipText("Credit Card Choice");

        jtxtInvoiceSummary.setEditable(false);
        jtxtInvoiceSummary.setColumns(20);
        jtxtInvoiceSummary.setRows(5);
        jtxtInvoiceSummary.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jtxtInvoiceSummary);

        jlbPainting1.setIcon(new javax.swing.ImageIcon("D:\\4 Java\\1 Projects\\P4 Netbeans GUI\\Field.P4_Java\\src\\field\\p4_java\\file_tn.jpg")); // NOI18N
        jlbPainting1.setToolTipText("Available Painting");
        jlbPainting1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jlbPainting1.setMinimumSize(new java.awt.Dimension(40, 14));
        jlbPainting1.setPreferredSize(new java.awt.Dimension(40, 14));

        jlbPainting2.setIcon(new javax.swing.ImageIcon("D:\\4 Java\\1 Projects\\P4 Netbeans GUI\\Field.P4_Java\\src\\field\\p4_java\\file1_tn.jpg")); // NOI18N
        jlbPainting2.setToolTipText("Available Painting");
        jlbPainting2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbPainting3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/field/p4_java/file3_tn.jpg"))); // NOI18N
        jlbPainting3.setToolTipText("Available Painting");
        jlbPainting3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbPainting4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/field/p4_java/file2_tn.jpg"))); // NOI18N
        jlbPainting4.setToolTipText("Available Painting");
        jlbPainting4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbSizePrize12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbSizePrize12.setText("12x12: $50");

        jlbSizePrice24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbSizePrice24.setText("24x24: $100");

        jlbSizePrice36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbSizePrice36.setText("36x36: $200");

        jlbSizePrice48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbSizePrice48.setText("48x48: $350");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Gift Wrap Choices");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrdbtnGroundShip)
                            .addComponent(jrdbtnTwoDay)
                            .addComponent(jrdbtnNextDay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrdbtnAmericanExp)
                            .addComponent(jrdbtnVisa)
                            .addComponent(jrdbtnMaster)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jlbShipOption)
                        .addGap(42, 42, 42)
                        .addComponent(jlbCreditCardInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jlbExperationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jbtnSaveInvoice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jlbCreditCIN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jlbCreditNumber))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlbSelectSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlbSizePrize12)
                                .addGap(18, 18, 18)
                                .addComponent(jlbSizePrice36)
                                .addGap(18, 18, 18)
                                .addComponent(jlbSizePrice24)
                                .addGap(30, 30, 30)
                                .addComponent(jlbSizePrice48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jslrSizePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcomboGiftWrap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnInvoiceSummary))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jlbHerArt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbPainting1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbArt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbPainting2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbArt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlbJasmine, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbArt3)
                                    .addComponent(jlbPainting3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbPainting4)
                            .addComponent(jcbArt4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxFCardExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxFCardCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxFCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbHerArt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbJasmine, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbPainting3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbPainting4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbPainting1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbArt1)
                            .addComponent(jcbArt2)
                            .addComponent(jcbArt3)
                            .addComponent(jcbArt4)))
                    .addComponent(jlbPainting2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSelectSize)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcomboGiftWrap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jslrSizePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbSizePrize12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbSizePrice36)
                        .addComponent(jlbSizePrice24))
                    .addComponent(jlbSizePrice48, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnInvoiceSummary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbCreditCardInfo)
                        .addComponent(jlbShipOption)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrdbtnGroundShip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrdbtnTwoDay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrdbtnNextDay))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrdbtnMaster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrdbtnVisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrdbtnAmericanExp)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCreditNumber)
                            .addComponent(jtxFCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxFCardExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbExperationDate))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCreditCIN)
                            .addComponent(jtxFCardCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSaveInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jlbJasmine.getAccessibleContext().setAccessibleName("lblJasmine");
        jlbHerArt.getAccessibleContext().setAccessibleName("lblHerArtYourWay");
        jslrSizePrice.getAccessibleContext().setAccessibleName("slPaintingSize");
        jlbSelectSize.getAccessibleContext().setAccessibleName("lblSizeDirections");
        jbtnInvoiceSummary.getAccessibleContext().setAccessibleName("btnInvoiceSummary");
        jbtnInvoiceSummary.getAccessibleContext().setAccessibleDescription("");
        jcbArt1.getAccessibleContext().setAccessibleName("jlblArtOne");
        jcbArt2.getAccessibleContext().setAccessibleName("jlblArtTwo");
        jcbArt3.getAccessibleContext().setAccessibleName("jlblArtThree");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // JButton Display Invoice Summary in Text Area
    private void jbtnInvoiceSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInvoiceSummaryActionPerformed
        
        // JCheckBoxes
        if (jcbArt1.isSelected()) {
            data.setArtOne(true);
        }
        if (jcbArt2.isSelected()) {
            data.setArtTwo(true);
        }
        if (jcbArt3.isSelected()) {
            data.setArtThree(true);
        }
        if (jcbArt4.isSelected()) {
            data.setArtFour(true);
        }
        // JRadioButton Group: Shippint Arrangements
        if (jrdbtnGroundShip.isSelected()) {
            data.setGroundShip(true);
        }
        if (jrdbtnTwoDay.isSelected()) {
            data.setTwoDay(true);
        }
        if (jrdbtnNextDay.isSelected()) {
            data.setTwoDay(true);
        }
        // JRadioButton Group: Credit Card Choice      
        if (jrdbtnMaster.isSelected()) {
            data.setMasterCard(true);
        }
        if (jrdbtnVisa.isSelected()) {
            data.setVisaCard(true);
        }
        if (jrdbtnAmericanExp.isSelected()) {
            data.setAmericanExprCard(true);
        }
        // JTextFields: Credit Card Information
        if (jtxFCardNumber.getText().trim().length() == 0) {
            jtxFCardNumber.setText("0");
        }
        if (jtxFCardExpDate.getText().trim().length() == 0) {
            jtxFCardExpDate.setText("0");
        }
        if (jtxFCardCIN.getText().trim().length() == 0) {
            jtxFCardCIN.setText("0");
        }
        // Parse User Input: Credit Card Information
        int cardNum = Integer.parseInt(jtxFCardNumber.getText());
        int cardExpDate = Integer.parseInt(jtxFCardExpDate.getText());
        int cardCIN = Integer.parseInt(jtxFCardCIN.getText());
        
        // Set User Text Input
        data.setUserTextInput(cardNum, cardExpDate, cardCIN);
        
        // JComboBox: Gift Wrap
        data.setGiftWrap((String) jcomboGiftWrap.getSelectedItem());

         // JSlider: Price By Size
        data.setSizePrice(jslrSizePrice.getValue());

        // Display Invoice Summary
        jtxtInvoiceSummary.setText(data.getInvoiceSummary());
    }//GEN-LAST:event_jbtnInvoiceSummaryActionPerformed

    // JButton: Save Invoice Document
    private void jbtnSaveInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveInvoiceActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        int iSaveOrCancel = fileChooser.showSaveDialog(this);	//Show save file dialog.
        if (iSaveOrCancel == JFileChooser.APPROVE_OPTION) //Run unless user hits cancel
        {
            File file = fileChooser.getSelectedFile();
            data.writeFile(file);
        }
    }//GEN-LAST:event_jbtnSaveInvoiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnInvoiceSummary;
    private javax.swing.JButton jbtnSaveInvoice;
    private javax.swing.ButtonGroup jbtngrpCreditCard;
    private javax.swing.ButtonGroup jbtngrpShipment;
    private javax.swing.JCheckBox jcbArt1;
    private javax.swing.JCheckBox jcbArt2;
    private javax.swing.JCheckBox jcbArt3;
    private javax.swing.JCheckBox jcbArt4;
    private javax.swing.JComboBox<String> jcomboGiftWrap;
    private javax.swing.JLabel jlbCreditCIN;
    private javax.swing.JLabel jlbCreditCardInfo;
    private javax.swing.JLabel jlbCreditNumber;
    private javax.swing.JLabel jlbExperationDate;
    private javax.swing.JLabel jlbHerArt;
    private javax.swing.JLabel jlbJasmine;
    private javax.swing.JLabel jlbPainting1;
    private javax.swing.JLabel jlbPainting2;
    private javax.swing.JLabel jlbPainting3;
    private javax.swing.JLabel jlbPainting4;
    private javax.swing.JLabel jlbSelectSize;
    private javax.swing.JLabel jlbShipOption;
    private javax.swing.JLabel jlbSizePrice24;
    private javax.swing.JLabel jlbSizePrice36;
    private javax.swing.JLabel jlbSizePrice48;
    private javax.swing.JLabel jlbSizePrize12;
    private javax.swing.JRadioButton jrdbtnAmericanExp;
    private javax.swing.JRadioButton jrdbtnGroundShip;
    private javax.swing.JRadioButton jrdbtnMaster;
    private javax.swing.JRadioButton jrdbtnNextDay;
    private javax.swing.JRadioButton jrdbtnTwoDay;
    private javax.swing.JRadioButton jrdbtnVisa;
    private javax.swing.JSlider jslrSizePrice;
    private javax.swing.JTextField jtxFCardCIN;
    private javax.swing.JTextField jtxFCardExpDate;
    private javax.swing.JTextField jtxFCardNumber;
    private javax.swing.JTextArea jtxtInvoiceSummary;
    // End of variables declaration//GEN-END:variables
}// End ArtFrame Class
