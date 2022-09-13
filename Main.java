/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

/**
 *
 * @author f169401
 */
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Felipe","Rua Rui Barbosa","78787878","felipe@unicamp.br","0909090",1);
   
        Animal a1 = new Animal("Bucky",2,0,1);
        Animal a2 = new Animal("Rex",3,1,2);
        
        c1.AddAnimal(a1);
        c1.AddAnimal(a2);
        
        System.out.println(c1);
            
        
    }
    
}
