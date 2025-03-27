package com.mycompany.main;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    private Map<String, String> contatos;
    
    public AgendaTelefonica(){
        contatos = new HashMap<>();
    }
    
    public AgendaTelefonica(String nome, String numero){
        contatos = new HashMap<>();
        contatos.put(nome, numero);
    }
    
    public void inserir(String nome, String numero){
        contatos.put(nome, numero);
    }
    
    public String buscarNumero(String nome){
        return "";
    }
    
    public void remover(String nome){
        contatos.remove(nome);
    }
    
}
