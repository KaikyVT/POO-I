package com.mycompany.main;

import java.util.Scanner;
import java.util.Random;
import java.time.Year;

public class Aluno {
    
    // Método Construtor
    public Aluno(String nome, String cur, String tur, int per){
        Random rand = new Random();
        this.matricula = String.valueOf(Year.now().getValue()) + String.format("%04d", rand.nextInt(10000));
        this.nome = nome.toUpperCase();
        this.curso = cur;
        this.turma = tur;
        this.periodo = per;
            
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
        return nota1B + nota2B;
    }
    
    
    
    // Setters
    public void setEnrollment(String newenrollment){
        this.matricula = newenrollment;
    }
    public void setName(String newname){
        this.nome = newname.toUpperCase();
    }
    public void setCurso(String newcourse){
        this.curso= newcourse;
    }
    public void setTurma(String newgroup){
        this.turma = newgroup;
    }
    
    
    String matricula;
    String nome;
    String curso;
    String turma;
    int periodo;
    double nota1B;
    double nota2B;
    double notafinal;
    private static int qtd_alunos;
    

    }

