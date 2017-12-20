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
public class StaffGet {
    
    String vSName, vDesig, vDob, vDept, vType;
    int vStaffID;
    Connection conn;
    Statement stmt;
    public StaffGet(int vStaffID){
        this.vStaffID = vStaffID;
    }

    public StaffGet() {
    }

    public String getvSName() {
        return vSName;
    }

    public String getvDesig() {
        return vDesig;
    }

    public String getvDob() {
        return vDob;
    }

    public String getvDept() {
        return vDept;
    }

    public String getvType() {
        return vType;
    }

    public int getvStaffID() {
        return vStaffID;
    }

    public void setvStaffID(int vStaffID) {
        this.vStaffID = vStaffID;
    }
    
    
    public void getStaffDetails() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            /*            String sql = "SELECT Pass_No, Reg_No, Staff_ID FROM pass"
                    + "WHERE Pass_No=" + vPPassNo +"";*/
            String sql = "SELECT * FROM staff WHERE Staff_ID="+vStaffID;
            ResultSet rs = stmt.executeQuery(sql);
//STEP 5: Extract data from result set
            while (rs.next()) {
//Retrieve by column name

vSName = rs.getString("S_Name");
        vDesig = rs.getString("Desig");
        vDob= rs.getString("DOB");
                vDept = rs.getString("Dept");
                vType = rs.getString("Type");
                
//Display values
                System.out.print("ID: " + vStaffID);
                System.out.print(", Age: " + vSName);
                System.out.print(", First: " + vDesig);
                System.out.print(", Age: " + vDob);
                System.out.print(", First: " + vDept);
                System.out.print(", First: " + vType);
                

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
        StaffGet obj = new StaffGet(100);
        obj.getStaffDetails();
    }*/
    
}
