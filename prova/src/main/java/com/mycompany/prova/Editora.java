package com.mycompany.prova;

import java.util.ArrayList;

public class Editora {
   public String nome, email;
   public ArrayList<Livro> livros = new ArrayList<Livro>();
   public Editora(String nome, String email){
       this.nome = nome;
       this.email = email;
   }
   
   public Editora (String nome, String email, Livro livro){
       this.email = email;
       this.nome = nome;
       this.livros.add(livro);
   }
   
   public void adicionarlivro(Livro livro){
       this.livros.add(livro);
   }
   
   public void teste() {
       System.out.println("oi");
   }
   
   @Override
    public String toString(){
        return String.format("Nome: %s\nEmail: %s\nLivros: %s", nome, email, livros);
    }
}
