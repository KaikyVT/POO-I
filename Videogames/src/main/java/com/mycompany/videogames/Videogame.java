package com.mycompany.videogames;

import java.util.ArrayList;
import java.util.List;

public class Videogame {

    double preco;
    String Componentes;
    List<String> exclusivos = new ArrayList();

    public Videogame(double preco, String componentes) {
        this.preco = preco;
        this.Componentes = componentes;
    }

    public void addExclusivo(String e) {
        exclusivos.add(e);
    }

    public void printarExclusivos() {
        System.out.println("\nEXCLUSIVOS");
        for (int i = 0; i < exclusivos.size(); i++) {
            String s = exclusivos.get(i);
            System.out.println("[" + i + "]" + s);
        }
    }

    public boolean jogarJogo(int index) {
        if (index > exclusivos.size() || index < 0) {
            System.out.println("Jogo inválido...");
            return false;
        } else {
            System.out.println("Jogo escolhido: " + exclusivos.get(index));
            return true;
        }
    }

}
