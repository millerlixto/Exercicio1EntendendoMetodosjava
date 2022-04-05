package br.com.dio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Classe Calculadora \n");
        //teste classe calculadora
        Calculadora.Soma(1,3);
        Calculadora.Subtracao(1,3);
        Calculadora.Multiplicacao(1,3);
        Calculadora.Divisao(1,3);

        System.out.println("\n Classe Mensagem \n");
        //teste classe Mensagem
        Mensagem.Saudacao((byte) 12);
        Mensagem.Saudacao((byte) 21);
        Mensagem.Saudacao((byte) 6);
        Mensagem.Saudacao((byte) 4);
    }
};
