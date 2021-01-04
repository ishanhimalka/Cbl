/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.module.shopdetails;

/**
 *
 * @author Ishan
 */
public class MShop {

    public MShop(String id, String name, String address, int phone, String oname, String omic) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.oname = oname;
        this.omic = omic;
    }
    private String id;
    private String name;
    private String address;
    private int phone;
    private String oname;
    private String omic;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the oname
     */
    public String getOname() {
        return oname;
    }

    /**
     * @param oname the oname to set
     */
    public void setOname(String oname) {
        this.oname = oname;
    }

    /**
     * @return the omic
     */
    public String getOmic() {
        return omic;
    }

    /**
     * @param omic the omic to set
     */
    public void setOmic(String omic) {
        this.omic = omic;
    }
}
