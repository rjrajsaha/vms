package vmsDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoVar {

    int aStaffID, aVisitorID;
    String aPPassNo;
    String aTPassNo;

    Connection conn = null;
    Statement stmt = null;

    AutoVar() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();

            String sql = "SELECT astaffID, avisitorID, apassNo, atpassNo FROM autoVar";
            ResultSet rs = stmt.executeQuery(sql);
//STEP 5: Extract data from result set
            while (rs.next()) {
//Retrieve by column name

                aStaffID = rs.getInt("astaffID");
                aVisitorID = rs.getInt("avisitorID");
                aPPassNo = rs.getString("apassNo");
                aTPassNo = rs.getString("atpassNo");
//Display values
                System.out.print("ID: " + aStaffID);
                System.out.print(", Age: " + aVisitorID);
                System.out.print(", First: " + aPPassNo);
                System.out.println(", Last: " + aTPassNo);
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

    public AutoVar(int aStaffID) {

    }

    public int getAutoStaffID() {
        return aStaffID;
    }

    public String getAutoPPassNo() {
        return aPPassNo;
    }

    public String getAutoTPassNo() {
        return aTPassNo;
    }

    public void setAutoStaffID(int aStaffID) {
        this.aStaffID = aStaffID;
    }

    public void setAutoPPassNo(String aPPassNo) {
        this.aPPassNo = aPPassNo;
    }

    public void setAutoTPassNo(String aTPassNo) {
        this.aTPassNo = aTPassNo;
    }

    int getAutoVisitorID() {
        return aVisitorID;
    }

    public void nextStaff() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
//update here
            String sql = "UPDATE autoVar  "
                    + "SET astaffID = astaffID + 1 ";
            stmt.executeUpdate(sql);
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

    public void nextVisitor() {

        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
//update here
            String sql = "UPDATE autoVar  "
                    + "SET avisitorID = avisitorID + 1 ";
            stmt.executeUpdate(sql);
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

    public void nextPPass() {

        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
//update here
            String sql = "UPDATE autoVar  "
                    + "SET apassNo = apassNo + 1 ";
            stmt.executeUpdate(sql);
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

    public void nextTPass() {

        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
//update here
            String sql = "UPDATE autoVar  "
                    + "SET atpassNo = atpassNo + 1 ";
            stmt.executeUpdate(sql);
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

    /*public static void main(String arg[]) {
        AutoVar obj = new AutoVar(1);
        obj.nextStaff();
        obj.nextVisitor();
        obj.nextPPass();
        obj.nextTPass();

    }*/
}
