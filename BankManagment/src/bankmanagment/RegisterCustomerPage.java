/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagment;


public class RegisterCustomerPage extends javax.swing.JPanel {

    /**
     * Creates new form RegisterCustomerPage
     */
    public RegisterCustomerPage() {
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

        jLabel2 = new javax.swing.JLabel();
        nameCtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IDtxt = new javax.swing.JTextField();
        addrtxt = new javax.swing.JTextField();
        DOBtxt = new javax.swing.JTextField();
        Emailtxt = new javax.swing.JTextField();
        phontxt = new javax.swing.JTextField();
        userCtxt = new javax.swing.JTextField();
        passCtxt = new javax.swing.JPasswordField();
        OKR = new javax.swing.JButton();
        BackR = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setLayout(null);
        add(nameCtxt);
        nameCtxt.setBounds(120, 70, 310, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("yyyy-mm-dd");
        add(jLabel5);
        jLabel5.setBounds(440, 194, 90, 20);
        add(IDtxt);
        IDtxt.setBounds(150, 110, 280, 30);

        addrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrtxtActionPerformed(evt);
            }
        });
        add(addrtxt);
        addrtxt.setBounds(130, 150, 300, 30);
        add(DOBtxt);
        DOBtxt.setBounds(160, 190, 270, 30);

        Emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtxtActionPerformed(evt);
            }
        });
        add(Emailtxt);
        Emailtxt.setBounds(180, 240, 250, 30);
        add(phontxt);
        phontxt.setBounds(180, 280, 250, 30);
        add(userCtxt);
        userCtxt.setBounds(180, 320, 250, 30);
        add(passCtxt);
        passCtxt.setBounds(180, 360, 250, 30);

        OKR.setBackground(new java.awt.Color(255, 255, 255));
        OKR.setText("OK");
        OKR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKRMouseClicked(evt);
            }
        });
        add(OKR);
        OKR.setBounds(240, 410, 47, 23);

        BackR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackR.setForeground(new java.awt.Color(51, 102, 0));
        BackR.setText(">>Back");
        BackR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackRMouseClicked(evt);
            }
        });
        add(BackR);
        BackR.setBounds(40, 30, 60, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Registration | Customer");
        add(jLabel4);
        jLabel4.setBounds(520, 210, 320, 60);

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagment/Register111.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(840, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(840, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(808, 488));
        add(jLabel1);
        jLabel1.setBounds(0, -10, 710, 470);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagment/Register111.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(350, -20, 520, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void addrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrtxtActionPerformed

    private void EmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailtxtActionPerformed

    private void BackRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackRMouseClicked

    private void OKRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OKRMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BackR;
    public javax.swing.JTextField DOBtxt;
    public javax.swing.JTextField Emailtxt;
    public javax.swing.JTextField IDtxt;
    public javax.swing.JButton OKR;
    public javax.swing.JTextField addrtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField nameCtxt;
    public javax.swing.JPasswordField passCtxt;
    public javax.swing.JTextField phontxt;
    public javax.swing.JTextField userCtxt;
    // End of variables declaration//GEN-END:variables
}