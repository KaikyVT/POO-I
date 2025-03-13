package com.mycompany.main;

import java.util.Scanner;

public class Main {

    static void printInfo(Aluno aluno){
        System.out.println("=====Dados do aluno=====");
        System.out.printf("Matrícula: %s\n", aluno.matricula);
        System.out.printf("Nome: %s\n", aluno.nome);
        System.out.printf("Curso: %s\n", aluno.curso);
        System.out.printf("Turma: %s\n", aluno.turma);
        System.out.printf("Período: %d\n", aluno.periodo);
        System.out.println("========================");
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno1 = new Aluno("Kaiky", "Ciências da Computação", "CC3MB", 3);
        aluno1.getEnrollment();
        aluno1.getName();
        aluno1.getCourse();
        aluno1.getGroup();
        aluno1.getGrade1();
        aluno1.getGrade2();
        aluno1.getFinalGrade();
        printInfo(aluno1);
        
        
    }
}
