/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmsReports;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manoj
 */
public class ReportByDate extends javax.swing.JFrame {

    ArrayList<String> databasepids = new ArrayList<String>();
    ArrayList<String> databasecintimes = new ArrayList<String>();
    ArrayList<String> databasecouttimes = new ArrayList<String>();
    ArrayList<String> databaseregNo = new ArrayList<String>();
    ArrayList<String> databaseStaffName = new ArrayList<String>();
    ArrayList<String> databaseStaffDesig = new ArrayList<String>();
    ArrayList<Integer> databaseStaffID = new ArrayList<Integer>();

    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form ReportByDate
     */
    public ReportByDate() {
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

        view = new javax.swing.JButton();
        daytext = new javax.swing.JTextField();
        monthtext = new javax.swing.JTextField();
        yeartext = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportByDateTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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
        getContentPane().setLayout(null);

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(620, 70, 80, 50);

        daytext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                daytextFocusLost(evt);
            }
        });
        getContentPane().add(daytext);
        daytext.setBounds(260, 80, 50, 30);

        monthtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthtextFocusLost(evt);
            }
        });
        getContentPane().add(monthtext);
        monthtext.setBounds(330, 80, 50, 30);

        yeartext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yeartextFocusLost(evt);
            }
        });
        getContentPane().add(yeartext);
        yeartext.setBounds(400, 80, 80, 30);

        ReportByDateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pass Number", "Vehicle Number", "Staff Name", "Designation", "Check IN", "Check Out"
            }
        ));
        jScrollPane1.setViewportView(ReportByDateTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 170, 1270, 510);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/STaff rep.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 768);

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

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

        
        
        if (monthtext.getText().equals("") && daytext.getText().equals("") && yeartext.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a valid Date");
        } else {
            String dstring = yeartext.getText() + "-" + monthtext.getText() + "-" + daytext.getText();
            System.out.println("Date is " + dstring);
            try {
                //Getting data from masterdatetime
                vmsDao.ByDateGet getdata = new vmsDao.ByDateGet(dstring);
                getdata.findByDate();
                databasepids = getdata.getPids();
                databasecintimes = getdata.getCintimes();
                databasecouttimes = getdata.getCouttimes();
                System.out.println("masterdatabse done");
            } catch (Exception x) {
                System.out.println("" + x);
            }
            Iterator itrpassdata = databasepids.iterator();
            while (itrpassdata.hasNext()) {
                //Getting data from pass
                vmsDao.PassGet passget = new vmsDao.PassGet(itrpassdata.next().toString());
                passget.getPassDetails();
                databaseregNo.add(passget.getRegNo());
                databaseStaffID.add(passget.getStaffID());
                System.out.println("Wrong staddi==" + passget.getStaffID());
                databaseStaffID.add(passget.getStaffID());
                System.out.println("pass done::");
            }

            Iterator itrstaffid = databaseStaffID.iterator();
            while (itrstaffid.hasNext()) {
                //getting data from staff
                vmsDao.StaffGet staffget = new vmsDao.StaffGet(Integer.parseInt(itrstaffid.next().toString()));
                System.out.println("staff id dta==" + staffget.getvStaffID());
                staffget.getStaffDetails();

                System.out.println("DATA STAFF  ==" + staffget.getvSName());
                System.out.println("DATA STAFFDD === " + staffget.getvDesig());
                databaseStaffName.add(staffget.getvSName());
                databaseStaffDesig.add(staffget.getvDesig());
                System.out.println("Staff done");
            }

            Iterator itr = databasepids.iterator();
            Iterator itrin = databasecintimes.iterator();
            Iterator itrout = databasecouttimes.iterator();
            Iterator itrreg = databaseregNo.iterator();
            Iterator itrstaffname = databaseStaffName.iterator();
            Iterator itrstaffdesig = databaseStaffDesig.iterator();
            Object[] trow = new Object[6];
            model.setRowCount(0);

            while (itr.hasNext()) {
                /*System.out.println(itr.next());
            System.out.println(itrin.next());
            System.out.println(itrout.next());*/
                //System.out.println("SNAME=="+itrstaffname.next());
                //System.out.println("SDESIG=="+itrstaffdesig.next());
                /*
             itrin.hasNext();
             itrout.hasNext();
             itrreg.hasNext(); 
             itrstaffname.hasNext();
             itrstaffdesig.hasNext();
                 */
                model = (DefaultTableModel) ReportByDateTable.getModel();

                //Object[] row = new Object[6];
                /*Object[] row = {
              itr.next(), itrin.next(), itrout.next()
            };*/
                //model.addRow(row);
                // for (int i = 0; i < databasepids.size(); i++) {
                /* row[0] = databasepids;
            row[1] = databasepids;
            row[2] = databasepids;
            row[3] = databasepids;
            row[4] = databasecintimes;
            row[5] = databasecouttimes;
            model.addRow(row);*/
                //}
                trow[0] = itr.next();
                trow[1] = itrreg.next();
                trow[2] = itrstaffname.next();
                trow[3] = itrstaffdesig.next();
                trow[4] = itrin.next();
                trow[5] = itrout.next();
                model.addRow(trow);
            }
        }

    }//GEN-LAST:event_viewActionPerformed

    private void setTableData() {
        DefaultTableModel model = (DefaultTableModel) ReportByDateTable.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < databasepids.size(); i++) {
            row[0] = databasepids.get(i);
            row[1] = databasepids.get(i);
            row[2] = databasepids.get(i);
            row[3] = databasepids.get(i);
            row[4] = databasepids.get(i);
            row[5] = databasepids.get(i);

        }

    }

    private void daytextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_daytextFocusLost


    }//GEN-LAST:event_daytextFocusLost

    private void monthtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthtextFocusLost


    }//GEN-LAST:event_monthtextFocusLost

    private void yeartextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yeartextFocusLost

        if (monthtext.getText().length() == 2 && daytext.getText().length() == 2 && yeartext.getText().length() == 4) {
        } else {
            monthtext.setText("");
            daytext.setText("");
            yeartext.setText("");
            JOptionPane.showMessageDialog(this, "Enter a Valid Day in DD / MM / YYYY Format");

        }

    }//GEN-LAST:event_yeartextFocusLost

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        // new vms.IssuePass().setVisible(true);
        this.dispose();
        vms.IssuePass ip = new vms.IssuePass();
        ip.setAdminStat(vms.MainWindow.adminVar);
        ip.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        new vmsReports.ReportByDateVisitor().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed

        this.dispose();
       JOptionPane.showMessageDialog(this, "Log out From Main Window");
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportByDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportByDateTable;
    private javax.swing.JTextField daytext;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthtext;
    private javax.swing.JButton view;
    private javax.swing.JTextField yeartext;
    // End of variables declaration//GEN-END:variables
}