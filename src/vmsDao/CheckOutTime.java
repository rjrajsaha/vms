/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmsDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author root
 */
public class CheckOutTime {

    String vPassNo;
    boolean dataok;
    int dbase;

    public boolean isDataok() {
        return dataok;
    }

    public int getDbase() {
        return dbase;
    }

    Connection conn = null;
    Statement stmt = null;

    public void setvPassNo(String vPassNo) {
        this.vPassNo = vPassNo;
    }

    public void checkOut() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            boolean insfalg = false;
            if (true) {
                String coutnull = "";
                String sql2 = "SELECT * FROM masterdatetime WHERE Pass_No =" + "'" + vPassNo + "' and Check_Out_Date IS NULL";
                ResultSet rs = stmt.executeQuery(sql2);
                while (rs.next()) {
                    System.out.println("Pass No====" + rs.getString("Pass_No"));
                    insfalg = true;

                }
                /*if(rs.wasNull()) {
                    System.out.println("got it");
                }*/
            }
            System.out.println("Show Flag==" + insfalg);

            if (insfalg == true) {
                String sql = "UPDATE masterdatetime SET Check_Out_Date = now(), Check_Out_Time = now() "
                    + "WHERE Pass_No=" + "'" + vPassNo + "' and Check_Out_Date IS NULL";
                dbase = stmt.executeUpdate(sql);
                dataok = true;
            }
            else {
                dataok = false;
            }
            
            
            
            conn.close();
            stmt.close();
        } catch (Exception x) {
            System.out.println("" + x);
        }
    }

    public static void main(String[] args) {
        CheckOutTime out = new CheckOutTime();
        out.setvPassNo("50001");
        out.checkOut();
    }

}
