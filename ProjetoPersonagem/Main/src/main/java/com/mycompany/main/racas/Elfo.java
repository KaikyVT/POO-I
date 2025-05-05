package com.mycompany.main.racas;

import com.mycompany.main.Personagem;


public class Elfo extends Personagem{
    
    public Elfo(String nome, String classe, String raca) {
        super(nome, classe, raca);
        this.vida += 2;
    }
    
}
