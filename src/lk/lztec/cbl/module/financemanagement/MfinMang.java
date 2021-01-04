/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.module.financemanagement;

/**
 *
 * @author Ishan
 */
public class MfinMang {

   
    private int no;
    private String date;
    private String Des;
    private double amount;

    public MfinMang() {
    }

    public MfinMang(int no, String date, String Des, double amount) {
        this.no = no;
        this.date = date;
        this.Des = Des;
        this.amount = amount;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MfinMang{" + "no=" + no + ", date=" + date + ", Des=" + Des + ", amount=" + amount + '}';
    }

    
}
