package com.mycompany.rpg;

import java.util.Scanner;

public class Rpg {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Personagem personagem = criacaoPersonagem(s);
        personagem.exibirInfo();
    }
    
    
    
    public static Personagem criacaoPersonagem(Scanner s){
        int vida = 0, mana = 0, exp = 0, level = 1, forca = 0, velocidade = 0, resistencia = 0, 
            carisma = 0, inteligencia = 0;
        String nome = "";
        System.out.println("Bem vindo ao RPG legal! Vamos criar seu personagem?");
        while (true){
            System.out.println("Escolha Sua classe!");
            System.out.println("1- Guerreiro\n2- Mago\n3- Ladino\n4- Bardo");
            int resp = s.nextInt();
            int pontosdiv = 5;
            
            if (resp < 1 || resp > 4){
                System.out.println("\nOps, você digitou algo inválido... Tente novamente\n\n");
                continue;
            }
            System.out.println("Certo, você tem 5 pontos para distribuir entre:");
            System.out.println("Força, Resistência, Velocidade, Carisma e Inteligência");
            System.out.println("Escolha com sabedoria!");
            
            while (true){
                
                while (true){       //Força
                    int resph;
                    System.out.println("Pontos: " + pontosdiv);
                    System.out.println("Quantos pontos você quer colocar em força?");
                    resph = s.nextInt();
                    if (resph > pontosdiv){
                        System.out.println("Ops, você não tem pontos...");
                        continue;
                    }else{
                        System.out.println("Ok! Você agora tem " + resph + " de força!");
                        forca += resph;
                        pontosdiv -= resph;
                        break;
                    }
                }
                
                while (true){       //Resistencia
                    int resph;
                    System.out.println("Pontos: " + pontosdiv);
                    System.out.println("Quantos pontos você quer colocar em resistencia?");
                    resph = s.nextInt();
                    if (resph > pontosdiv){
                        System.out.println("Ops, você não tem pontos...");
                        continue;
                    }else{
                        System.out.println("Ok! Você agora tem " + resph + " de resistencia!");
                        resistencia += resph;
                        pontosdiv -= resph;
                        break;
                    }
                }
                
                while (true){       //Velocidade
                    int resph;
                    System.out.println("Pontos: " + pontosdiv);
                    System.out.println("Quantos pontos você quer colocar em velocidade?");
                    resph = s.nextInt();
                    if (resph > pontosdiv){
                        System.out.println("Ops, você não tem pontos...");
                        continue;
                    }else{
                        System.out.println("Ok! Você agora tem " + resph + " de velocidade!");
                        velocidade += resph;
                        pontosdiv -= resph;
                        break;
                    }
                }
                
                while (true){       //Carisma
                    int resph;
                    System.out.println("Pontos: " + pontosdiv);
                    System.out.println("Quantos pontos você quer colocar em carisma?");
                    resph = s.nextInt();
                    if (resph > pontosdiv){
                        System.out.println("Ops, você não tem pontos...");
                        continue;
                    }else{
                        System.out.println("Ok! Você agora tem " + resph + " de carisma!");
                        carisma += resph;
                        pontosdiv -= resph;
                        break;
                    }
                }
                
                while (true){       //Inteligência
                    int resph;
                    System.out.println("Pontos: " + pontosdiv);
                    System.out.println("Quantos pontos você quer colocar em inteligência?");
                    resph = s.nextInt();
                    if (resph > pontosdiv){
                        System.out.println("Ops, você não tem pontos...");
                        continue;
                    }else{
                        System.out.println("Ok! Você agora tem " + resph + " de inteligência!");
                        inteligencia += resph;
                        pontosdiv -= resph;
                        break;
                    }
                }
                
                System.out.println("Habilidades do personagem:\n");
                System.out.println("Força: " + forca);
                System.out.println("Resistência: " + resistencia);
                System.out.println("Velocidade: " + velocidade);
                System.out.println("Carisma: " + carisma);
                System.out.println("Inteligência: " + inteligencia + "\n");
                System.out.println("Você deseja confirmar sua distribuição de pontos?(1 - Sim/2 - Não");
                int respc = s.nextInt();
                
                if (respc == 1){
                    System.out.println("Finalizando... Qual o seu nome?");
                    s.nextLine();
                    nome = s.nextLine();
                    mana += inteligencia * 4 + 2;
                    vida += resistencia + 8;
                    break;
                }else{
                    System.out.println("Ok, vamos novamente!");
                    continue;
                }
            }
            
            switch(resp){
                case 1:
                    Guerreiro playerg = new Guerreiro(nome, vida, mana, exp, level, forca, velocidade, resistencia, carisma, inteligencia);
                    return playerg;
                case 2:
                    Mago playerm = new Mago(nome, vida, mana, exp, level, forca, velocidade, resistencia, carisma, inteligencia);
                    return playerm;
                case 3:
                    Ladino playerl = new Ladino(nome, vida, mana, exp, level, forca, velocidade, resistencia, carisma, inteligencia);
                    return playerl;
                case 4:
                    Bardo playerb = new Bardo(nome, vida, mana, exp, level, forca, velocidade, resistencia, carisma, inteligencia);
                    return playerb;
            }
        }
    }
}
