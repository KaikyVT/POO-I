package com.mycompany.main;
import java.util.Scanner;

public class Main {
    
        public static void somar(Scanner scan){
            float n1, n2;
            System.out.println("Você vai somar!");
            System.out.printf("Digite o primeiro valor: ");
            n1 = scan.nextFloat();
            System.out.printf("\nDigite o segundo valor: ");
            n2 = scan.nextFloat();
            System.out.printf("\nO resultado foi: %.2f\n", n1 + n2);
        }
        public static void subtrair(Scanner scan){
            float n1, n2;
            System.out.println("Você vai subtrair!");
            System.out.printf("Digite o primeiro valor: ");
            n1 = scan.nextFloat();
            System.out.printf("\nDigite o segundo valor: ");
            n2 = scan.nextFloat();
            System.out.printf("\nO resultado foi: %.2f\n", n1 - n2);
        }
        public static void multiplicar(Scanner scan){
            float n1, n2;
            System.out.println("Você vai multiplicar!");
            System.out.printf("Digite o primeiro valor: ");
            n1 = scan.nextFloat();
            System.out.printf("\nDigite o segundo valor: ");
            n2 = scan.nextFloat();
            System.out.printf("\nO resultado foi: %.2f\n", n1 * n2);
        }
        public static void dividir(Scanner scan){
            float n1, n2;
            System.out.println("Você vai dividir!");
            System.out.printf("Digite o primeiro valor: ");
            n1 = scan.nextFloat();
            System.out.printf("\nDigite o segundo valor: ");
            n2 = scan.nextFloat();
            if (n2!= 0){
            System.out.printf("\nO resultado foi: %.2f\n", n1 / n2);
            }
            else{
                System.out.println("Ops, não dá pra dividir por zero D:");
            }
    }
        public static void menu(){
        System.out.println("====================");
        System.out.println("\tMENU");
        System.out.println("1- Adição(+)");
        System.out.println("2- Subtração(-)");
        System.out.println("3- Multiplicação(x)");
        System.out.println("4- Divisão(÷)");
        System.out.println("0- Sair(:c)");
        System.out.println("====================");
        System.out.printf("\nDigite a opção desejada: ");
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 7;
        while(opcao != 0){
        menu();
        opcao = scan.nextInt();
        
        switch(opcao){
            case 0:
                System.out.println("Okay, tchauzinho...");
                break;
            case 1:
                somar(scan);
                break;
            case 2:
                subtrair(scan);
                break;
            case 3:
                multiplicar(scan);
                break;
            case 4:
                dividir(scan);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
            
        }
        scan.close();     
    }

}
