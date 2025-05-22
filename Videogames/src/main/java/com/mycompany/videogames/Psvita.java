package com.mycompany.videogames;

public class Psvita extends Videogame implements IPortatil {

    public String modo = "Portátil";
    public int bateria = 100;

    public Psvita(double preco, String componentes) {
        super(preco, componentes);
    }

    @Override
    public void checaBateria() {
        System.out.println("Status da bateria: " + bateria + "%");
        if (bateria == 0) {
            System.out.println("Sem bateria.");
        }else if (bateria <= 15){
            System.out.println("Bateria fraca.");
        }else {
            System.out.println("Bateria em dia, aproveite!");
        }
    }

    @Override
    public void trocaModo() {
        if (modo.equals("Portátil")) {
            System.out.println("Modo alterado para Controle!");
            modo = "Controle";
        } else {
            System.out.println("Modo alterado para Portátil!");
            modo = "Portátil";
        }
    }

    @Override
    public boolean jogarJogo(int index, int tempo) {
        if (modo.equals("Controle")) {
            System.out.println("Você está no modo controle, altere o modo para jogar.");
            return false;
        }
        if (index > exclusivos.size() || index < 0) {
            System.out.println("Jogo inválido...");
            return false;
        } else if (bateria == 0) {
            System.out.println("Sem bateria");
            return false;
        } else {
            System.out.println("Jogo escolhido: " + exclusivos.get(index));
            bateria -= (5 * tempo);      // Perde bateria em modo portátil ou controle.

            return true;
        }
    }
    
    public void carregar() {
        System.out.println("Bateria carregada!");
        bateria = 100;
    }
}
