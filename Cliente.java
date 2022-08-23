/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

/**
 *
 * @author f169401
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private long CEP;
    private int ID;

    public Cliente(String nome, String endereco, String telefone, String email, long CEP, int ID) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.CEP = CEP;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }

    public int getID() {
        return ID;
    }

    
    
}
