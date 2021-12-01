
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAVBit
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        catPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        authorPane = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        publisherPane = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        abookPane = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        memberPane = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ibookPane = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rbookPane = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        duePane = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logoutPane = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home - Library Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(57, 39, 89));

        catPane.setBackground(new java.awt.Color(232, 240, 255));
        catPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                catPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                catPaneMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list.png"))); // NOI18N
        catPane.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 39, 89));
        jLabel3.setText("Category");
        catPane.add(jLabel3);

        authorPane.setBackground(new java.awt.Color(232, 240, 255));
        authorPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                authorPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                authorPaneMouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/author.png"))); // NOI18N
        authorPane.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(57, 39, 89));
        jLabel13.setText("Author");
        authorPane.add(jLabel13);

        publisherPane.setBackground(new java.awt.Color(232, 240, 255));
        publisherPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                publisherPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                publisherPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                publisherPaneMouseExited(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/publisher.png"))); // NOI18N
        publisherPane.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(57, 39, 89));
        jLabel17.setText("Publisher");
        publisherPane.add(jLabel17);

        abookPane.setBackground(new java.awt.Color(232, 240, 255));
        abookPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abookPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abookPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abookPaneMouseExited(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        abookPane.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(57, 39, 89));
        jLabel15.setText("Add Book");
        abookPane.add(jLabel15);

        memberPane.setBackground(new java.awt.Color(232, 240, 255));
        memberPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memberPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memberPaneMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/member.png"))); // NOI18N
        memberPane.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 39, 89));
        jLabel7.setText("Add Member");
        memberPane.add(jLabel7);

        ibookPane.setBackground(new java.awt.Color(232, 240, 255));
        ibookPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ibookPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibookPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ibookPaneMouseExited(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/issue-book.png"))); // NOI18N
        ibookPane.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(57, 39, 89));
        jLabel19.setText("Issue Book");
        ibookPane.add(jLabel19);

        rbookPane.setBackground(new java.awt.Color(232, 240, 255));
        rbookPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbookPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbookPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbookPaneMouseExited(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return-book.png"))); // NOI18N
        rbookPane.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(57, 39, 89));
        jLabel23.setText("Return Book");
        rbookPane.add(jLabel23);

        duePane.setBackground(new java.awt.Color(232, 240, 255));
        duePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duePaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                duePaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                duePaneMouseExited(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/due-today.png"))); // NOI18N
        duePane.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 39, 89));
        jLabel21.setText("Due Today");
        duePane.add(jLabel21);

        logoutPane.setBackground(new java.awt.Color(255, 51, 51));
        logoutPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPaneMouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-red.png"))); // NOI18N
        logoutPane.add(jLabel24);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 204, 204));
        jLabel25.setText("Logout");
        logoutPane.add(jLabel25);

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("V 1.0.2406");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(catPane, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(authorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(publisherPane, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(abookPane, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(memberPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(ibookPane, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbookPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(duePane, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(logoutPane, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(catPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abookPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibookPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbookPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(104, 116, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 240, 255));
        jLabel1.setText("LIBRARY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catPaneMouseEntered
        // TODO add your handling code here:
        catPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_catPaneMouseEntered

    private void catPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catPaneMouseExited
        // TODO add your handling code here:
        catPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_catPaneMouseExited

    private void logoutPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPaneMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Are you sure, You Want to Exit?", "Exit App",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_logoutPaneMouseClicked

    private void authorPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorPaneMouseClicked
        // TODO add your handling code here:
        Author a = new Author();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_authorPaneMouseClicked

    private void authorPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorPaneMouseEntered
        // TODO add your handling code here:
        authorPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_authorPaneMouseEntered

    private void authorPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorPaneMouseExited
        // TODO add your handling code here:
        authorPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_authorPaneMouseExited

    private void publisherPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publisherPaneMouseEntered
        // TODO add your handling code here:
        publisherPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_publisherPaneMouseEntered

    private void publisherPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publisherPaneMouseExited
        // TODO add your handling code here:
        publisherPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_publisherPaneMouseExited

    private void abookPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abookPaneMouseEntered
        // TODO add your handling code here:
        abookPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_abookPaneMouseEntered

    private void abookPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abookPaneMouseExited
        // TODO add your handling code here:
        abookPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_abookPaneMouseExited

    private void memberPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberPaneMouseEntered
        // TODO add your handling code here:
        memberPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_memberPaneMouseEntered

    private void memberPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberPaneMouseExited
        // TODO add your handling code here:
        memberPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_memberPaneMouseExited

    private void ibookPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibookPaneMouseEntered
        // TODO add your handling code here:
        ibookPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_ibookPaneMouseEntered

    private void ibookPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibookPaneMouseExited
        // TODO add your handling code here:
        ibookPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_ibookPaneMouseExited

    private void rbookPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbookPaneMouseEntered
        // TODO add your handling code here:
        rbookPane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_rbookPaneMouseEntered

    private void rbookPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbookPaneMouseExited
        // TODO add your handling code here:
        rbookPane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_rbookPaneMouseExited

    private void duePaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duePaneMouseEntered
        // TODO add your handling code here:
        duePane.setBackground(new Color(121, 167, 255));
    }//GEN-LAST:event_duePaneMouseEntered

    private void duePaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duePaneMouseExited
        // TODO add your handling code here:
        duePane.setBackground(new Color(232, 240, 255));
    }//GEN-LAST:event_duePaneMouseExited

    private void catPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catPaneMouseClicked
        // TODO add your handling code here:
        Category c = new Category();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_catPaneMouseClicked

    private void publisherPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publisherPaneMouseClicked
        // TODO add your handling code here:
        Publisher p = new Publisher();
        p.setVisible(true);
        dispose();

    }//GEN-LAST:event_publisherPaneMouseClicked

    private void abookPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abookPaneMouseClicked
        // TODO add your handling code here:
        Book b = new Book();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_abookPaneMouseClicked

    private void memberPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberPaneMouseClicked
        // TODO add your handling code here:
        Member m = new Member();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_memberPaneMouseClicked

    private void ibookPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibookPaneMouseClicked
        // TODO add your handling code here:
        IssueBook i = new IssueBook();
        i.setVisible(true);
        dispose();

    }//GEN-LAST:event_ibookPaneMouseClicked

    private void duePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duePaneMouseClicked
        // TODO add your handling code here:
        DueToday d = new DueToday();
        d.setVisible(true);
        dispose();

    }//GEN-LAST:event_duePaneMouseClicked

    private void rbookPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbookPaneMouseClicked
        // TODO add your handling code here:
        ReturnBook r = new ReturnBook();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbookPaneMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abookPane;
    private javax.swing.JPanel authorPane;
    private javax.swing.JPanel catPane;
    private javax.swing.JPanel duePane;
    private javax.swing.JPanel ibookPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel logoutPane;
    private javax.swing.JPanel memberPane;
    private javax.swing.JPanel publisherPane;
    private javax.swing.JPanel rbookPane;
    // End of variables declaration//GEN-END:variables
}