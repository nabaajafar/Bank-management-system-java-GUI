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
public class DeleteC extends javax.swing.JPanel {

    /**
     * Creates new form DeleteC
     */
    public DeleteC() {
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

        backlbl = new javax.swing.JLabel();
        openbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        viewlbl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deletbtn = new javax.swing.JButton();
        idtxt = new javax.swing.JTextField();
        Accountxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(173, 208, 218));
        setLayout(null);

        backlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backlbl.setText(">>Back");
        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlblMouseClicked(evt);
            }
        });
        add(backlbl);
        backlbl.setBounds(10, 20, 60, 14);

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

        deletebtn.setBackground(new java.awt.Color(102, 102, 102));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn.setText("Delete customer");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        add(deletebtn);
        deletebtn.setBounds(40, 320, 200, 80);

        viewlbl.setBackground(new java.awt.Color(255, 255, 255));
        viewlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewlbl.setText("View customer information");
        viewlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewlblMouseClicked(evt);
            }
        });
        add(viewlbl);
        viewlbl.setBounds(40, 80, 200, 80);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagment/BB.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 280, 530);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Enter Customer's ID");
        add(jLabel2);
        jLabel2.setBounds(320, 90, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Account no.");
        add(jLabel3);
        jLabel3.setBounds(350, 150, 130, 17);

        deletbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletbtn.setText("Delete");
        deletbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletbtnMouseClicked(evt);
            }
        });
        add(deletbtn);
        deletbtn.setBounds(490, 250, 80, 30);

        idtxt.setBackground(new java.awt.Color(173, 208, 218));
        add(idtxt);
        idtxt.setBounds(509, 90, 230, 30);

        Accountxt.setBackground(new java.awt.Color(173, 208, 218));
        add(Accountxt);
        Accountxt.setBounds(509, 150, 230, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backlblMouseClicked

    private void openbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_openbtnMouseClicked

    private void openbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openbtnActionPerformed

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnMouseClicked

    private void viewlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewlblMouseClicked

    private void deletbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletbtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Accountxt;
    public javax.swing.JLabel backlbl;
    public javax.swing.JButton deletbtn;
    public javax.swing.JButton deletebtn;
    public javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JButton openbtn;
    public javax.swing.JButton viewlbl;
    // End of variables declaration//GEN-END:variables
}
