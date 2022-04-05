package br.com.dio;

public class Mensagem {
    public static void Saudacao(byte hora) {
        if (hora < 12 && hora > 4) {
            System.out.println("Bom-dia!");
        } else if (hora < 18 && hora > 11) {
            System.out.println("Boa-Tarde!");
        } else if (hora < 24 && hora > 17) {
            System.out.println("Boa-Noite!");
        } else if (hora == 24 || hora > 0 && hora < 5) {
            System.out.println("Boa-Madrugada!");
        } else {
            System.out.println("Entrada Invalida!");
        }
    }
};


