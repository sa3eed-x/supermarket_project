/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket_project;

/**
 *
 * @author asaid
 */
public class Manger_CreatProoduct extends javax.swing.JFrame {

    /**
     * Creates new form Manger_CreatProoduct
     */
    public Manger_CreatProoduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextField_Brand = new javax.swing.JTextField();
        Label_ProductId = new javax.swing.JLabel();
        TextField_Category = new javax.swing.JTextField();
        jLabel_ProductName = new javax.swing.JLabel();
        TextField_Production = new javax.swing.JTextField();
        Label_Price = new javax.swing.JLabel();
        TextField_ExpiryDate = new javax.swing.JTextField();
        TextField_Id = new javax.swing.JTextField();
        TextField_Name = new javax.swing.JTextField();
        TextField_Price = new javax.swing.JTextField();
        Label_Brand = new javax.swing.JLabel();
        Label_Catrgory = new javax.swing.JLabel();
        Label_ProductionDate = new javax.swing.JLabel();
        Label_ExpiryDate = new javax.swing.JLabel();
        Add_Product = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextField_Brand.setText("Brand");
        TextField_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_BrandActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 71, -1));

        Label_ProductId.setText("Product Id");
        jPanel1.add(Label_ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 23, -1, -1));

        TextField_Category.setText("Category");
        jPanel1.add(TextField_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 174, 71, -1));

        jLabel_ProductName.setText("Product Name");
        jPanel1.add(jLabel_ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 37, -1));

        TextField_Production.setText("production_date");
        TextField_Production.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ProductionActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Production, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 214, 71, -1));

        Label_Price.setText("Price");
        jPanel1.add(Label_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 103, 37, -1));

        TextField_ExpiryDate.setText("expiry_date");
        TextField_ExpiryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ExpiryDateActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_ExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 254, 71, -1));

        TextField_Id.setText("Id");
        jPanel1.add(TextField_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 71, -1));

        TextField_Name.setText("Name");
        TextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NameActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 71, -1));

        TextField_Price.setText("price");
        TextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PriceActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 71, -1));

        Label_Brand.setText("Brand");
        jPanel1.add(Label_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 143, 37, -1));

        Label_Catrgory.setText("Category");
        jPanel1.add(Label_Catrgory, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 177, -1, -1));

        Label_ProductionDate.setText("Production_date");
        jPanel1.add(Label_ProductionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 217, -1, -1));

        Label_ExpiryDate.setText("Expiry_date");
        jPanel1.add(Label_ExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 257, -1, -1));

        Add_Product.setText("Add Product");
        Add_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_BrandActionPerformed

    private void TextField_ProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ProductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ProductionActionPerformed

    private void TextField_ExpiryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ExpiryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ExpiryDateActionPerformed

    private void TextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NameActionPerformed

    private void TextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PriceActionPerformed

    private void Add_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_ProductActionPerformed

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
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manger_CreatProoduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Product;
    private javax.swing.JLabel Label_Brand;
    private javax.swing.JLabel Label_Catrgory;
    private javax.swing.JLabel Label_ExpiryDate;
    private javax.swing.JLabel Label_Price;
    private javax.swing.JLabel Label_ProductId;
    private javax.swing.JLabel Label_ProductionDate;
    private javax.swing.JTextField TextField_Brand;
    private javax.swing.JTextField TextField_Category;
    private javax.swing.JTextField TextField_ExpiryDate;
    private javax.swing.JTextField TextField_Id;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JTextField TextField_Price;
    private javax.swing.JTextField TextField_Production;
    private javax.swing.JLabel jLabel_ProductName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}