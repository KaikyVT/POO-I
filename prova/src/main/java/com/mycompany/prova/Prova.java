package com.mycompany.prova;

public class Prova {

    public static void main(String[] args) {
        Autor a1 = new Autor("Kaiky", "VTM");
        Autor a2 = new Autor("João", "JP");
        
        Editora e1 = new Editora("Editora Camaleão", "camaleao@editora.com");
        Editora e2 = new Editora("Editora Hoje", "hoje@editora.com");
        
        Livro l1 = new Livro("Minecraft", 2025, a1, e1);
        Livro l2 = new Livro("Roblox", 2022, a2, e2);
        Livro l3 = new Livro("Terraria", 2020, a1, e1);
        
        a1.adicionarcontato("Whatsapp", "999999999");
        a2.adicionarcontato("Instagram", "40028922");
        
        l1.adicionarautor(a2);
        
        System.out.println(e1);
        
    }
}
