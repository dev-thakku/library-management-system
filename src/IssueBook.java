
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
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form Publisher
     */
    int sIndex = 0;

    public IssueBook() {
        initComponents();
        connect();
        loadIssuedBooks();
        midField.requestFocus();
        lnextButton.setEnabled(false);
        bnextButton.setEnabled(false);

        deleteBtn.setEnabled(false);
        configDateChoosers();
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

    public void panelSwitch(JPanel panel) {
        MPane.removeAll();
        MPane.add(panel);
        MPane.repaint();
        MPane.revalidate();
    }

    private void loadIssuedBooks() {
        try {
            ps = con.prepareStatement("SELECT issue.id, member.name, book.bname, issue.issue_date, issue.return_date FROM tbl_issuebook issue JOIN tbl_member member ON issue.mem_id = member.mem_id JOIN tbl_book book ON issue.isbn = book.isbn");
            rs = ps.executeQuery();

            //GETTING THE TABLE MODEL OF catTable
            DefaultTableModel d1 = (DefaultTableModel) issueTable.getModel();
            d1.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                v2.add(rs.getString("issue.id"));
                v2.add(rs.getString("member.name"));
                v2.add(rs.getString("book.bname"));
                v2.add(rs.getString("issue.issue_date"));
                v2.add(rs.getString("issue.return_date"));
                d1.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void configDateChoosers() {
        //calender instance
        Calendar calendar = Calendar.getInstance();

        //getting today's today
        Date today = new Date();

        //getting tommorow
        calendar.setTime(today);
        calendar.add(Calendar.DATE, 1);
        Date tomorrow = calendar.getTime();

        issueDate.setDate(today);
        issueDate.setEnabled(false);

        retDate.setMinSelectableDate(tomorrow);
        retDate.setDate(tomorrow);
    }

    private void clearFields() {
        midField.setText("");
        mnameField.setText("");
        isbnField.setText("");
        configDateChoosers();
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
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        MPane = new javax.swing.JLayeredPane();
        lDetailsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        midField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mnameField = new javax.swing.JTextField();
        lnextButton = new javax.swing.JButton();
        lSearchButton = new javax.swing.JButton();
        bDetailsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bnameField = new javax.swing.JTextField();
        bnextButton = new javax.swing.JButton();
        bprevButton = new javax.swing.JButton();
        isbnSButton = new javax.swing.JButton();
        rDetailsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rsubmitButton = new javax.swing.JButton();
        rprevButton = new javax.swing.JButton();
        retDate = new com.toedter.calendar.JDateChooser();
        issueDate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publisher - Library Management System");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 70, 127));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(57, 39, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 139, 235));
        jLabel1.setText("Issue Book");

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

        MPane.setLayout(new java.awt.CardLayout());

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

        lnextButton.setText("Next >>");
        lnextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnextButtonActionPerformed(evt);
            }
        });

        lSearchButton.setText("🔎");
        lSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lDetailsPanelLayout = new javax.swing.GroupLayout(lDetailsPanel);
        lDetailsPanel.setLayout(lDetailsPanelLayout);
        lDetailsPanelLayout.setHorizontalGroup(
            lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lDetailsPanelLayout.createSequentialGroup()
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lDetailsPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                                .addComponent(midField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lSearchButton))
                            .addComponent(mnameField)))
                    .addGroup(lDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lnextButton)
                        .addGap(17, 17, 17)))
                .addGap(15, 15, 15))
        );
        lDetailsPanelLayout.setVerticalGroup(
            lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lDetailsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(midField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lnextButton)
                .addContainerGap())
        );

        MPane.add(lDetailsPanel, "card3");

        bDetailsPanel.setBackground(new java.awt.Color(57, 39, 89));
        bDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 240, 255)), "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 11), new java.awt.Color(232, 240, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(232, 240, 255));
        jLabel4.setText("ISBN");

        isbnField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isbnFieldKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 240, 255));
        jLabel5.setText("Book Name");

        bnameField.setEditable(false);

        bnextButton.setText("Next >>");
        bnextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnextButtonActionPerformed(evt);
            }
        });

        bprevButton.setText("<< Prev");
        bprevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprevButtonActionPerformed(evt);
            }
        });

        isbnSButton.setText("🔎");
        isbnSButton.setPreferredSize(new java.awt.Dimension(6, 23));
        isbnSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnSButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bDetailsPanelLayout = new javax.swing.GroupLayout(bDetailsPanel);
        bDetailsPanel.setLayout(bDetailsPanelLayout);
        bDetailsPanelLayout.setHorizontalGroup(
            bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bDetailsPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bDetailsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bprevButton)
                        .addGap(18, 18, 18)
                        .addComponent(bnextButton)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bDetailsPanelLayout.createSequentialGroup()
                        .addComponent(isbnField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isbnSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bnameField))
                .addGap(34, 34, 34))
        );
        bDetailsPanelLayout.setVerticalGroup(
            bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bDetailsPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbnSButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(bDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnextButton)
                    .addComponent(bprevButton))
                .addContainerGap())
        );

        MPane.add(bDetailsPanel, "card3");

        rDetailsPanel.setBackground(new java.awt.Color(57, 39, 89));
        rDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 240, 255)), "Return Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 11), new java.awt.Color(232, 240, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 240, 255));
        jLabel8.setText("Issue Date");

        jLabel9.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 240, 255));
        jLabel9.setText("Return Date");

        rsubmitButton.setText("Issue Book✔");
        rsubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsubmitButtonActionPerformed(evt);
            }
        });

        rprevButton.setText("<< Prev");
        rprevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rprevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rDetailsPanelLayout = new javax.swing.GroupLayout(rDetailsPanel);
        rDetailsPanel.setLayout(rDetailsPanelLayout);
        rDetailsPanelLayout.setHorizontalGroup(
            rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rDetailsPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issueDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(rprevButton)
                .addGap(47, 47, 47)
                .addComponent(rsubmitButton)
                .addGap(69, 69, 69))
        );
        rDetailsPanelLayout.setVerticalGroup(
            rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rDetailsPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(issueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(retDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(rDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rsubmitButton)
                    .addComponent(rprevButton))
                .addContainerGap())
        );

        MPane.add(rDetailsPanel, "card3");

        issueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Member Name", "Book Name", "Issue Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issueTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(issueTable);
        if (issueTable.getColumnModel().getColumnCount() > 0) {
            issueTable.getColumnModel().getColumn(1).setResizable(false);
            issueTable.getColumnModel().getColumn(2).setResizable(false);
            issueTable.getColumnModel().getColumn(3).setResizable(false);
            issueTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(MPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(MPane, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure want to Delete the selected record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            DefaultTableModel d1 = (DefaultTableModel) issueTable.getModel();
            int issueId = Integer.parseInt(d1.getValueAt(sIndex, 0).toString());

            try {
                ps = con.prepareStatement("delete from tbl_issuebook where id = ?");
                ps.setInt(1, issueId);
                int res = ps.executeUpdate();
                if (res == 1) {
                    loadIssuedBooks();
                } else {
                    JOptionPane.showMessageDialog(this, "Error While Deleting record!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void lnextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnextButtonActionPerformed
        // TODO add your handling code here:
        String m_id = midField.getText();
        if (m_id.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter valid member details to continue!", "Member empty", JOptionPane.WARNING_MESSAGE);
        } else {
            short res = searchMember(m_id);
            if (res == 1) {
                panelSwitch(bDetailsPanel);
            }
        }
    }//GEN-LAST:event_lnextButtonActionPerformed

    private void bnextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnextButtonActionPerformed
        // TODO add your handling code here:
        String isbn = isbnField.getText();
        if (isbn.equals("") || bnameField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter valid book details to continue!", "Book empty", JOptionPane.WARNING_MESSAGE);
        } else {
            short res = searchBook(isbn);
            if (res == 1) {
                panelSwitch(rDetailsPanel);
            }
        }
    }//GEN-LAST:event_bnextButtonActionPerformed

    private void bprevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprevButtonActionPerformed
        // TODO add your handling code here:
        panelSwitch(lDetailsPanel);
    }//GEN-LAST:event_bprevButtonActionPerformed

    private void rsubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsubmitButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        if (retDate.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Please enter a return date!", "Return date is Empty", JOptionPane.WARNING_MESSAGE);
        } else {
            int m_id = Integer.parseInt(midField.getText());
            int isbn = Integer.parseInt(isbnField.getText());
            String iDate = dateFormat.format(issueDate.getDate());
            String rDate = dateFormat.format(retDate.getDate());

            try {
                ps = con.prepareStatement("insert into tbl_issuebook(mem_id, isbn, issue_date, return_date) values(?, ?, ?, ?)");
                ps.setInt(1, m_id);
                ps.setInt(2, isbn);
                ps.setString(3, iDate);
                ps.setString(4, rDate);

                int res = ps.executeUpdate();

                if (res == 1) {

                    panelSwitch(lDetailsPanel);
                    clearFields();
                    loadIssuedBooks();

                    JOptionPane.showMessageDialog(this, "Book issued successfully!");

                } else {
                    JOptionPane.showMessageDialog(this, "Error While issueing book!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_rsubmitButtonActionPerformed

    private void rprevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rprevButtonActionPerformed
        // TODO add your handling code here:
        panelSwitch(bDetailsPanel);
    }//GEN-LAST:event_rprevButtonActionPerformed

    private short searchMember(String m_id) {

        try {
            //PREPARING QUERY
            ps = con.prepareStatement("select name from tbl_member where mem_id = ?");
            ps.setString(1, m_id);
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No Member with the " + m_id + " exists!", "Member not found", JOptionPane.WARNING_MESSAGE);
                return 0;
            } else {
                mnameField.setText(rs.getString("name"));
                lnextButton.setEnabled(true);
                return 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }


    private void midFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midFieldKeyPressed
        // TODO add your handling code here:
        String m_id = midField.getText();
        if (!m_id.equals("")) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                try {
                    rs = ps.executeQuery("SELECT mem_id FROM tbl_issuebook where mem_id = " + m_id);

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Member already has pending book!", "Can't issue book", JOptionPane.WARNING_MESSAGE);
                        midField.requestFocus();
                    } else {
                        searchMember(m_id);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_midFieldKeyPressed

    private void lSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lSearchButtonActionPerformed
        // TODO add your handling code here:

        String m_id = midField.getText();
        if (!m_id.equals("")) {
            try {
                rs = ps.executeQuery("SELECT mem_id FROM tbl_issuebook where mem_id = " + m_id);

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Member already has pending book!", "Can't issue book", JOptionPane.WARNING_MESSAGE);
                    midField.requestFocus();
                } else {
                    searchMember(m_id);
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Member not found!", "No Member", JOptionPane.WARNING_MESSAGE);
            midField.requestFocus();
        }

    }//GEN-LAST:event_lSearchButtonActionPerformed

    private void mnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameFieldActionPerformed

    private short searchBook(String isbn) {
        try {
            //PREPARING QUERY
            ps = con.prepareStatement("select bname from tbl_book where isbn = ?");
            ps.setString(1, isbn);
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No book with the ISBN: " + isbn + " exists!", "Book not found", JOptionPane.WARNING_MESSAGE);
                return 0;
            } else {
                bnameField.setText(rs.getString("bname"));
                bnextButton.setEnabled(true);
                return 1;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void isbnFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isbnFieldKeyPressed
        // TODO add your handling code here:
        String isbn = isbnField.getText();
        if (!isbn.equals("")) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                searchBook(isbn);
            }
        }
    }//GEN-LAST:event_isbnFieldKeyPressed

    private void isbnSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnSButtonActionPerformed
        // TODO add your handling code here:
        String isbn = isbnField.getText();
        if (isbn.equals("")) {
            JOptionPane.showMessageDialog(this, "ISBN field can't be empty!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            isbnField.requestFocus();
        } else {
            searchBook(isbn);
        }
    }//GEN-LAST:event_isbnSButtonActionPerformed

    private void issueTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) issueTable.getModel();

        //ASSIGNING THE SELECTED ROW
        sIndex = issueTable.getSelectedRow();

        deleteBtn.setEnabled(true);


    }//GEN-LAST:event_issueTableMouseClicked

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
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MPane;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel bDetailsPanel;
    private javax.swing.JTextField bnameField;
    private javax.swing.JButton bnextButton;
    private javax.swing.JButton bprevButton;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField isbnField;
    private javax.swing.JButton isbnSButton;
    private com.toedter.calendar.JDateChooser issueDate;
    private javax.swing.JTable issueTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lDetailsPanel;
    private javax.swing.JButton lSearchButton;
    private javax.swing.JButton lnextButton;
    private javax.swing.JTextField midField;
    private javax.swing.JTextField mnameField;
    private javax.swing.JPanel rDetailsPanel;
    private com.toedter.calendar.JDateChooser retDate;
    private javax.swing.JButton rprevButton;
    private javax.swing.JButton rsubmitButton;
    // End of variables declaration//GEN-END:variables
}
