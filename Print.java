package br.com.dio;

public class Print {
    public static void PrintMetody(double numero1, double numero2,String metodo) {
        if(metodo == "Adição"|| metodo =="Soma"){
            System.out.println("A Adição de "+numero1+" + "+numero2+" é = "+Calculadora.Adicao(numero1,numero2));
        }else if(metodo == "Subtração"){
            System.out.println("A Subtração de "+numero1+" - "+numero2+" é = "+Calculadora.Subtracao(numero1,numero2));
        }else if(metodo == "Divisão"){
            System.out.println("A Divisão de "+numero1+" / "+numero2+" é = "+Calculadora.Divisao(numero1,numero2));
        }else if(metodo == "Multiplicação"){
            System.out.println("A Multiplicação de "+numero1+" * "+numero2+" é = "+Calculadora.Multiplicacao(numero1,numero2));
        }

    }
    public static void PrintMetody(Byte hora) {
            Mensagem.Saudacao( hora);
    }

    public static void PrintMetody(String metodo,double lado) {
        if(metodo == "Quadrado")
        System.out.println("A Area do quadrado é "+Quadrilatero.Area(lado));
    }
    public static void PrintMetody(String metodo,double baseMaior,double baseMenor,double altura) {
        if(metodo == "Trapezio");
        System.out.println("A Area do trapézio é "+Quadrilatero.Area(baseMaior,baseMenor,altura));
    }
    public static void PrintMetody( String metodo, double ladoOuDiagonalMaior,double alturaOuDiagonalMenor) {
        if(metodo == "Losango"){
            System.out.println("A área do losango é  "+Quadrilatero.AreaLosango(ladoOuDiagonalMaior, alturaOuDiagonalMenor));
        }else if(metodo == "Retangulo"){
            System.out.println("A área do retangulo é "+Quadrilatero.AreaRetangulo(ladoOuDiagonalMaior,alturaOuDiagonalMenor));
        }

    }

    }

