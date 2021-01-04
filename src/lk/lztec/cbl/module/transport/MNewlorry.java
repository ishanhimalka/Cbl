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
public class MNewlorry {

    public MNewlorry(String nplate, String dnic, String hnic, String date) {
        this.nplate = nplate;
        this.dnic = dnic;
        this.hnic = hnic;
        this.date = date;
    }

     private String nplate;
     private String dnic;
     private String hnic;
     private String date;

    /**
     * @return the nplate
     */
    public String getNplate() {
        return nplate;
    }

    /**
     * @param nplate the nplate to set
     */
    public void setNplate(String nplate) {
        this.nplate = nplate;
    }

    /**
     * @return the dnic
     */
    public String getDnic() {
        return dnic;
    }

    /**
     * @param dnic the dnic to set
     */
    public void setDnic(String dnic) {
        this.dnic = dnic;
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
