/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmsDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author manoj
 */
public class StaffDao {

    String vSName, vDesig, vDob, vDept, vType;
    int vStaffID;
    boolean dataok;

    public boolean isDataok() {
        return dataok;
    }
    Connection conn;
    Statement stmt;

    public StaffDao(String vSName, String vDesig, String vDob, String vDept, String vType) {
        this.vSName = vSName;
        this.vDesig = vDesig;
        this.vDob = vDob;
        this.vDept = vDept;
        this.vType = vType;
        vStaffID = new AutoVar().getAutoStaffID();
    }

    public void createStaff() {
        VmsDatabase vdb = new VmsDatabase();
        try {
            dataok = false;
            conn = vdb.getConnection();
            stmt = conn.createStatement();
            String sql = "INSERT INTO staff "
                    + "VALUES ('" + vSName + "', '" + vDesig + "', '" + vDob + "', '" + vDept + "', '" + vType + "', '" + vStaffID + "')";
            int dupdate = stmt.executeUpdate(sql);
            System.out.println("Staff ID" + vStaffID);
            if(dupdate > 0){
                new vmsDao.AutoVar().nextStaff();
                dataok = true;
            }
            stmt.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("" + x);
        } finally {
//finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }

        }
    }

    public int getStaffID() {
        return vStaffID;
    }

    public static void main(String arg[]) {
        /*vmsDao.StaffDao staff = new vmsDao.StaffDao("a","a","a","a","a");
        staff.createStaff();*/
    }
}
