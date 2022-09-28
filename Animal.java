/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

/**
 *
 * @author f169401
 */
public class Animal {
    private String nome;
    private String genero;
    private int ID;
    private int IDcliente

    public Animal(String nome, String genero, int IDcliente) {
        this.nome = nome;
        this.genero = genero;
        this.IDcliente = IDcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getID() {
        return ID;
    }
    
    publiuc int getIDcliente() {
        return IDcliente;
    }
            
    @Override
    public String toString() {
        return this.nome + ", " + this.genero + ", " + this.IDcliente + " \n";
    }

}
