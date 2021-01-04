/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.module.sales;

/**
 *
 * @author Ishan
 */
public class MSales {

    public MSales(int sno, String lsid, int bno, int qty, int dis, double tot) {
        this.sno = sno;
        this.lsid = lsid;
        this.bno = bno;
        this.qty = qty;
        this.dis = dis;
        this.tot = tot;
    }
    private int sno;
    private String lsid;
    private int bno;
    private int qty;
    private int dis;
    private double tot;

    /**
     * @return the sno
     */
    public int getSno() {
        return sno;
    }

    /**
     * @param sno the sno to set
     */
    public void setSno(int sno) {
        this.sno = sno;
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
     * @return the bno
     */
    public int getBno() {
        return bno;
    }

    /**
     * @param bno the bno to set
     */
    public void setBno(int bno) {
        this.bno = bno;
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
     * @return the dis
     */
    public int getDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(int dis) {
        this.dis = dis;
    }

    /**
     * @return the tot
     */
    public double getTot() {
        return tot;
    }

    /**
     * @param tot the tot to set
     */
    public void setTot(double tot) {
        this.tot = tot;
    }
}
