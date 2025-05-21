package com.mycompany.videogames;

public class NintendoSwitch extends Videogame implements ControleMovimento, Portatil {

    public String modo = "Portátil";
    public int bateria = 100;

    public NintendoSwitch(double preco, String componentes) {
        super(preco, componentes);
    }

    @Override
    public void chacoalhar(int forca) {
        System.out.println("O Kirby engoliu o inimigo");
    }

    @Override
    public void inclinar(double angulo) {
        System.out.println("A pokebola foi arremessada");
    }

    @Override
    public void levantar(double velocidade) {
        System.out.println("O Mario cresceu");
    }

    @Override
    public void girar() {
        System.out.println("O Link rolou no chão");
    }

    @Override
    public void checaBateria() {
        System.out.println("Status da bateria: " + bateria + "%");
        if (bateria == 0) {
            System.out.println("Sem bateria.");
        }else if (bateria <= 15){
            System.out.println("Bateria fraca. Coloque no Dock Mode");
        }else {
            System.out.println("Bateria em dia, aproveite!");
        }
    }

    @Override
    public void trocaModo() {
        if (modo.equals("Portátil")) {
            System.out.println("Modo alterado para Dock Mode!");
            modo = "Dock Mode";
        } else {
            System.out.println("Modo alterado para Portátil!");
            modo = "Portátil";
        }
    }

    @Override
    public boolean jogarJogo(int index, int tempo) {
        if (index > exclusivos.size() || index < 0) {
            System.out.println("Jogo inválido...");
            return false;
        } else if (bateria == 0) {
            System.out.println("Sem bateria");
            return false;
        } else {
            System.out.println("Jogo escolhido: " + exclusivos.get(index));
            if (modo.equals("Portátil")) {
                bateria -= (5 * tempo);
            }
            return true;
        }
    }

    public void carregar() {
        System.out.println("Bateria carregada!");

    }

}
