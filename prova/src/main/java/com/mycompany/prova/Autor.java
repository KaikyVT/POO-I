package com.mycompany.prova;

import java.util.ArrayList;

public class Autor {
    public String nome;
    public String abreviatura;
    public ArrayList<Livro> listalivros = new ArrayList<Livro>();
    public ArrayList<Contato> listacontatos = new ArrayList<Contato>();
    
    public Autor (String nome, String abv){
        this.nome = nome;
        this.abreviatura = abv;
    }
    
    public Autor (String nome, String abv, Livro livro, String tipo, String ctt){
        this.nome = nome;
        this.abreviatura = abv;
        this.listalivros.add(livro);
        Contato contato = new Contato(tipo, ctt);
        this.listacontatos.add(contato);
    }
    
    public void adicionarcontato(String tipo, String ctt){
        Contato contato = new Contato(tipo, ctt);
        this.listacontatos.add(contato);
    }
    
}
