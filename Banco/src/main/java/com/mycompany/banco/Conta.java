package com.mycompany.banco;

public abstract class Conta {
    double saldo;
    Cliente cliente;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public void deposito(double valor){
        System.out.println("Você depositou R$" + valor);
        this.saldo += valor;
        System.out.println("Seu saldo atual é de R$" + this.saldo);
    }
    
    public abstract boolean saque(double valor);
    public abstract void aplicarRendimento();
}
