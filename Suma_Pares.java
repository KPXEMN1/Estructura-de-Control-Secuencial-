package com.mycompany.suma_pares;
public class Suma_Pares {

    public static int calcular() {
        int suma = 0;

        for (int i = 97; i <= 1003; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println("La suma es: " + calcular());
    }
}
