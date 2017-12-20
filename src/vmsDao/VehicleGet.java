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
public class VehicleGet {

    public boolean isDataok() {
        return dataok;
    }

    String vRegNo, vType, vModel, vColour;

    boolean dataok;
    Connection conn;
    Statement stmt;

    public VehicleGet() {
    }

    public VehicleGet(String vRegNo) {
        this.vRegNo = vRegNo;
    }

   
    public String getvRegNo() {
        return vRegNo;
    }

    public String getvType() {
        return vType;
    }

    public String getvModel() {
        return vModel;
    }

    public String getvColour() {
        return vColour;
    }

    public void setvRegNo(String vRegNo) {
        this.vRegNo = vRegNo;
    }

    public void getVehicleDetails() {

        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM vehicle WHERE Reg_No=" + "'" + vRegNo + "'";
            ResultSet rs = stmt.executeQuery(sql);
            dataok = false;
//STEP 5: Extract data from result set
            while (rs.next()) {
//Retrieve by column name

                vRegNo = rs.getString("Reg_No");
                vType = rs.getString("Type");
                vModel = rs.getString("Model");
                vColour = rs.getString("Color");

//Display values
                System.out.print("ID: " + vRegNo);
                System.out.print(", Age: " + vType);
                System.out.print(", First: " + vModel);
                System.out.print(", Age: " + vColour);
                dataok = true;
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
        VehicleGet obj = new VehicleGet("hr-ab-7841");
        obj.getVehicleDetails();
    }*/
}
