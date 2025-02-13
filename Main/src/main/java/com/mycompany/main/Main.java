package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao;
        
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
        
        if (opcao == 0){
            System.out.println("Tchauzinho, até a próxima :D");
        }
        else if (opcao == 1){
            System.out.println("Vamos somar!");    
            }
        else if (opcao == 2){
            System.out.println("Vamos subtrair!");    
        }
        else if (opcao == 3){
            System.out.println("Vamos multiplicar!");         
        }
        else if (opcao == 4){
            System.out.println("Vamos dividir!");    
        }
        else{
            System.out.println("Opa, esse valor é inválido! Insira outro valor, por favor :P");    
        }
    }
}
