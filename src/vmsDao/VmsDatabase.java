package vmsDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VmsDatabase {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/vms";

    static final String USER = "raj";
    static final String PASS = "admin";

    static Connection conn = null;
    static Statement stmt = null;

    static public Connection getConnection() {
        try {
//STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
//STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;

        } catch (ClassNotFoundException | SQLException x) {
            System.out.println("" + x);
            return null;
        } 

    }

    public void closeConnection() {
        try {
            conn.close();
            stmt.close();
        }
        catch(Exception x) {
            System.out.println(x);
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
    public Statement getStatement() {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            return stmt;
        } catch (SQLException ex) {
            Logger.getLogger(VmsDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
