/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vmsDao;

/**
 *
 * @author manoj
 */
public class PermanentPassDao {

    String vPassNo, vRegno;
    int vStaffID;

    public PermanentPassDao(String vPassNo, String vRegno, int vStaffID) {
        this.vPassNo = vPassNo;
        this.vRegno = vRegno;
        this.vStaffID = vStaffID;
    }

}
