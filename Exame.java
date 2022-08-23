/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

/**
 *
 * @author f169401
 */
public class Exame {
    
    private int ID;
    private String descricao;

    public Exame(int ID, String descricao) {
        this.ID = ID;
        this.descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
