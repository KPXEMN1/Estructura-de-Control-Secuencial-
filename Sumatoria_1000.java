package com.mycompany.sumatoria_1000;
public class Sumatoria_1000 {

    public static void calcular() {
        double suma = 0;
        int k = 1;

        while (true) {
            double termino = (Math.pow(k, 2) + 1) / k;

            if (suma + termino > 1000) {
                break;
            }

            suma = suma + termino;
            k++;
        }

        System.out.println("Número de términos: " + (k - 1));
        System.out.println("Suma: " + suma);
    }

    public static void main(String[] args) {
        calcular();
    }
}