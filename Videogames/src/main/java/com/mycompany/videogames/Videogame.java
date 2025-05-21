package com.mycompany.videogames;

import java.util.ArrayList;
import java.util.List;

public class Videogame {

    double preco;
    String componentes;
    List<String> exclusivos = new ArrayList();

    public Videogame(double preco, String componentes) {
        this.preco = preco;
        this.componentes = componentes;
    }

    public void addExclusivo(String e) {
        exclusivos.add(e);
    }
    
    public void detalhes(){
        System.out.println("Console: " + this.getClass().getSimpleName());
        System.out.println("Preço: R$" + preco);
        System.out.println("Componentes: " + componentes);
        printarExclusivos();
    }
    
    public void printarExclusivos() {
        System.out.println("EXCLUSIVOS");
        for (int i = 0; i < exclusivos.size(); i++) {
            String s = exclusivos.get(i);
            System.out.println("[" + i + "]" + s);
        }
        System.out.println("\n");
    }

    public boolean jogarJogo(int index, int tempo) {
        if (index > exclusivos.size() || index < 0) {
            System.out.println("Jogo inválido...");
            return false;
        } else {
            System.out.println("Jogo escolhido: " + exclusivos.get(index));
            return true;
        }
    }

}
