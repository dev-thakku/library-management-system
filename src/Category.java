
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAVBit
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        connect();
        loadCategory();
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    //DB-Connection
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_lms", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Load Catogory into Table
    public void loadCategory() {

        try {
            ps = con.prepareStatement("select * from tbl_category");
            rs = ps.executeQuery();

            //GETTING THE TABLE MODEL OF catTable
            DefaultTableModel d1 = (DefaultTableModel) catTable.getModel();
            d1.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                v2.add(rs.getString("cat_id"));
                v2.add(rs.getString("category"));
                v2.add(rs.getString("status"));
                d1.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categoryField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        statusField = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Category - Library Management System");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 70, 127));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 39, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 139, 235));
        jLabel1.setText("Category");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 240, 255));
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 240, 255));
        jLabel3.setText("Status");

        statusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));

        addBtn.setForeground(new java.awt.Color(102, 102, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setForeground(new java.awt.Color(0, 160, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setForeground(new java.awt.Color(255, 51, 51));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(updateBtn))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 350));

        catTable.setBackground(new java.awt.Color(204, 204, 255));
        catTable.setForeground(new java.awt.Color(51, 0, 102));
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Category", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catTable);
        if (catTable.getColumnModel().getColumnCount() > 0) {
            catTable.getColumnModel().getColumn(0).setMinWidth(70);
            catTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            catTable.getColumnModel().getColumn(0).setMaxWidth(70);
            catTable.getColumnModel().getColumn(1).setResizable(false);
            catTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 0, 470, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // assigning values to variables
        String category = categoryField.getText();
        String status = statusField.getSelectedItem().toString();

        if (!category.equals("")) {
            try {
                //PREPARING QUERY
                ps = con.prepareStatement("insert into tbl_category(category, status) values (?, ?)");
                ps.setString(1, category);
                ps.setString(2, status);
                int res = ps.executeUpdate();

                if (res == 1) {
                    loadCategory();
                    JOptionPane.showMessageDialog(this, "Category Added Successfully!");
                    categoryField.setText("");
                    statusField.setSelectedIndex(-1);
                    categoryField.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "Error While Adding Category!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Category Field is Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            categoryField.requestFocus();
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) catTable.getModel();
        int sIndex = catTable.getSelectedRow();
        String category = d1.getValueAt(sIndex, 1).toString();
        int id = Integer.parseInt(d1.getValueAt(sIndex, 0).toString());

        int confirm = JOptionPane.showConfirmDialog(jPanel1, "Are you sure want to Delete " + category + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {

            try {
                //PREPARING QUERY
                ps = con.prepareStatement("delete from tbl_category where cat_id = ?");
                ps.setInt(1, id);
                int res = ps.executeUpdate();

                if (res == 1) {
                    loadCategory();
                    JOptionPane.showMessageDialog(this, "Category Deleted Successfully!");
                    categoryField.setText("");
                    statusField.setSelectedIndex(-1);
                    addBtn.setEnabled(true);
                    addBtn.setEnabled(false);
                    addBtn.setForeground(new Color(102, 102, 255));
                    categoryField.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "Error While Deleting Category!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) catTable.getModel();

        //ASSIGNING THE SELECTED ROW
        int sIndex = catTable.getSelectedRow();
        
        //ENABLING UPDATE BUTTON
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);

        //SETTING THE FIELDS
        categoryField.setText(d1.getValueAt(sIndex, 1).toString());
        statusField.setSelectedItem(d1.getValueAt(sIndex, 2).toString());

        //DISABLING THE ADD BUTTON
        addBtn.setEnabled(false);
        addBtn.setForeground(new Color(204, 204, 255));

    }//GEN-LAST:event_catTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) catTable.getModel();

        //ASSIGNING THE SELECTED ROW
        int sIndex = catTable.getSelectedRow();

        //ASSIGNING THE ID OF SELECTED CATEGORY
        int id = Integer.parseInt(d1.getValueAt(sIndex, 0).toString());

        // ASSIGNING VALUES TO THE VARIABLES
        String category = categoryField.getText();
        String status = statusField.getSelectedItem().toString();

        if (!categoryField.getText().equals("")) {
            try {
                //PREPARING QUERY
                ps = con.prepareStatement("update tbl_category set category=  ?, status = ? where cat_id = ?");
                ps.setString(1, category);
                ps.setString(2, status);
                ps.setInt(3, id);
                int res = ps.executeUpdate();

                if (res == 1) {
                    loadCategory();
                    JOptionPane.showMessageDialog(this, "Category Updated Successfully!");
                    categoryField.setText("");
                    statusField.setSelectedIndex(-1);
                    addBtn.setEnabled(true);
                    updateBtn.setEnabled(false);
                    addBtn.setForeground(new Color(102, 102, 255));
                    categoryField.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "Error While Updating Category!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Category Field is Empty!", "Error", JOptionPane.WARNING_MESSAGE);
            categoryField.requestFocus();
        }

    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTable catTable;
    private javax.swing.JTextField categoryField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> statusField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
