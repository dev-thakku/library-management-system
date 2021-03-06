
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.ExemptionMechanismException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form Publisher
     */
    int sIndex = 0;

    public ReturnBook() {
        initComponents();
        connect();
        loadReturnedBooks();
        
        midField.requestFocus();
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
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadReturnedBooks() {
        try {
            ps = con.prepareStatement("SELECT * FROM tbl_retbook");
            rs = ps.executeQuery();

            //GETTING THE TABLE MODEL OF catTable
            DefaultTableModel d1 = (DefaultTableModel) returnTable.getModel();
            d1.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                v2.add(rs.getString("id"));
                v2.add(rs.getString("mname"));
                v2.add(rs.getString("bname"));
                v2.add(rs.getString("return_date"));
                v2.add(rs.getString("elap"));
                v2.add(rs.getString("fine"));
                d1.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchBook(String mid) {
        try {
            ps = con.prepareStatement("select member.name, book.bname, issue.return_date, DATEDIFF(now(), issue.return_date) as elap from tbl_issuebook issue JOIN tbl_member member ON issue.mem_id = member.mem_id JOIN tbl_book book ON issue.isbn = book.isbn AND issue.mem_id = ?");
            ps.setString(1, mid);
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Member ID not found!");
            } else {
                String mname = rs.getString("member.name");
                String bname = rs.getString("book.bname");
                String date = rs.getString("issue.return_date");
                int elp = rs.getInt("elap");
                        
                mnameField.setText(mname);
                bnameField.setText(bname);
                retDateField.setText(date);
                setElapandFine(elp);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setElapandFine(int elaped) {
        if (elaped > 0) {
            daysField.setText(String.valueOf(elaped));
            fineField.setText(String.valueOf(calcFine(elaped)));
        } else {
        daysField.setText("0");
        fineField.setText("0");
        }
    }

    private int calcFine(int days) {
        int fine = 50;
        if(days > 0) return days * fine;
        return 0;
    }
    
    private void clearFields() {
        midField.setText("");
        mnameField.setText("");
        bnameField.setText("");
        retDateField.setText("");
        daysField.setText("");
        fineField.setText("");
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
        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnTable = new javax.swing.JTable();
        lDetailsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        midField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mnameField = new javax.swing.JTextField();
        lSearchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bnameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        daysField = new javax.swing.JTextField();
        fineField = new javax.swing.JTextField();
        retDateField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publisher - Library Management System");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 70, 127));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(57, 39, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 139, 235));
        jLabel1.setText("Return Book");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        returnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Return ID", "Member Name", "Book Name", "Return Date", "Elaped Days", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        returnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(returnTable);
        if (returnTable.getColumnModel().getColumnCount() > 0) {
            returnTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            returnTable.getColumnModel().getColumn(1).setResizable(false);
            returnTable.getColumnModel().getColumn(2).setResizable(false);
            returnTable.getColumnModel().getColumn(3).setResizable(false);
            returnTable.getColumnModel().getColumn(4).setResizable(false);
            returnTable.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        lDetailsPanel.setBackground(new java.awt.Color(57, 39, 89));
        lDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 240, 255)), "Lender Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 11), new java.awt.Color(232, 240, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 240, 255));
        jLabel2.setText("Member ID");

        midField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                midFieldKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 240, 255));
        jLabel3.setText("Name");

        mnameField.setEditable(false);
        mnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameFieldActionPerformed(evt);
            }
        });

        lSearchButton.setText("????");
        lSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lSearchButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 240, 255));
        jLabel5.setText("Book Name");

        bnameField.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 240, 255));
        jLabel9.setText("Days Elap");

        jLabel10.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(232, 240, 255));
        jLabel10.setText("Return Date");

        jLabel11.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(232, 240, 255));
        jLabel11.setText("Fine");

        fineField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineFieldActionPerformed(evt);
            }
        });

        retDateField.setEditable(false);

        javax.swing.GroupLayout lDetailsPanelLayout = new javax.swing.GroupLayout(lDetailsPanel);
        lDetailsPanel.setLayout(lDetailsPanelLayout);
        lDetailsPanelLayout.setHorizontalGroup(
            lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lDetailsPanelLayout.createSequentialGroup()
                        .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                                .addComponent(midField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lSearchButton))
                            .addComponent(mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lDetailsPanelLayout.createSequentialGroup()
                        .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(69, 69, 69)
                        .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fineField)
                            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                                .addComponent(retDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(lDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(86, 86, 86)
                        .addComponent(daysField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        lDetailsPanelLayout.setVerticalGroup(
            lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daysField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fineField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton2.setForeground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed


    private void midFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midFieldKeyPressed
        // TODO add your handling code here:
        String id = midField.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchBook(id);
        }
    }//GEN-LAST:event_midFieldKeyPressed

    private void lSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lSearchButtonActionPerformed
        // TODO add your handling code here:
        String id = midField.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "Member ID is Empty!");
        } else {
            searchBook(id);
        }
    }//GEN-LAST:event_lSearchButtonActionPerformed

    private void mnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameFieldActionPerformed

    private void returnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTableMouseClicked

    }//GEN-LAST:event_returnTableMouseClicked

    private void fineFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int mid = Integer.parseInt(midField.getText());
        String mname = mnameField.getText();
        String bname = bnameField.getText();
        String retDate = retDateField.getText();
        int elapDays = Integer.parseInt(daysField.getText());
        int fine = Integer.parseInt(fineField.getText());
        
        try {
            ps = con.prepareStatement("INSERT INTO tbl_retbook(mem_id, mname, bname, return_date, elap, fine) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, mid);
            ps.setString(2, mname);
            ps.setString(3, bname);
            ps.setString(4, retDate);
            ps.setInt(5, elapDays);
            ps.setInt(6, fine);
            
            int res = ps.executeUpdate();
            
            ps.execute("DELETE FROM tbl_issuebook WHERE mem_id = " + mid);
            if(res == 1) {
                JOptionPane.showMessageDialog(this, bname + " returned successfully!");
                loadReturnedBooks();
                clearFields();
                midField.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Error while returning book!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField bnameField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField daysField;
    private javax.swing.JTextField fineField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lDetailsPanel;
    private javax.swing.JButton lSearchButton;
    private javax.swing.JTextField midField;
    private javax.swing.JTextField mnameField;
    private javax.swing.JTextField retDateField;
    private javax.swing.JTable returnTable;
    // End of variables declaration//GEN-END:variables
}
