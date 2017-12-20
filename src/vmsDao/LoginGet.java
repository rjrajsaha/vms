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
 * @author manoj
 */
public class LoginGet {

    String userName, password;
    String duserName, dpassword, admin;
    boolean flag = false;

    Connection conn = null;
    Statement stmt = null;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdmin() {
        return admin;
    }
    
    

    public LoginGet(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean checkLogin() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM login WHERE uname ='" + userName + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                duserName = rs.getString("uname");
                dpassword = rs.getString("pass");
                admin = rs.getString("admin");
            }
            if(userName.equals(duserName) && password.equals(dpassword)) {
                flag = true;
            }
            else
                flag = false;
        } catch (Exception x) {
            System.out.println("" + x);
        }
        return flag;
    }
}
