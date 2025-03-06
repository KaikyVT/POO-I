package com.mycompany.classesteste;
import java.util.Scanner;

public class Conta {
    int numero;
    Cliente dono = new Cliente();
    double saldo;
    double limite;

    Cliente titular;
    
    boolean Sacar(Scanner scan){
        System.out.printf("Quanto quer sacar? ");
        double sac = scan.nextDouble();
        if (saldo >= sac && sac >= 0){
        saldo -= sac;
        System.out.println("\nSeu saldo agora é de: "+saldo);
        return true;
        }
        else if (sac < 0){
            System.out.println("Como você quer sacar um número negativo, amigo??");
            return false;
        }
        else{
            System.out.println("\nSeu saldo é insuficiente para efetuar o saque");
            return false;
        }
        
    }
    
    boolean Depositar(Scanner scan){
        System.out.printf("Quanto quer depositar? ");
        double dep = scan.nextDouble();
        if (dep >= 0){
        saldo += dep;
        System.out.println("\nSeu saldo agora é de: "+saldo);
        return true;
        }
        else{
            System.out.println("Você não pode depositar um saldo negativo...");
            return false;
        }

    }
}

