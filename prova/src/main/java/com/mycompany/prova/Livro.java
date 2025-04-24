package com.mycompany.prova;

import java.util.ArrayList;

public class Livro {
    public String titulo;
    public int anopub;
    public Editora editora;
    public ArrayList<Autor> listautores = new ArrayList<Autor>();
    public Livro(String titulo, int anopub, Autor autor, Editora editora){
        this.titulo = titulo;
        this.anopub = anopub;
        this.listautores.add(autor);
        this.editora = editora;
        editora.adicionarlivro(this);
    }
    
    public void adicionarautor(Autor autor){
        this.listautores.add(autor);
    }
    
    @Override
    public String toString(){
        return String.format("Título: %s\nAno Pub: %d\nAutor(es): %s\nEditora: %s\n", titulo, anopub, listautores, editora);
    }
}
