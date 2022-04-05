package br.com.dio;

public class Calculadora {

    public static double Adicao(double numero1, double numero2) {
           double result = numero1+numero2;
    //  System.out.println("A soma de "+numero1+" + "+numero2+" é = "+result);
        return result;
    }
    public static double Subtracao(double numero1, double numero2) {
        double result =  numero1-numero2;
    //    System.out.println("A subtração de "+numero1+" - "+numero2+" é = "+result);
        return result;
    }
    public static double Multiplicacao(double numero1, double numero2) {
        double result =  numero1*numero2;
    //    System.out.println("A multiplicação de "+numero1+" x "+numero2+" é = "+result);
        return result;
    }
    public static double Divisao(double numero1, double numero2) {
        double result =  numero1/numero2;
    //   System.out.println("A divisão de "+numero1+" / "+numero2+" é = "+result);
        return result;
    }

};


