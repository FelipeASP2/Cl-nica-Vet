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
    private int animalID;

    public Consulta(String comentarios, int IDconsulta) {
        this.IDconsulta = consulta;
        this.comentarios = comentarios;
    }

    public int getID() {
        return ID;
    }
    
    public String getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    public int getIDconsulta () {
        return IDconsulta;   
    }
    
    public void setIDconsulta(int IDconsulta) {
           this.IDconsulta = IDconsulta;
    }
 
    @Override
    public String toString() {
        return this.comentarios;   
    }
}
