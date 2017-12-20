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
public class ByDateGet {

    String searchDate;
    ArrayList<String> pids = new ArrayList<String>();
    ArrayList<String> cintimes = new ArrayList<String>();
    ArrayList<String> couttimes = new ArrayList<String>();

    public ArrayList<String> getPids() {
        return pids;
    }

    public ArrayList<String> getCintimes() {
        return cintimes;
    }

    public ArrayList<String> getCouttimes() {
        return couttimes;
    }

    public ByDateGet(String searchDate) {
        this.searchDate = searchDate;
    }

    Connection conn = null;
    Statement stmt = null;

    public String getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(String searchDate) {
        this.searchDate = searchDate;
    }

    public void findByDate() {
        try {
            conn = new vmsDao.VmsDatabase().getConnection();
            stmt = conn.createStatement();
            String sql2 = "SELECT * FROM masterdatetime right outer join pass on masterdatetime.Pass_No=pass.Pass_No"
                    + " WHERE Check_In_Date =" + "'" + searchDate + "'";
            //String sql = "SELECT * FROM masterdatetime WHERE Check_In_Date =" + "'" + searchDate + "'";
            ResultSet rs = stmt.executeQuery(sql2);
            while (rs.next()) {
                pids.add(rs.getString("Pass_No"));
                cintimes.add(rs.getTimestamp("Check_In_Time").toString());
                couttimes.add(rs.getTimestamp("Check_Out_Time").toString());

            }

        } catch (Exception x) {
            System.out.println("" + x);
        }

        Iterator itr = pids.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    /*public static void main(String[] args) {
       ByDateGet obj =  new ByDateGet("2017-2-26");
       obj.findByDate();
        System.out.println(""+obj.getSearchDate());
    }*/

}
