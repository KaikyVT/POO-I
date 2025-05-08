package com.mycompany.rpg;

public class Mago extends Personagem{
    
    public Mago(String nome, int vida, int mana, int exp, int level, int forca, int velocidade, int resistencia, int carisma, int inteligencia) {
        super(nome, vida, mana, exp, level, forca, velocidade, resistencia, carisma, inteligencia);
        this.mana += 2;
        if (this.forca > 1){
            this.forca -= 1;
        }
        if (this.inteligencia < 5){
            this.inteligencia++;
        }
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("NOME: " + this.nome);
        System.out.println("VIDA: " + this.vida);
        System.out.println("MANA (+2): " + this.mana);
        System.out.println("EXPERIÊNCIA: " + this.exp);
        System.out.println("LEVEL: " + this.level);
        System.out.println("FORÇA (-1): " + this.forca);
        System.out.println("VELOCIDADE: " + this.velocidade);
        System.out.println("RESISTÊNCIA: " + this.resistencia);
        System.out.println("CARISMA: " + this.carisma);
        System.out.println("INTELIGÊNCIA (+1): " + this.inteligencia);
    }
    
}
