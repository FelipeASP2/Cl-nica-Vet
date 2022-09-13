/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f169401
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String CEP;
    private int ID;
    
    private List<Animal> animais;

    public Cliente(String nome, String endereco, String telefone, String email, String CEP, int ID) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.CEP = CEP;
        this.ID = ID;
        this.animais = new ArrayList<Animal>();
  
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getID() {
        return ID;
    }

    public void AddAnimal(Animal animal) {
        if(!animal.getNome().isBlank()) {
            animais.add(animal);
        }
    }
    
    public List<Animal> getAnimais() {
        return animais;
    }
    
    @Override
    public String toString() {
        String desc = "Cliente(" + "nome" + nome + ", endereço" + endereco + ", telefone" + telefone + ", email" + email + ", CEP" + CEP + ", ID" + ID + ")";
        String strAnimais = animais.toString();
        return desc + "\n" + strAnimais;
    }
}
