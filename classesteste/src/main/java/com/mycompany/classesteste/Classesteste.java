package com.mycompany.classesteste;

import java.util.Scanner;

public class Classesteste {
    
    public static void main(String[] args) {
        Conta conta1 = new Conta(); 
        Conta conta2 = new Conta();
        Scanner scan = new Scanner(System.in);
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.nome = "Kaiky";
        cliente2.nome = "Cassio";
        cliente1.sobrenome = "Viglioni";
        cliente2.sobrenome = "Peçanha";
        cliente1.cpf = "164.556.377-47";
        cliente2.cpf = "143.675.775-97";
        
        conta1.numero = 01;
        conta2.numero = 02;
        conta1.dono = cliente1;
        conta2.dono = cliente2;
        conta1.saldo = 1500.50;
        conta2.saldo = 10000;
        conta1.limite = 500;
        conta2.limite = 5000;
        
        System.out.printf("A conta %d do usuário %s possui %.2f de saldo!\n", conta1.numero, conta1.dono.nome, conta1.saldo);
        System.out.printf("A conta %d do usuário %s possui %.2f de saldo!\n\n", conta2.numero, conta2.dono.nome, conta2.saldo);
        
        conta1.Sacar(scan);
        conta2.Sacar(scan);
        conta1.Depositar(scan);
        conta2.Depositar(scan);

        System.out.printf("A conta %d do usuário %s possui %.2f de saldo!\n", conta1.numero, conta1.dono.nome, conta1.saldo);
        System.out.printf("A conta %d do usuário %s possui %.2f de saldo!\n\n", conta2.numero, conta2.dono.nome, conta2.saldo);
        
        scan.close();
    }
}
                                                                                
