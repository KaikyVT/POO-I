package com.mycompany.main;

import com.mycompany.main.classes.Guerreiro;
import com.mycompany.main.racas.Elfo;

public class Personagem {
    public int vida;
    public int magia;
    public int forca;
    public int velocidade;
    private int exp;
    private int lvl;
    public String nome;
    private String defcl;
    private String defr;
    public Classe classe;  // Usando Object para permitir tipos dinâmicos
    public Raca raca;    // Usando Object para permitir tipos dinâmicos
    
    public Personagem(String nome, String classe, String raca) {
        this.vida = 0;
        this.magia = 0;
        this.forca = 0;
        this.velocidade = 0;
        this.exp = 0;
        this.lvl = 1; 
        this.nome = nome;
        this.defcl = classe;
        this.defr = raca;
    
    }
    
    public Personagem(int vida, int magia, int forca, int velocidade, String nome, String classe, String raca) { 
        this.vida = vida;
        this.magia = magia;
        this.forca = forca;
        this.velocidade = velocidade;   
        this.nome = nome;
        this.defcl = classe;
        this.defr = raca;
        this.lvl = 1;
        this.exp = 0;
        
        

    }
    
    public Personagem() { 
        this.vida = 0;
        this.magia = 0;
        this.forca = 0;
        this.velocidade = 0;
        this.exp = 0;
        this.lvl = 1; 
        this.nome = "";
        this.defcl = "";
        this.defr = "";
        this.classe = null;
        this.raca = null;
    }
    
    public void atacar() {
        System.out.println("Você utilizou um ataque!");
        this.ganhaExp();
    }
    
    private void ganhaExp() {
        this.exp += 20;
        System.out.println("Você ganhou 20 de Exp!!");
    }
    
    private void lvlUp() {
        if (this.exp >= 100) {
            this.lvl += 1;
            this.exp = 0;
        }
        
    }
}

