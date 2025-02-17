package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao = 7;
        while(opcao != 0){
        System.out.println("====================");
        System.out.println("\tMENU");
        System.out.println("1- Adição(+)");
        System.out.println("2- Subtração(-)");
        System.out.println("3- Multiplicação(x)");
        System.out.println("4- Divisão(÷)");
        System.out.println("0- Sair(:c)");
        System.out.println("====================");
        System.out.printf("\nDigite a opção desejada: ");
        opcao = scan.nextInt();
        
        System.out.printf("O número selecionado é: %d\n\n", opcao);
        
        switch(opcao){
            case 0:
                System.out.println("Okay, tchauzinho...");
                break;
            case 1:
                System.out.println("Você vai somar!");
                break;
            case 2: 
                System.out.println("Você vai subtrair!");
                break;
            case 3:
                System.out.println("Você vai multiplicar!");
                break;
            case 4:
                System.out.println("Você vai dividir!");
                break;
            default:
                System.out.println("Valor inválido");
                break;
                
        }
            
        }
        scan.close();     
    }

}
