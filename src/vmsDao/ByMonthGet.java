package vmsDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author manoj
 */
public class ByMonthGet {

    String searchDate;
    ArrayList<String> pids = new ArrayList<String>();
    ArrayList<String> cintimes = new ArrayList<String>();
    ArrayList<String> couttimes = new ArrayList<String>();

    String searchMonth;
    String searchYear;

    public void setSearchMonth(String searchMonth) {
        this.searchMonth = searchMonth;
    }

    public void setSearchYear(String searchYear) {
        this.searchYear = searchYear;
    }
    
    
    public ArrayList<String> getPids() {
        return pids;
    }

    public ArrayList<String> getCintimes() {
        return cintimes;
    }

    public ArrayList<String> getCouttimes() {
        return couttimes;
    }

   

    Connection conn = null;
    Statement stmt = null;

    public String getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(String searchDate) {
        this.searchDate = searchDate;
    }

    public ByMonthGet(String searchMonth, String searchYear) {
        this.searchMonth = searchMonth;
        this.searchYear = searchYear;
    }

    public void findByMonth() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
            String sql2 = "SELECT * FROM masterdatetime right outer join pass on masterdatetime.Pass_No=pass.Pass_No"
                    + " WHERE MONTH(Check_In_Date) =" + searchMonth + " AND YEAR(Check_In_Date) ="+ searchYear + "";
            ResultSet rs = stmt.executeQuery(sql2);
            while (rs.next()) {
                System.out.println("in rs"+rs.getString("Pass_No"));
                //pids.add(rs.getString("Pass_No"));
                cintimes.add(rs.getTimestamp("Check_In_Time").toString());
                couttimes.add(rs.getTimestamp("Check_Out_Time").toString());
                System.out.println("testing in dao class");
            }

        } catch (Exception x) {
            System.out.println("" + x);
        }

        Iterator itr = pids.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        Iterator itrcin = cintimes.iterator();
        while (itrcin.hasNext()) {
            System.out.println(itrcin.next());
        }
        
        Iterator itrcout = couttimes.iterator();
        while (itrcout.hasNext()) {
            System.out.println(itrcout.next());
        }

    }

   /* public static void main(String[] args) {
       ByMonthGet obj =  new ByMonthGet("02", "2017");
       obj.findByDate();
        
    }*/


}
