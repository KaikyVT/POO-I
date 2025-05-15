package com.mycompany.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome, cpf;
    List<Conta> contas = new ArrayList();
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void addConta(double saldo, String tipo){
        if (tipo.equals("corrente")){
            System.out.println("Conta corrente adicionada!");
            ContaCorrente c1 = new ContaCorrente(saldo);
            this.contas.add(c1);
            c1.cliente = this;
        }
        else if (tipo.equals("poupanca")){
            System.out.println("Conta poupança adicionada!");
            ContaPoupanca c2 = new ContaPoupanca(saldo);
            this.contas.add(c2);
            c2.cliente = this;
        }
        else{
            System.out.println("Tipo inválido...");
        }
    }
    
    public boolean mostrarSaldo(){
        System.out.println("Cliente: " + this.nome);
        if (contas.isEmpty()){
            System.out.println("Você não tem contas...\n\n");
            return false;
        }else{
        
        for (Conta c : contas){
                System.out.println("Conta: " + c.saldo);
        }
            System.out.println("\n\n");
        return true;
        }
    }
}
