package com.mycompany.impares_menores_100;
public class Impares_Menores_100 {

    public static void calcular() {
        for (int i = 1; i < 100; i += 2) {
            if (i % 7 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        calcular();
    }
}
