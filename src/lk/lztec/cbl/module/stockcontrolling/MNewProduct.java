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
public class MNewProduct {

    public MNewProduct(int no, String productid, int qty, String data) {
        this.no = no;
        this.pid = productid;
        this.qty = qty;
        this.date = data;
    }
    private int no;
    private String pid;
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
     * @return the productid
     */
    public String getProductid() {
        return pid;
    }

    /**
     * @param productid the productid to set
     */
    public void setProductid(String productid) {
        this.pid = productid;
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
     * @return the data
     */
    public String getData() {
        return date;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.date = data;
    }
}
