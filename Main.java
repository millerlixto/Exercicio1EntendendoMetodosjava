package br.com.dio;

public class Main {
    public static void main(String[] args) {


        //teste para a Classe calculadora
        System.out.println("Classe Caculadora\n");
        Print.PrintMetody(12,3,"soma");
        Print.PrintMetody(12,3,"Subtração");
        Print.PrintMetody(12,3,"Multiplicação");
        Print.PrintMetody(12,3,"Divisão");

        //Teste para a Classe Mensagem
        System.out.println("\n Classe Mensagem\n");
        Print.PrintMetody((byte)12);
        Print.PrintMetody((byte)21);
        Print.PrintMetody((byte)1);
        Print.PrintMetody((byte)6);

        //Teste para a Classe Quadrilátero
        System.out.println("\n Classe Quadrilátero\n");
        Print.PrintMetody("Quadrado",12);
        Print.PrintMetody("Trapezio",23,12,17);
        Print.PrintMetody("Losango",12,3);
        Print.PrintMetody("Retangulo",23, 4);

    }
}
