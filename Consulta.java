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
public class Consulta {
    
    private Date dataconsulta;
    private String historico;
    private int ID;

    public Consulta(Date dataconsulta, String historico, int ID) {
        this.dataconsulta = dataconsulta;
        this.historico = historico;
        this.ID = ID;
    }

    public Date getDataconsulta() {
        return dataconsulta;
    }

    public void setDataconsulta(Date dataconsulta) {
        this.dataconsulta = dataconsulta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public int getID() {
        return ID;
    }
    
    
}
