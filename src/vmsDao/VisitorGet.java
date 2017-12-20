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
public class VisitorGet {

    String vvName, vAddress, vContact, vDob, vPerson, vPurpose;
    int vVisitorID;
    Connection conn;
    Statement stmt;

    public String getVvName() {
        return vvName;
    }

    public String getvAddress() {
        return vAddress;
    }

    public String getvContact() {
        return vContact;
    }

    public String getvDob() {
        return vDob;
    }

    public String getvPerson() {
        return vPerson;
    }

    public String getvPurpose() {
        return vPurpose;
    }

    public int getvVisitorID() {
        return vVisitorID;
    }

    public void setvVisitorID(int vVisitorID) {
        this.vVisitorID = vVisitorID;
    }

    public VisitorGet(int vVisitorID) {
        this.vVisitorID = vVisitorID;
    }

    public VisitorGet() {

    }

    public void getVisitorfDetails() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            /*            String sql = "SELECT Pass_No, Reg_No, Staff_ID FROM pass"
                    + "WHERE Pass_No=" + vPPassNo +"";*/
            String sql = "SELECT * FROM visitor WHERE V_ID=" + vVisitorID;
            ResultSet rs = stmt.executeQuery(sql);
//STEP 5: Extract data from result set
            while (rs.next()) {
//Retrieve by column name

                vvName = rs.getString("V_Name");
                vDob = rs.getString("DOB");
                vContact = rs.getString("Contact");
                vAddress = rs.getString("Address");
                vPerson = rs.getString("V_Person");
                vPurpose = rs.getString("Purpose");

//Display values
                System.out.print("ID: " + vVisitorID);
                System.out.print(", Age: " + vvName);
                System.out.print(", First: " + vContact);
                System.out.print(", Age: " + vDob);
                System.out.print(", First: " + vPerson);
                System.out.print(", First: " + vPurpose);
                System.out.print(", First: " + vAddress);
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
