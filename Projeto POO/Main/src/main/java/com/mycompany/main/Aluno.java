package com.mycompany.main;

import java.util.Scanner;
import java.util.Random;
import java.time.Year;

public class Aluno {
        
    String matricula;
    String nome;
    String curso;
    String turma;
    int periodo;
    double nota1B;
    double nota2B;
    double notafinal;
    private static int qtd_alunos;
    
    // Primeiro Método Construtor
    public Aluno(String nome, String cur, String tur, int per){
        Random rand = new Random();
        qtd_alunos ++;
        this.matricula = gerarMatricula();
        this.nome = nome.toUpperCase();
        this.curso = cur;
        this.turma = tur;
        this.periodo = per;
    }   
    
    // Segundo Método Construtor
    public Aluno(Scanner scan){
        qtd_alunos ++;
        this.matricula = gerarMatricula();
        System.out.printf("Novo aluno\nMatrícula gerada: %s\n", this.matricula);
        System.out.printf("Digite o nome: ");
        setName(scan.nextLine());
        System.out.printf("\nNome: %s", this.nome);
        System.out.printf("\nDigite o Curso: ");
        setCourse(scan.nextLine());
        System.out.printf("\nCurso: %s", this.curso);
        System.out.printf("\nDigite a turma: ");
        setGroup(scan.nextLine());
        System.out.printf("\nTurma: %s", this.turma);
        System.out.printf("\nDigite o período: ");
        setPeriod(scan.nextInt());
        System.out.printf("\nPeríodo: %d", this.periodo);
        System.out.printf("\nDigite a nota 1: ");
        setGrade1(scan.nextDouble());
        System.out.printf("\nNota 1º Bim: %.2f", this.nota1B);
        System.out.printf("\nDigite a nota 2: ");
        setGrade2(scan.nextDouble());
        System.out.printf("\nNota 2º Bim: %.2f", this.nota2B);
        calcularNotaFinal();
        System.out.printf("\nNota Final: %.2f", this.notafinal);
    }
    
    // Getters
    
    public String getEnrollment(){
        return matricula;
    }
    public String getName(){
        return nome;
    }
    public String getCourse(){
        return curso;
    }
    public String getGroup(){
        return turma;
    }
    public int getPeriod(){
        return periodo;
    }
    public double getGrade1(){
        return nota1B;
    }
    public double getGrade2(){
        return nota2B;
    }
    public double getFinalGrade(){
        return (nota1B + nota2B)/2;
    }
    public int getQuantity(){
        return qtd_alunos;
    }
    
    
    // Setters
    public void setName(String newname){
        this.nome = newname.toUpperCase();
    }
    public void setCourse(String newcourse){
        this.curso = newcourse;
    }
    public void setGroup(String newgroup){
        this.turma = newgroup;
    }

    public void setPeriod(int period) {
        this.periodo = period;
    }

    public void setGrade1(double grade1B) {
        this.nota1B = grade1B;
    }

    public void setGrade2(double grade2B) {
        this.nota2B = grade2B;
        calcularNotaFinal();
    }
   
    private String gerarMatricula(){
       int ano = Year.now().getValue();
       Random rand = new Random();
       int numeroAleatorio = rand.nextInt(10000);
       return ano + String.format("%04d", numeroAleatorio);
    }
    
    private void calcularNotaFinal(){
        this.notafinal = (this.nota1B + this.nota2B)/2;
    }
    
    public boolean passar(String novaTurma, int novoPeriodo){
        
        if (this.notafinal >= 7)
        {
            this.turma = novaTurma;
            this.periodo = novoPeriodo;    
            return true;
        }
        else
        {
            System.out.println("Aluno reprovado...");
            return false;
        }
        
    }
}

