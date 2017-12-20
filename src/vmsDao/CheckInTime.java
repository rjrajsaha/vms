/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmsDao;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class CheckInTime {

    String vPassNo;

    Connection conn = null;
    Statement stmt = null;
    int dbase = 0;
    boolean dataok;

    public boolean isDataok() {
        return dataok;
    }

    public void setvPassNo(String vPassNo) {
        this.vPassNo = vPassNo;
    }

    public int getDbase() {
        return dbase;
    }

    public void checkIN() {

        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
            boolean insfalg = true;
            if (true) {
                String coutnull = "";
                String sql2 = "SELECT * FROM masterdatetime WHERE Pass_No =" + "'" + vPassNo + "' and Check_Out_Date IS NULL";
                ResultSet rs = stmt.executeQuery(sql2);
                while (rs.next()) {
                    System.out.println("Pass No====" + rs.getString("Pass_No"));
                    insfalg = false;

                }
                /*if(rs.wasNull()) {
                    System.out.println("got it");
                }*/
            }
            System.out.println("Show Flag=="+insfalg);
            if (insfalg == true) {
                String sql = "INSERT INTO masterdatetime (Pass_No, Check_In_Date, Check_In_Time)"
                        + "VALUES ('" + vPassNo + "',now() ,now())";
                dbase = stmt.executeUpdate(sql);
                if(dbase > 0)
                    dataok = true;
            }
            else {
                dataok = false;
            }
           
            stmt.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("" + x);
        }
    }
    /*public static void main(String[] args) {
        CheckInTime obj = new CheckInTime();
        obj.setvPassNo("50002");
        obj.checkIN();
    }*/
}
