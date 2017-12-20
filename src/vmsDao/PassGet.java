/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmsDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author manoj
 */
public class PassGet {

    String vPPassNo, vRegNo;
    int vStaffID;

    Connection conn;
    Statement stmt;

    public PassGet() {

    }

    public PassGet(String vPPassNo) {
        this.vPPassNo = vPPassNo;
    }

    public String getRegNo() {
        return vRegNo;
    }

    public int getStaffID() {
        return vStaffID;
    }

    public void setPassNo(String vPPassno) {
        this.vPPassNo = vPPassno;
    }

    public void getPassDetails() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            /*            String sql = "SELECT Pass_No, Reg_No, Staff_ID FROM pass"
                    + "WHERE Pass_No=" + vPPassNo +"";*/
            String sql = "SELECT Reg_No, Staff_ID FROM pass WHERE Pass_No=" + "'" + vPPassNo + "'";
            ResultSet rs = stmt.executeQuery(sql);
//STEP 5: Extract data from result set
            while (rs.next()) {
//Retrieve by column name

                // vPPassNo = rs.getString("Pass_No");
                vRegNo = rs.getString("Reg_No");
                vStaffID = rs.getInt("Staff_ID");

//Display values
                System.out.print("ID: " + vStaffID);
                System.out.print(", Age: " + vRegNo);
                System.out.print(", First: " + vPPassNo);

            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
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

    /*public static void main(String arg[]) {
        PassGet obj = new PassGet("10000");
        obj.getPassDetails();
    }*/
}
