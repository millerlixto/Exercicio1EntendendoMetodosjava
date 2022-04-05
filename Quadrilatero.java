package br.com.dio;

public class Quadrilatero {

    public static double Area(double lado){//Quadrado
        double result = Calculadora.Multiplicacao(lado, lado);
        return result;
    }
    public static double Area(double baseMaior,double baseMenor,double altura) {//Trapézio
        double result = Calculadora.Adicao(baseMaior, baseMenor);
        result = Calculadora.Multiplicacao(result, altura);
        result = Calculadora.Divisao(result, 2);
        return result;
    }
    public static double AreaRetangulo(double lado, double altura) {//retangulo e losango

          double result = Calculadora.Multiplicacao(lado,altura);
          return result;
     }
     public static double AreaLosango(double diagonalMaior,double diagonalMenor){
        double  result = Calculadora.Multiplicacao(diagonalMaior,diagonalMenor);
          result = Calculadora.Divisao(result, 2);
         return result;
     }

     };



