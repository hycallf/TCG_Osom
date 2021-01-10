/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcg_osom;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author KuroNeko
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setSize(layar.width,layar.height);       
        int kiri = (layar.width-this.getSize().width)/2;       
        int atas = (layar.height-this.getSize().height)/2;       
        setLocation(kiri,atas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        txtNickname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusername.setBackground(new java.awt.Color(8, 8, 8));
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 310, 40));

        txtPassword.setBackground(new java.awt.Color(7, 7, 7));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 310, 40));

        txtMail.setBackground(new java.awt.Color(8, 8, 8));
        txtMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMail.setForeground(new java.awt.Color(255, 255, 255));
        txtMail.setBorder(null);
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 310, 30));

        txtNickname.setBackground(new java.awt.Color(8, 8, 8));
        txtNickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNickname.setForeground(new java.awt.Color(255, 255, 255));
        txtNickname.setBorder(null);
        getContentPane().add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Register.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}