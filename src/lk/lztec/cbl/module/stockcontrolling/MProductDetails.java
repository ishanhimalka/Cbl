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
public class MProductDetails {

    public MProductDetails(String pid, String name, int weight, int packets, int qty, double bprice) {
        this.pid = pid;
        this.name = name;
        this.weight = weight;
        this.packets = packets;
        this.qty = qty;
        this.bprice = bprice;
    }

   
     private String pid;
     private String name;
     private int weight;
     private int packets;
       private int qty;
     private double bprice;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the packets
     */
    public int getPackets() {
        return packets;
    }

    /**
     * @param packets the packets to set
     */
    public void setPackets(int packets) {
        this.packets = packets;
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
     * @return the bprice
     */
    public double getBprice() {
        return bprice;
    }

    /**
     * @param bprice the bprice to set
     */
    public void setBprice(double bprice) {
        this.bprice = bprice;
    }
   
  

}
