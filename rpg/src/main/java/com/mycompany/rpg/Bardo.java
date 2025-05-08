package com.mycompany.rpg;

public class Bardo extends Personagem{
    
    public Bardo(String nome, int vida, int mana, int exp, int level, int forca, int velocidade, int resistencia, int carisma, int inteligencia) {
        super(nome, vida, mana, exp, level, forca, velocidade, resistencia, carisma, inteligencia);
        if (this.carisma < 5){
            this.carisma ++;
        }
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("NOME: " + this.nome);
        System.out.println("VIDA: " + this.vida);
        System.out.println("MANA: " + this.mana);
        System.out.println("EXPERIÊNCIA: " + this.exp);
        System.out.println("LEVEL: " + this.level);
        System.out.println("FORÇA: " + this.forca);
        System.out.println("VELOCIDADE: " + this.velocidade);
        System.out.println("RESISTÊNCIA: " + this.resistencia);
        System.out.println("CARISMA (+1): " + this.carisma);
        System.out.println("INTELIGÊNCIA: " + this.inteligencia);
    }
}
