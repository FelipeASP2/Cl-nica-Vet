/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

/**
 *
 * @author f169401
 */
public class Exame {
    private int ID;
    private int IDconsulta;
    private String comentarios;

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
