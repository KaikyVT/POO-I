package com.mycompany.banco;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(double saldo){
        super(saldo);
    }
    
    public void aplicarRendimento(){
        System.out.println("Sua conta rendeu mais um mês!");
        this.saldo *= 1.012;
        System.out.println("Rendeu 1.2%! Seu saldo agora é de R$" + this.saldo);
    }
    
    public boolean saque(double valor){
        if (valor > saldo){
            System.out.println("Erro, falta money, meu anjo!");
            return false;
        }
        System.out.println("Você quer sacar R$" + valor);
        System.out.println("Cobramos uma taxa de R$5 por saque");
        this.saldo -= valor + 5;
        System.out.println("Seu saldo agora é de R$" + this.saldo);
        return true;
    }
}
