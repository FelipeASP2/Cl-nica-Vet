/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

import java.util.Date;

/**
 *
 * @author f169401
 */
public class Consulta {
    private int ID;
    private String data;;
    private String historico;
    private int IDtratamento;
    private int IDvet;
    private int IDanimal;

    public Consulta(String data, String historico, int IDtratamento, IDvet, IDanimal) {
        this.data = data;
        this.historico = historico;
        this.IDtratamento = IDtratamento;
        this.IDvet = IDvet;
        this.IDanimal = IDanimal;
    }

    public int getID() {
        return ID;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getHistorico () {
        return historico;   
    }
    
    public void setHistorico(Sstring historico) {
           this.historico = historico;
    }
    
    public int getIDtratamento() {
        return IDtratamento;   
    }
    
    public void setIDtratamento(int IDtratamento) {
        this.IDtratamento = IDtratamento;   
    }
    
    public int getIDvet () {
        return IDvet;   
    }
    
    public void setIDvet(int IDvet) {
        this.IDvet = IDvet;   
    }
    
    public int getIDanimal () {
        return IDanimal;   
    }
    
    public void setIDanimal (int IDanimal) {
        this.IDanimal = IDanimal   
    }
 
    @Override
    public String toString() {
        return this.data = ", " + this.historico + ", " + this.IDtratamento + ", " + this.IDvet + ", " + this.IDanimal + " \n";   
    }
}
