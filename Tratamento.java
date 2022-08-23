/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.util.Date;

/**
 *
 * @author f169401
 */
public class Tratamento {
    
    private Date datainic;
    private Date datafin;
    private int ID;

    public Tratamento(Date datainic, Date datafin, int ID) {
        this.datainic = datainic;
        this.datafin = datafin;
        this.ID = ID;
    }

    public Date getDatainic() {
        return datainic;
    }

    public void setDatainic(Date datainic) {
        this.datainic = datainic;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public int getID() {
        return ID;
    }

    
}
