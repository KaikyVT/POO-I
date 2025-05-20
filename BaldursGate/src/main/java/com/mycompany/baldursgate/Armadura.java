package com.mycompany.baldursgate;

public class Armadura extends Item{
    
    public int defesa;
    
    public Armadura(String nome, String descricao, int defesa) {
        super(nome, descricao);
        this.defesa = defesa;
    }
    
}
