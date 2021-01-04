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
public class MLorryStock {

    public MLorryStock(String lsid, String lnplate, String pid, double sprice, int qty) {
        this.lsid = lsid;
        this.lnplate = lnplate;
        this.pid = pid;
        this.sprice = sprice;
        this.qty = qty;
    }

    private String lsid;
    private String lnplate;
    private String pid;
    private double sprice;
    private int qty;

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
     * @return the lnplate
     */
    public String getLnplate() {
        return lnplate;
    }

    /**
     * @param lnplate the lnplate to set
     */
    public void setLnplate(String lnplate) {
        this.lnplate = lnplate;
    }

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return the sprice
     */
    public double getSprice() {
        return sprice;
    }

    /**
     * @param sprice the sprice to set
     */
    public void setSprice(double sprice) {
        this.sprice = sprice;
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

}
