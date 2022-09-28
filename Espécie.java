/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

/**
 *
 * @author f169401
 */
public class Espécie {
    private String nome;
    private int ID;
    
    public Espécie(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;    
    }
    
    public int getID() {
        return ID;   
    }

    @Override
    public String toString() {
        return this.nome + " \n";   
    }
}
