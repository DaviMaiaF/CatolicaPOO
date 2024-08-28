package Visão;

import Modelo.Conta;

public class Aluno {
    
    public static void main(String[] args) {
        Conta Pedro = new Conta();
        Pedro.setTitular("Pedro");
        Pedro.setNumero(203040);
        Pedro.setSaldo(1500);
        Pedro.setLimite(50000);
        //realizar saque
        Pedro.sacar(100000);
        System.out.println("Saldo posterior: " + Pedro.getSaldo());
        
        Conta Paulo = new Conta();
        Paulo.setTitular("Paulo");
        System.out.println("Nome do titular:  " + Paulo.getTitular() + "\n");
        Paulo.setSaldo(3000);
        System.out.println("saldo anteriro: " + Paulo.getSaldo());
        Paulo.depositar(1000);
        System.out.println("Saldo posterior: " + Paulo.getSaldo());
    }
}
