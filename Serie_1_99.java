package com.mycompany.serie_1_99;
public class Serie_1_99 {

    public static void calcular() {
        double suma = 0;
        double termino = 1;
        int cantidad = 0;

        while (suma + termino <= 1.99) {
            suma = suma + termino;
            cantidad++;
            termino = termino / 2;
        }

        System.out.println("Número de términos: " + cantidad);
        System.out.println("Suma: " + suma);
    }

    public static void main(String[] args) {
        calcular();
    }
}
