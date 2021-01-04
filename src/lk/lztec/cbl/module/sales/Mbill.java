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
public class Mbill {

    public Mbill(int bno, String sid, String date, String payme, String paid, double tot) {
        this.bno = bno;
        this.sid = sid;
        this.date = date;
        this.payme = payme;
        this.paid = paid;
        this.tot = tot;
    }
    private int bno;
    private String sid;
    private String date;
    private String payme;
    private String paid;
    private double tot;

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
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
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

    /**
     * @return the payme
     */
    public String getPayme() {
        return payme;
    }

    /**
     * @param payme the payme to set
     */
    public void setPayme(String payme) {
        this.payme = payme;
    }

    /**
     * @return the paid
     */
    public String getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(String paid) {
        this.paid = paid;
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
