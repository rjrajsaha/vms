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
public class VisitorDao {

    String vvName, vvDob, vvContact, vvAddress, vvPerson, vvPurpose;
    int vvID;
    Connection conn;
    Statement stmt;

    public VisitorDao(String vvName, String vvDob, String vvContact, String vvAddress, String vvPerson, String vvPurpose) {
        this.vvName = vvName;
        this.vvDob = vvDob;
        this.vvContact = vvContact;
        this.vvAddress = vvAddress;
        this.vvPerson = vvPerson;
        this.vvPurpose = vvPurpose;
        vvID = new AutoVar().getAutoVisitorID();
        //vvID = 2;
    }

    public void createVisitor() {
        VmsDatabase vdb = new VmsDatabase();
        try {
            conn = vdb.getConnection();
            stmt = conn.createStatement();
            String sql = "INSERT INTO visitor "
                    + "VALUES ('" + vvName + "', '" + vvDob + "', '" + vvContact + "', '" + vvAddress + "', '" + vvPerson + "', '" + vvPurpose + "'," + vvID + ")";
            int dvar = stmt.executeUpdate(sql);
            if(dvar >= 0 ){
                new AutoVar().nextVisitor();
            }
            System.out.println("Visitor ID" + vvID);
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

    public int getVisitorID() {
        return vvID;
    }

    public static void main(String arg[]) {
        /*vmsDao.VisitorDao visitor = new vmsDao.VisitorDao("a","b","c","d","e","f");
        visitor.createStaff();*/
    }
}
