package com.mycompany.baldursgate;

public class Entidade {
    public int vida, nivel;
    public String nome;
    
    public Entidade(int vida, int nivel, String nome){
        this.nivel = nivel;
        this.vida = vida + this.nivel;
        this.nome = nome;
    }
    
    public void falar(String fala){
        System.out.println(this.nome + ": " + fala);
    }
}
