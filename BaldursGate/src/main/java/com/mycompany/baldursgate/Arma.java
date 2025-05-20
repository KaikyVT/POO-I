package com.mycompany.baldursgate;

public class Arma extends Item{
    
    int danoadicional;
    
    public Arma(String nome, String descricao, int dano){
        super(nome, descricao);
        danoadicional = dano;
    }
}
