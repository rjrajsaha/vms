
package vms;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
public class LoginForm extends javax.swing.JFrame {
    public LoginForm() {
        initComponents();
        this.setSize(768, 720);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unametext = new javax.swing.JTextField();
        passtext = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 20));
        setPreferredSize(new java.awt.Dimension(786, 720));
        getContentPane().setLayout(null);

        unametext.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        unametext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unametext.setBorder(null);
        unametext.setOpaque(false);
        getContentPane().add(unametext);
        unametext.setBounds(420, 380, 310, 40);

        passtext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passtext.setBorder(null);
        passtext.setOpaque(false);
        passtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passtextKeyPressed(evt);
            }
        });
        getContentPane().add(passtext);
        passtext.setBounds(420, 460, 310, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(786, 720));
        jLabel3.setMinimumSize(new java.awt.Dimension(786, 720));
        jLabel3.setPreferredSize(new java.awt.Dimension(786, 720));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 770, 720);

        log.setText("Login");
        log.setBorder(null);
        log.setOpaque(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log);
        log.setBounds(330, 560, 180, 40);

        jLabel1.setText("User Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(83, 45, 52, 14);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(89, 93, 46, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed

        this.loginSubmit();
    }//GEN-LAST:event_logActionPerformed

    private void passtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER ) {
            this.loginSubmit();
        }
    }//GEN-LAST:event_passtextKeyPressed

    private void loginSubmit() {
        vmsDao.LoginGet log = new vmsDao.LoginGet(unametext.getText(), passtext.getText());
        Boolean check = log.checkLogin();
        
        if (check){
            System.out.println("Login Success");
            String adminVar = log.getAdmin();
            System.out.println("Admin = "+adminVar);
            JOptionPane.showMessageDialog(this, "Login Success");
            MainWindow mw = new MainWindow();
            mw.setVisible(true);
            mw.setAdminVar(adminVar);
            this.dispose();
        }
        else {
            System.out.println("Wrong username or password");
            JOptionPane.showMessageDialog(this, "Wrong User Name or Password");
            unametext.setText("");
            passtext.setText("");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JTextField unametext;
    // End of variables declaration//GEN-END:variables
}
