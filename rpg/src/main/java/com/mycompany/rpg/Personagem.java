package com.mycompany.rpg;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    public int vida, mana, exp, level, forca, velocidade, resistencia, 
               carisma, inteligencia;
    public String nome;
    public List habilidades = new ArrayList();
    public List inventario = new ArrayList();
    
    public Personagem(String nome, int vida, int mana, int exp, int level, 
            int forca, int velocidade, int resistencia, int carisma,
            int inteligencia
            ){
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.exp = exp;
        this.level = level;
        this.forca = forca;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.carisma = carisma;
        this.inteligencia = inteligencia;
    }
    
    public void exibirInfo(){
        System.out.println("NOME: " + this.nome);
        System.out.println("VIDA: " + this.vida);
        System.out.println("MANA: " + this.mana);
        System.out.println("EXPERIÊNCIA: " + this.exp);
        System.out.println("LEVEL: " + this.level);
        System.out.println("FORÇA: " + this.forca);
        System.out.println("VELOCIDADE: " + this.velocidade);
        System.out.println("RESISTÊNCIA: " + this.resistencia);
        System.out.println("CARISMA: " + this.carisma);
        System.out.println("INTELIGÊNCIA: " + this.inteligencia);
    }
}
