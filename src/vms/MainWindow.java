/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vms;

import javax.swing.JOptionPane;
import vmsDao.PassGet;
import vmsDao.VehicleGet;

/**
 *
 * @author manoj
 */
public class MainWindow extends javax.swing.JFrame {

    String vsPassNo, vsName, vsDesig, vsType, vRegNo, vColor, vType;
    String vvsPassNo, vvsName, vvsDesig, vvsType, vvRegNo, vvColor, vvType;
    int vstaffID;
    int vvstaffID;
    public static String adminVar;

    public String getAdminVar() {
        return adminVar;
    }

    public void setAdminVar(String adminVar) {
        this.adminVar = adminVar;
    }

    static public IssuePass ip = null;

    public MainWindow() {
        initComponents();
        checkIN.setEnabled(false);
        sname.setEditable(false);
        sdesig.setEditable(false);
        stype.setEditable(false);
        regNo.setEditable(false);
        vtype.setEditable(false);
        vcolor.setEditable(false);

        checkout.setEnabled(false);
        vsname.setEditable(false);
        vsdesig.setEditable(false);
        vstype.setEditable(false);
        vregNo.setEditable(false);
        vvtype.setEditable(false);
        vvcolor.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vvpassno = new javax.swing.JTextField();
        vsname = new javax.swing.JTextField();
        vsdesig = new javax.swing.JTextField();
        vstype = new javax.swing.JTextField();
        vregNo = new javax.swing.JTextField();
        vvtype = new javax.swing.JTextField();
        vvcolor = new javax.swing.JTextField();
        passNo = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        sdesig = new javax.swing.JTextField();
        stype = new javax.swing.JTextField();
        regNo = new javax.swing.JTextField();
        vtype = new javax.swing.JTextField();
        vcolor = new javax.swing.JTextField();
        checkIN = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        vvpassno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vvpassno.setBorder(null);
        vvpassno.setOpaque(false);
        vvpassno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vvpassnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vvpassnoFocusLost(evt);
            }
        });
        vvpassno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vvpassnoActionPerformed(evt);
            }
        });
        getContentPane().add(vvpassno);
        vvpassno.setBounds(1030, 190, 300, 30);

        vsname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vsname.setBorder(null);
        vsname.setOpaque(false);
        getContentPane().add(vsname);
        vsname.setBounds(1030, 250, 300, 30);

        vsdesig.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vsdesig.setBorder(null);
        vsdesig.setOpaque(false);
        vsdesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsdesigActionPerformed(evt);
            }
        });
        getContentPane().add(vsdesig);
        vsdesig.setBounds(1030, 310, 300, 30);

        vstype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vstype.setBorder(null);
        vstype.setOpaque(false);
        getContentPane().add(vstype);
        vstype.setBounds(1030, 370, 300, 30);

        vregNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vregNo.setBorder(null);
        vregNo.setOpaque(false);
        getContentPane().add(vregNo);
        vregNo.setBounds(1030, 430, 300, 30);

        vvtype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vvtype.setBorder(null);
        vvtype.setOpaque(false);
        getContentPane().add(vvtype);
        vvtype.setBounds(1030, 500, 300, 30);

        vvcolor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vvcolor.setBorder(null);
        vvcolor.setOpaque(false);
        getContentPane().add(vvcolor);
        vvcolor.setBounds(1030, 560, 300, 30);

        passNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passNo.setBorder(null);
        passNo.setOpaque(false);
        passNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passNoFocusLost(evt);
            }
        });
        getContentPane().add(passNo);
        passNo.setBounds(370, 190, 300, 30);

        sname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sname.setBorder(null);
        sname.setOpaque(false);
        getContentPane().add(sname);
        sname.setBounds(370, 250, 300, 30);

        sdesig.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sdesig.setBorder(null);
        sdesig.setOpaque(false);
        getContentPane().add(sdesig);
        sdesig.setBounds(370, 310, 300, 30);

        stype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stype.setBorder(null);
        stype.setOpaque(false);
        getContentPane().add(stype);
        stype.setBounds(370, 370, 300, 30);

        regNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        regNo.setBorder(null);
        regNo.setOpaque(false);
        getContentPane().add(regNo);
        regNo.setBounds(370, 430, 300, 30);

        vtype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vtype.setBorder(null);
        vtype.setOpaque(false);
        getContentPane().add(vtype);
        vtype.setBounds(370, 500, 300, 30);

        vcolor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vcolor.setBorder(null);
        vcolor.setOpaque(false);
        getContentPane().add(vcolor);
        vcolor.setBounds(370, 560, 300, 30);

        checkIN.setBorder(null);
        checkIN.setOpaque(false);
        checkIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkINActionPerformed(evt);
            }
        });
        getContentPane().add(checkIN);
        checkIN.setBounds(270, 620, 200, 60);

        checkout.setBorder(null);
        checkout.setOpaque(false);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        getContentPane().add(checkout);
        checkout.setBounds(960, 620, 190, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main window.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 1366, 768);

        jLabel1.setText("Pass Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(192, 311, 62, 14);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(192, 346, 27, 14);

        jLabel3.setText("Designation");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(192, 384, 56, 14);

        jLabel4.setText("Type");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(192, 422, 24, 14);

        jLabel5.setText("Registration Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(192, 482, 98, 14);

        jLabel6.setText("Type of Vehicle");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(192, 520, 73, 14);

        jLabel7.setText("Color");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(192, 558, 25, 14);

        jLabel8.setText("Pass Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(939, 322, 62, 14);

        jLabel9.setText("Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(939, 357, 27, 14);

        jLabel10.setText("Designation");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(939, 395, 56, 14);

        jLabel11.setText("Type");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(939, 433, 24, 14);

        jLabel12.setText("Registration Number");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(939, 493, 98, 14);

        jLabel13.setText("Type of Vehicle");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(939, 531, 73, 14);

        jLabel14.setText("Color");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(939, 569, 25, 14);

        jMenu3.setText("Vehicle Pass");

        jMenuItem5.setText("Register Vehicle");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Main Window");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Main Window");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Reports");

        jMenuItem2.setText("Daily Staff Report");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Daily Visitor Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Account");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Log Out");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passNoFocusLost

        vmsDao.PassGet cinPass = new vmsDao.PassGet();
        vmsDao.VehicleGet cinVehicle = new vmsDao.VehicleGet();
        vmsDao.StaffGet cinStaff = new vmsDao.StaffGet();

        vsPassNo = passNo.getText();

        //setting in variables
        //getting pass details
        cinPass.setPassNo(vsPassNo);
        cinPass.getPassDetails();
        vstaffID = cinPass.getStaffID();
        vRegNo = cinPass.getRegNo();

        cinStaff.setvStaffID(vstaffID);
        cinPass.getPassDetails();
        cinStaff.getStaffDetails();
        vsName = cinStaff.getvSName();
        vsDesig = cinStaff.getvDesig();
        vsType = cinStaff.getvType();

        cinVehicle.setvRegNo(vRegNo);
        cinVehicle.getVehicleDetails();
        vType = cinVehicle.getvType();
        vColor = cinVehicle.getvColour();

//Setting values
        sname.setText(vsName);
        sdesig.setText(vsDesig);
        stype.setText(vsType);

        regNo.setText(vRegNo);
        vtype.setText(vType);
        vcolor.setText(vColor);

        if (regNo.getText().equals("")) {

        } else {
            checkIN.setEnabled(true);
        }
    }//GEN-LAST:event_passNoFocusLost

    private void checkINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkINActionPerformed
        vmsDao.CheckInTime in = new vmsDao.CheckInTime();
        in.setvPassNo(passNo.getText());
        in.checkIN();
        if (in.isDataok() == true) {
            JOptionPane.showMessageDialog(this, "Check IN Done");
            checkIN.setEnabled(false);
            passNo.setText("");
            sname.setText("");
            sdesig.setText("");
            stype.setText("");
            regNo.setText("");
            vtype.setText("");
            vcolor.setText("");

            checkout.setEnabled(false);
            vvpassno.setText("");
            vsname.setText("");
            vsdesig.setText("");
            vstype.setText("");
            vregNo.setText("");
            vvtype.setText("");
            vvcolor.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Duplicate Check IN. Check OUT first");
            checkIN.setEnabled(false);
            passNo.setText("");
            sname.setText("");
            sdesig.setText("");
            stype.setText("");
            regNo.setText("");
            vtype.setText("");
            vcolor.setText("");

            checkout.setEnabled(false);
            vvpassno.setText("");
            vsname.setText("");
            vsdesig.setText("");
            vstype.setText("");
            vregNo.setText("");
            vvtype.setText("");
            vvcolor.setText("");

        }

    }//GEN-LAST:event_checkINActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed

        vmsDao.CheckOutTime out = new vmsDao.CheckOutTime();
        out.setvPassNo(vvpassno.getText());
        out.checkOut();
        if (out.isDataok() == true) {
            JOptionPane.showMessageDialog(this, "Check OUT Done");

            checkIN.setEnabled(false);
            passNo.setText("");
            sname.setText("");
            sdesig.setText("");
            stype.setText("");
            regNo.setText("");
            vtype.setText("");
            vcolor.setText("");

            checkout.setEnabled(false);
            vvpassno.setText("");
            vsname.setText("");
            vsdesig.setText("");
            vstype.setText("");
            vregNo.setText("");
            vvtype.setText("");
            vvcolor.setText("");
        } else {

            JOptionPane.showMessageDialog(this, "Check IN First");
            checkIN.setEnabled(false);
            passNo.setText("");
            sname.setText("");
            sdesig.setText("");
            stype.setText("");
            regNo.setText("");
            vtype.setText("");
            vcolor.setText("");

            checkout.setEnabled(false);
            vvpassno.setText("");
            vsname.setText("");
            vsdesig.setText("");
            vstype.setText("");
            vregNo.setText("");
            vvtype.setText("");
            vvcolor.setText("");
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void vvpassnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vvpassnoFocusLost

        vmsDao.PassGet cinPass = new vmsDao.PassGet();
        vmsDao.VehicleGet cinVehicle = new vmsDao.VehicleGet();
        vmsDao.StaffGet cinStaff = new vmsDao.StaffGet();

        vvsPassNo = vvpassno.getText();

        //setting in variables
        //getting pass details
        cinPass.setPassNo(vvsPassNo);
        cinPass.getPassDetails();
        vvstaffID = cinPass.getStaffID();
        vvRegNo = cinPass.getRegNo();

        cinStaff.setvStaffID(vvstaffID);
        cinPass.getPassDetails();
        cinStaff.getStaffDetails();
        vvsName = cinStaff.getvSName();
        vvsDesig = cinStaff.getvDesig();
        vvsType = cinStaff.getvType();

        cinVehicle.setvRegNo(vvRegNo);
        cinVehicle.getVehicleDetails();
        vvType = cinVehicle.getvType();
        vvColor = cinVehicle.getvColour();

//Setting values
        vsname.setText(vvsName);
        vsdesig.setText(vvsDesig);
        vstype.setText(vvsType);

        vregNo.setText(vvRegNo);
        vvtype.setText(vvType);
        vvcolor.setText(vvColor);

        if (vsname.getText().equals("")) {
            System.out.println("Permanent pass Not available");

            vmsDao.VPassGet cinTPass = new vmsDao.VPassGet();
            vmsDao.VisitorGet cinTVisitor = new vmsDao.VisitorGet();
            vmsDao.VehicleGet cinTvehicle = new vmsDao.VehicleGet();
            cinTPass.setPassNo(vvsPassNo);
            cinTPass.getPassDetails();
            vvstaffID = cinTPass.getVisitorID();
            vvRegNo = cinTPass.getRegNo();

            cinTVisitor.setvVisitorID(vvstaffID);
            cinTVisitor.getVisitorfDetails();
            vvsName = cinTVisitor.getVvName();

            cinTvehicle.setvRegNo(vvRegNo);
            cinTvehicle.getVehicleDetails();
            vvType = cinTvehicle.getvType();
            vvColor = cinTvehicle.getvColour();

            System.out.println("" + vvstaffID + " " + vvRegNo + " " + vvsName + " " + vvType + " " + vvColor);

//Setting values
            vsname.setText(vvsName);
            vsdesig.setText("----------");
            vstype.setText("----------");

            vregNo.setText(vvRegNo);
            vvtype.setText(vvType);
            vvcolor.setText(vvColor);

        }
        if (vsname.getText().equals("")) {

        } else {
            checkout.setEnabled(true);

            checkIN.setEnabled(false);
            passNo.setText("");
            sname.setText("");
            sdesig.setText("");
            stype.setText("");
            regNo.setText("");
            vtype.setText("");
            vcolor.setText("");
        }
    }//GEN-LAST:event_vvpassnoFocusLost

    private void passNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passNoFocusGained

        checkIN.setEnabled(false);
        passNo.setText("");
        sname.setText("");
        sdesig.setText("");
        stype.setText("");
        regNo.setText("");
        vtype.setText("");
        vcolor.setText("");

        checkout.setEnabled(false);
        vvpassno.setText("");
        vsname.setText("");
        vsdesig.setText("");
        vstype.setText("");
        vregNo.setText("");
        vvtype.setText("");
        vvcolor.setText("");

    }//GEN-LAST:event_passNoFocusGained

    private void vvpassnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vvpassnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vvpassnoActionPerformed

    private void vsdesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsdesigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsdesigActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        // new vms.IssuePass().setVisible(true);
        vms.IssuePass ip = new vms.IssuePass();
        ip.setAdminStat(adminVar);
        ip.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed

        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed


    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void vvpassnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vvpassnoFocusGained

        checkout.setEnabled(false);
        vvpassno.setText("");
        vsname.setText("");
        vsdesig.setText("");
        vstype.setText("");
        vregNo.setText("");
        vvtype.setText("");
        vvcolor.setText("");
    }//GEN-LAST:event_vvpassnoFocusGained

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        new vmsReports.ReportByDate().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        new vmsReports.ReportByDateVisitor().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkIN;
    private javax.swing.JButton checkout;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField passNo;
    private javax.swing.JTextField regNo;
    private javax.swing.JTextField sdesig;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField stype;
    private javax.swing.JTextField vcolor;
    private javax.swing.JTextField vregNo;
    private javax.swing.JTextField vsdesig;
    private javax.swing.JTextField vsname;
    private javax.swing.JTextField vstype;
    private javax.swing.JTextField vtype;
    private javax.swing.JTextField vvcolor;
    private javax.swing.JTextField vvpassno;
    private javax.swing.JTextField vvtype;
    // End of variables declaration//GEN-END:variables
}
