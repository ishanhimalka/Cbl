/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.module.employeemanagement;

/**
 *
 * @author Ishan
 */
public class MDriverAt {

    public MDriverAt(int no, String dnic, String date) {
        this.no = no;
        this.dnic = dnic;
        this.date = date;
    }
    private int no;
    private String dnic;
    private String date;

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * @return the dnic
     */
    public String getDnic() {
        return dnic;
    }

    /**
     * @param dnic the dnic to set
     */
    public void setDnic(String dnic) {
        this.dnic = dnic;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
