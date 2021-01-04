/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.module.stockcontrolling;

/**
 *
 * @author Ishan
 */
public class MstocklorryIn {

    public MstocklorryIn(int no, String lsid, int qty, String date) {
        this.no = no;
        this.lsid = lsid;
        this.qty = qty;
        this.date = date;
    }

   
     private int no;
     private String lsid;
         private int qty;
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
     * @return the lsid
     */
    public String getLsid() {
        return lsid;
    }

    /**
     * @param lsid the lsid to set
     */
    public void setLsid(String lsid) {
        this.lsid = lsid;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
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
