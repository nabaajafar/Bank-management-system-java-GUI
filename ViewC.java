/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagment;

/**
 *
 * @author Nabaa
 */
public class ViewC extends javax.swing.JPanel {

    /**
     * Creates new form ViewC
     */
    public ViewC() {
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

        viewlbl = new javax.swing.JButton();
        openbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        backlbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        accounttxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionare = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(173, 208, 218));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(null);

        viewlbl.setBackground(new java.awt.Color(102, 102, 102));
        viewlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewlbl.setText("View customer information");
        viewlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewlblMouseClicked(evt);
            }
        });
        add(viewlbl);
        viewlbl.setBounds(40, 80, 200, 80);

        openbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        openbtn.setText("Open new account");
        openbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openbtnMouseClicked(evt);
            }
        });
        openbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbtnActionPerformed(evt);
            }
        });
        add(openbtn);
        openbtn.setBounds(40, 200, 200, 80);

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn.setText("Delete customer");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        add(deletebtn);
        deletebtn.setBounds(40, 320, 200, 80);

        backlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backlbl.setText(">>Back");
        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlblMouseClicked(evt);
            }
        });
        add(backlbl);
        backlbl.setBounds(10, 20, 60, 14);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagment/BB.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 280, 530);

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        add(idtxt);
        idtxt.setBounds(300, 50, 200, 30);

        submitbtn.setText("Submit");
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });
        add(submitbtn);
        submitbtn.setBounds(530, 50, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter customer's ID");
        add(jLabel2);
        jLabel2.setBounds(300, 20, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel3.setText("Name:");
        add(jLabel3);
        jLabel3.setBounds(300, 120, 50, 15);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel4.setText("Phone:");
        add(jLabel4);
        jLabel4.setBounds(290, 180, 50, 15);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel5.setText("Account:");
        add(jLabel5);
        jLabel5.setBounds(530, 150, 60, 20);

        nametxt.setEditable(false);
        nametxt.setBackground(new java.awt.Color(173, 208, 218));
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        add(nametxt);
        nametxt.setBounds(340, 120, 180, 30);

        phonetxt.setEditable(false);
        phonetxt.setBackground(new java.awt.Color(173, 208, 218));
        add(phonetxt);
        phonetxt.setBounds(340, 170, 180, 30);

        accounttxt.setEditable(false);
        accounttxt.setBackground(new java.awt.Color(173, 208, 218));
        add(accounttxt);
        accounttxt.setBounds(590, 150, 190, 30);

        transactionare.setEditable(false);
        transactionare.setBackground(new java.awt.Color(173, 208, 218));
        transactionare.setColumns(20);
        transactionare.setRows(5);
        jScrollPane1.setViewportView(transactionare);

        add(jScrollPane1);
        jScrollPane1.setBounds(300, 230, 480, 200);
    }// </editor-fold>//GEN-END:initComponents

    private void viewlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewlblMouseClicked

    private void openbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_openbtnMouseClicked

    private void openbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openbtnActionPerformed

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnMouseClicked

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitbtnMouseClicked

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backlblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField accounttxt;
    public javax.swing.JLabel backlbl;
    public javax.swing.JButton deletebtn;
    public javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nametxt;
    public javax.swing.JButton openbtn;
    public javax.swing.JTextField phonetxt;
    public javax.swing.JButton submitbtn;
    public javax.swing.JTextArea transactionare;
    public javax.swing.JButton viewlbl;
    // End of variables declaration//GEN-END:variables
}