/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.module.transport;

/**
 *
 * @author Ishan
 */
public class MFuel {

    public MFuel(int no, String lnplate, String date, double amount) {
        this.no = no;
        this.lnplate = lnplate;
        this.date = date;
        this.amount = amount;
    }
    private int no;
    private String lnplate;
    private String date;
    private double amount;

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
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
