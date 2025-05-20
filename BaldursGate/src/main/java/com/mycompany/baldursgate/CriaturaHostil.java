package com.mycompany.baldursgate;

public class CriaturaHostil extends Entidade implements ILutador{
    public int dano;
    public CriaturaHostil(int vida, int nivel, String nome, int dano) {
        super(vida, nivel, nome);
        this.dano = dano;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou, causando " + dano + " de dano");
    }
    
}
