package com.mycompany.videogames;

public class Psvita extends Videogame implements Portatil {

    public String modo = "Portátil";
    public int bateria = 100;

    public Psvita(double preco, String componentes) {
        super(preco, componentes);
    }

    @Override
    public void checaBateria() {
        System.out.println("Status da bateria: " + bateria + "%");
        if (bateria <= 15) {
            System.out.println("Seria interessante colocar no cabo...");
        } else {
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
    public boolean jogarJogo(int index) {
        if (index > exclusivos.size() || index < 0) {
            System.out.println("Jogo inválido...");
            return false;
        } else if (bateria == 0) {
            System.out.println("Sem bateria");
            return false;
        } else {
            System.out.println("Jogo escolhido: " + exclusivos.get(index));
            bateria -= 10;      // Perde bateria em modo portátil ou controle.

            return true;
        }
    }
}
