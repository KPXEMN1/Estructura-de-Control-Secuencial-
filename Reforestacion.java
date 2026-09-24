package com.mycompany.reforestacion;
import java.util.Scanner;

public class Reforestacion {

    public static void calcular(double hectareas) {
        double metros = hectareas * 10000;
        double pino;
        double oyamel;
        double cedro;

        if (metros > 1000000) {
            pino = metros * 0.70;
            oyamel = metros * 0.20;
            cedro = metros * 0.10;
        } else {
            pino = metros * 0.50;
            oyamel = metros * 0.30;
            cedro = metros * 0.20;
        }

        System.out.println("Pinos: " + (pino * 8 / 10));
        System.out.println("Oyameles: " + (oyamel * 15 / 15));
        System.out.println("Cedros: " + (cedro * 10 / 18));
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hectáreas: ");
        double hectareas = SC.nextDouble();

        calcular(hectareas);
    }
}
