/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

/**
 *
 * @author f169401
 */
public class Animal {
    private String nome;
    private int idade;
    private int sexo;
    private int ID;

    public Animal(String nome, int idade, int sexo, int ID) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getID() {
        return ID;
    }
     

}
