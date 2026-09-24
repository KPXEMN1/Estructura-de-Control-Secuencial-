package com.mycompany.planificacion_financiera;
import java.util.Scanner;

public class Planificacion_Financiera {

    public static void calcular(double capital) {
        double prestamo = 0;
        double saldo;

        if (capital < 0) {
            prestamo = 10000 - capital;
            saldo = 10000;
        } else if (capital <= 20000) {
            prestamo = 20000 - capital;
            saldo = 20000;
        } else {
            saldo = capital;
        }

        double resto = saldo - 5000 - 2000;
        double insumos = resto / 2;
        double incentivos = resto / 2;

        System.out.println("Préstamo: " + prestamo);
        System.out.println("Insumos: " + insumos);
        System.out.println("Incentivos: " + incentivos);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el capital actual: ");
        double capital = SC.nextDouble();

        calcular(capital);
    }
}