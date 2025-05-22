package com.mycompany.videogames;

interface IControleMovimento {

    public abstract void chacoalhar(int forca);

    public abstract void inclinar(double angulo);

    public abstract void levantar(double velocidade);

    public abstract void girar();
}
