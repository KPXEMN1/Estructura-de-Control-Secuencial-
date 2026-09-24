package com.mycompany.incentivo_vendedores;
import java.util.Scanner;

public class Incentivo_Vendedores {

    public static void calcular(double v1, double v2, double v3, double sueldo) {
        double total = v1 + v2 + v3;

        double sueldo1 = sueldo;
        double sueldo2 = sueldo;
        double sueldo3 = sueldo;

        if (v1 > total * 0.33) {
            sueldo1 = sueldo + sueldo * 0.20;
        }

        if (v2 > total * 0.33) {
            sueldo2 = sueldo + sueldo * 0.20;
        }

        if (v3 > total * 0.33) {
            sueldo3 = sueldo + sueldo * 0.20;
        }

        System.out.println("Departamento 1: " + sueldo1);
        System.out.println("Departamento 2: " + sueldo2);
        System.out.println("Departamento 3: " + sueldo3);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ventas departamento 1: ");
        double v1 = SC.nextDouble();

        System.out.println("Ventas departamento 2: ");
        double v2 = SC.nextDouble();

        System.out.println("Ventas departamento 3: ");
        double v3 = SC.nextDouble();

        System.out.println("Sueldo mensual: ");
        double sueldo = SC.nextDouble();

        calcular(v1, v2, v3, sueldo);
    }
}