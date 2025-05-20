package com.mycompany.baldursgate;

/*
  Esse projeto foi feito por Kaiky Viglioni Tavares Moura
  da turma CC3MB.
  Usei de grande inspiração para o projeto o jogo 
  Baldur's Gate, em especial o terceiro. O jogo é um RPG
  medieval seguindo os moldes de Dungeons & Dragons.
  Espero que goste!

  Enunciado: Crie um programa baseado no jogo Baldur's Gate, um RPG.
  Você deve criar uma classe Entidade, com nome, vida e nível.
  Crie três classes filhas de Entidade: PersonagemJogador, CriaturaHostil e CriaturaPacifica.
  Crie uma interface Lutador para as Entidades que atacam, com um método atacar.
  O Personagem deve possuir um inventário, com itens, podendo equipar uma arma e uma armadura.
  Item é uma classe com nome e descrição, que tem subclasses Arma e Armadura.
  Armas possuem um dano extra e Armaduras concedem uma vida adicional.
  A Entidade deve possuir método falar
  O método atacar do jogador deve causar o dano base somado ao dano da arma equipada.

  O programa deve demonstrar o uso de herança, interface e relações entre objetos 
  de forma clara e funcional.
*/

public class Main {

    public static void main(String[] args) {
        PersonagemJogador p = new PersonagemJogador(20, 1, "Kaiky");
        p.addArma("Arma foda 1", "Certamente uma arma", 8);
        p.addArma("Arma foda 2", "Certamente uma arma também", 9);
        p.addArmadura("Armadura manera", "Teste auabhdbgubue", 4);
        p.addArma("Arma mais foda", "aaaaaaaaaa", 99);
        p.addArmadura("Armadura do bem", "muito do bem", 9);
        CriaturaHostil goblin = new CriaturaHostil(10, 1, "Surrúpio", 3);
        CriaturaPacifica ovelha = new CriaturaPacifica(5, 99, "Sheepard");
        
        
    }
}
