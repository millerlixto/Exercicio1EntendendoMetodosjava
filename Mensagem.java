package br.com.dio;

import com.sun.jdi.ByteType;

import java.util.BitSet;

public class Mensagem {
    public static void Saudacao(Byte hora) {
        if (hora < 12 && hora > 4) {//5-6-7-8-9-10-11
            System.out.println(hora+"h é Bom-dia!");
        } else if (hora < 18 && hora > 11) {//12-13-14-15-16-17
            System.out.println(hora+"h é Boa-Tarde!");
        } else if (hora < 24 && hora > 17) {//18-19-20-21-22-23
           System.out.println(hora+"h é Boa-Noite!");
        } else if (hora == 24 || hora > 0 && hora < 5) {//0-24-1-2-3-4
            System.out.println(hora+"h é Boa-Madrugada!");
        } else {
            System.out.println("Entrada Invalida!");
        }
    }
};


