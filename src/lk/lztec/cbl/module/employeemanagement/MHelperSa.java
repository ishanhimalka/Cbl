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
public class MHelperSa {

    public MHelperSa(int no, String hnic, int sal, String date) {
        this.no = no;
        this.hnic = hnic;
        this.sal = sal;
        this.date = date;
    }
     private int no;
    private String hnic;
    private int sal;
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
     * @return the hnic
     */
    public String getHnic() {
        return hnic;
    }

    /**
     * @param hnic the hnic to set
     */
    public void setHnic(String hnic) {
        this.hnic = hnic;
    }

    /**
     * @return the sal
     */
    public int getSal() {
        return sal;
    }

    /**
     * @param sal the sal to set
     */
    public void setSal(int sal) {
        this.sal = sal;
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
