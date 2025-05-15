package com.mycompany.banco;

public class Banco {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Kaiky", "16455637747");
        Cliente c2 = new Cliente("Karina", "01403570680");
        Cliente c3 = new Cliente("Teste", "123456789");     //testar erros nesse
        
        c1.addConta(1000, "corrente");
        c2.addConta(10000, "corrente");
        c2.addConta(20000, "poupanca");
        c3.addConta(1000000, "contapoup");
        
        c1.mostrarSaldo();
        c2.mostrarSaldo();
        c3.mostrarSaldo();
        
        c1.contas.get(0).saque(30.90);
        c2.contas.get(0).saque(200);
        c2.contas.get(1).saque(800000);
        
        c1.contas.get(0).deposito(1000);
        c2.contas.get(0).deposito(200);
        c2.contas.get(1).deposito(800);
        
        c1.contas.get(0).aplicarRendimento();
        c2.contas.get(0).aplicarRendimento();
    }
}
