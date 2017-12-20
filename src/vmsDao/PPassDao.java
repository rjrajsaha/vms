package vmsDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PPassDao {

    String vPassNo, vRegNo;
    int vStaffID;
    boolean dflag;

    public boolean isDflag() {
        return dflag;
    }
    

    Connection conn = null;
    Statement stmt = null;

    public PPassDao(String vRegNo, int vStaffID) {
        this.vPassNo = new vmsDao.AutoVar().getAutoPPassNo();
        this.vRegNo = vRegNo;
        this.vStaffID = vStaffID;
    }

    public void createPPass() {
        dflag = false;
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            String sql = "INSERT INTO pass "
                    + "VALUES ('" + vPassNo + "', '" + vRegNo + "', " + vStaffID + ")";
            int dupdate = stmt.executeUpdate(sql);
            System.out.println("Permanent Pass Number" + vPassNo);
            
            if(dupdate > 0){
                new vmsDao.AutoVar().nextPPass();
                dflag = true;
            }
            
            stmt.close();
            conn.close();

        } catch (Exception x) {
            System.out.println("" + x);
        }
        finally {
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

    public String getPPass() {
        return vPassNo;
    }

    public static void main(String[] arg) {
        /*PPassDao PPass = new PPassDao("10000", "JH05-AJ-7144", 100);
        PPass.createPPass()*/
    }

}
