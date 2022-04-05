package br.com.dio;

public class Calculadora {

    public static void Soma(double numero1, double numero2) {
           double result = numero1+numero2;
        System.out.println("A soma de "+numero1+" + "+numero2+" é = "+result);
    }
    public static void Subtracao(double numero1, double numero2) {
        double result =  numero1-numero2;
        System.out.println("A subtração de "+numero1+" - "+numero2+" é = "+result);
    }
    public static void Multiplicacao(double numero1, double numero2) {
        double result =  numero1*numero2;
        System.out.println("A multiplicação de "+numero1+" x "+numero2+" é = "+result);
    }
    public static void Divisao(double numero1, double numero2) {
        double result =  numero1/numero2;
        System.out.println("A divisão de "+numero1+" / "+numero2+" é = "+result);
    }

};


