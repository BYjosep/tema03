package com.byjosep04.tema03.salida_con_formato;

public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "";
        int numeros = 1;
        final int ESCALERA = 10;
        int c = 30;
        int cMaximo = 37;
        for (int i = numeros; i < ESCALERA; i++) {
            cadena = cadena + i;
            System.out.print("\u001B[" + c + "m");
            System.out.printf("%9s\n\u001B[0m", cadena);
            c++;
            if (c > cMaximo) {
                c = 30;
            }
        }
    }
}
