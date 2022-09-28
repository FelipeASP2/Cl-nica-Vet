/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

import java.util.Calendar;

/**
 *
 * @author f169401
 */
public class Tratamento {
 private String datainicial;
 private String datafinal;
 private int id;
 private int idAnimal;

    public Tratamento(String datainicial, String datafinal, int idAnimal, ) {
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.idAnimal = idAnimal;
    }
 
 
    public int getID() {
        return id;
 }
 

    public String getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }

    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal() {
        this.idAnimal = idAnimal;
    }
  
    @Override
    public String toString() {
        return this.datainicial + ", " + this.datafinal + " \n";
    }
 
    
}
