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
public class AfDeposit extends javax.swing.JPanel {

    /**
     * Creates new form AfDeposit
     */
    public AfDeposit() {
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
        jLabel4 = new javax.swing.JLabel();
        balancetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        continuebtn = new javax.swing.JButton();
        logoutlbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Welcom =)");
        add(jLabel2);
        jLabel2.setBounds(534, 50, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("New Balance ");
        add(jLabel4);
        jLabel4.setBounds(360, 130, 110, 17);

        balancetxt.setEditable(false);
        balancetxt.setBackground(new java.awt.Color(0, 153, 204));
        balancetxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(balancetxt);
        balancetxt.setBounds(340, 170, 120, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Thank You");
        add(jLabel5);
        jLabel5.setBounds(360, 240, 80, 17);

        continuebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        continuebtn.setText("Continue");
        continuebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuebtnMouseClicked(evt);
            }
        });
        add(continuebtn);
        continuebtn.setBounds(360, 370, 90, 40);

        logoutlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutlbl.setForeground(new java.awt.Color(153, 0, 0));
        logoutlbl.setText("LogOut");
        logoutlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlblMouseClicked(evt);
            }
        });
        add(logoutlbl);
        logoutlbl.setBounds(600, 370, 80, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagment/B1.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(840, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(840, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(840, 500));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void continuebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_continuebtnMouseClicked

    private void logoutlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutlblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField balancetxt;
    public javax.swing.JButton continuebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel logoutlbl;
    // End of variables declaration//GEN-END:variables
}
