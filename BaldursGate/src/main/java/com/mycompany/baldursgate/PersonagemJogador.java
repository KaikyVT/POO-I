package com.mycompany.baldursgate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonagemJogador extends Entidade implements ILutador {

    List<Item> inventario = new ArrayList();
    Arma armaequip;
    Armadura armaduraequip;

    public PersonagemJogador(int vida, int nivel, String nome) {
        super(vida, nivel, nome);
        Arma a = new Arma("Punhos", "Suas mãos nuas", 1);
        Armadura a2 = new Armadura("Roupas comuns", "Só roupas comuns", 1);
        inventario.add(a);
        inventario.add(a2);
        this.armaduraequip = a2;
        this.armaequip = a;
        this.vida += a2.defesa;
    }

    public void addArma(String nome, String descricao, int dano) {
        Arma a = new Arma(nome, descricao, dano);
        inventario.add(a);
        this.armaequip = a;
    }

    public void addArmadura(String nome, String descricao, int defesa) {
        Armadura a = new Armadura(nome, descricao, defesa);
        inventario.add(a);
    }

    public void equipArma() {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < inventario.size(); i++) {
            Item item = inventario.get(i);
            if (item instanceof Arma) {
                System.out.println("[" + i + "]" + ((Arma) item).nome);
                System.out.println("Descrição: " + ((Arma) item).descricao + "\n");
            }

        }

        System.out.println("Digite o número da arma que deseja equipar:\n");
        int novaArma = s.nextInt();

        if (novaArma >= 0 && novaArma < inventario.size()) {
            Item itemSelect = inventario.get(novaArma);
            if (itemSelect instanceof Arma) {
                this.armaequip = (Arma) itemSelect;
                System.out.println(((Arma) itemSelect).nome + " equipado.");
            } else {
                System.out.println("O item selecionado não é uma arma...");
            }
        } else {
            System.out.println("Índice inválido...");
        }

    }

    public void equipArmadura() {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < inventario.size(); i++) {
            Item item = inventario.get(i);
            if (item instanceof Armadura) {
                System.out.println("[" + i + "]" + ((Armadura) item).nome);
                System.out.println("Descrição: " + ((Armadura) item).descricao + "\n");
            }
        }
        System.out.println("Digite o número da armadura que deseja equipar:\n");
        int novaArmadura = s.nextInt();

        if (novaArmadura >= 0 && novaArmadura < inventario.size()) {
            Item itemSelect = inventario.get(novaArmadura);
            if (itemSelect instanceof Armadura) {
                this.vida -= this.armaduraequip.defesa;
                this.armaduraequip = (Armadura) itemSelect;
                System.out.println(((Armadura) itemSelect).nome + " equipado.");
                this.vida += this.armaduraequip.defesa;
                
            } else {
                System.out.println("O item selecionado não é uma armadura...");
            }
        } else {
            System.out.println("Índice inválido...");
        }

    }

    @Override
    public void atacar() {
        System.out.println("O jogador atacou com " + this.armaequip.nome + " , causando " + armaequip.danoadicional + " de dano");
    }

}
