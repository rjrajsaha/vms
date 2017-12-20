package vmsDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TPassDao {

    String vPassNo, vRegNo;
    int vVisitorID;

    public String getvRegNo() {
        return vRegNo;
    }
    
    

    Connection conn = null;
    Statement stmt = null;

    public TPassDao(String vRegNo, int vVisitorID) {
        this.vPassNo = new vmsDao.AutoVar().getAutoTPassNo();
        this.vRegNo = vRegNo;
        this.vVisitorID = vVisitorID;
    }

    public void createTempoPass() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            String sql = "INSERT INTO visitorpass "
                    + "VALUES ('" + vPassNo + "', '" + vRegNo + "', " + vVisitorID + ")";
            int dvar = stmt.executeUpdate(sql);
            System.out.println("Visitor Pass Number" + vPassNo);
            if(dvar > 0) {
                new vmsDao.AutoVar().nextTPass();
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

    public String getTPass() {
        return vPassNo;
    }

    public static void main(String[] arg) {
        /*PPassDao PPass = new PPassDao("10000", "JH05-AJ-7144", 100);
        PPass.createPPass()*/
    }

}
