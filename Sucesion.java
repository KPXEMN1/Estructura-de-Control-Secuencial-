package com.mycompany.sucesion;
public class Sucesion {

    public static void calcular() {
        int termino = 6;
        int suma = 0;

        for (int i = 1; i <= 12; i++) {
            suma = suma + termino;

            if (i == 12) {
                System.out.println("Término 12: " + termino);
            }

            termino = termino + 5;
        }

        System.out.println("Suma: " + suma);
    }

    public static void main(String[] args) {
        calcular();
    }
}