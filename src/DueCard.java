/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAVBit
 */
public class DueCard extends javax.swing.JPanel {

    /**
     * Creates new form DueCard
     */
    public DueCard() {
        initComponents();
    }
    
    public DueCard(String id, String mname, String bname, String phone) {
        
        initComponents();
        idField.setText(id);
        mnameField.setText(mname);
        bnameField.setText(bname);
        phoneField.setText(phone);
        setBounds(0, 0, 298, 173);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mnameField = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bnameField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneField = new javax.swing.JLabel();

        setBackground(new java.awt.Color(90, 70, 127));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 0));
        setMaximumSize(new java.awt.Dimension(217, 74));
        setLayout(new java.awt.GridLayout(0, 2, 0, 10));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Issue ID");
        add(jLabel7);

        idField.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        idField.setForeground(new java.awt.Color(255, 255, 255));
        idField.setText("55555");
        add(idField);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member Name");
        add(jLabel1);

        mnameField.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        mnameField.setForeground(new java.awt.Color(255, 255, 255));
        mnameField.setText("Jemshith T K");
        add(mnameField);

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book");
        add(jLabel4);

        bnameField.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        bnameField.setForeground(new java.awt.Color(255, 255, 255));
        bnameField.setText("Let us C");
        add(bnameField);

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");
        add(jLabel5);

        phoneField.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        phoneField.setForeground(new java.awt.Color(255, 255, 255));
        phoneField.setText("9987456321");
        add(phoneField);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bnameField;
    private javax.swing.JLabel idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel mnameField;
    private javax.swing.JLabel phoneField;
    // End of variables declaration//GEN-END:variables
}