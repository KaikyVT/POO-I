package com.mycompany.main.classes;

import com.mycompany.main.Personagem;

public class Guerreiro extends Personagem {
    int vida = super.vida;
    public Guerreiro(String nome, String classe, String raca) {
        super.vida += this.vida;
    }
}
