/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

/**
 *
 * @author f169401
 */
public class Espécie {
    
    private int ID;
    private String nome;

    public Espécie(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
