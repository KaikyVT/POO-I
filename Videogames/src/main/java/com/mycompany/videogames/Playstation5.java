package com.mycompany.videogames;

public class Playstation5 extends Videogame implements ControleMovimento {

    public Playstation5(double preco, String componentes) {
        super(preco, componentes);
    }

    @Override
    public void chacoalhar(int forca) {
        System.out.println("O AstroBot caiu no chão");
    }

    @Override
    public void inclinar(double angulo) {
        System.out.println("O Kratos se ajeitou na canoa");
    }

    @Override
    public void levantar(double velocidade) {
        System.out.println("O Nathan Drake escalou a parede");
    }

    @Override
    public void girar() {
        System.out.println("Você girou o volante no GranTurismo");
    }

}
