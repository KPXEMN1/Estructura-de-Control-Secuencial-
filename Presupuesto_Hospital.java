package com.mycompany.presupuesto_hospital;
import java.util.Scanner;

public class Presupuesto_Hospital {

    public static double ginecologia(double presupuesto) {
        double resultado = presupuesto * 0.40;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el presupuesto anual: ");
        double presupuesto = SC.nextDouble();

        ginecologia(presupuesto);

        System.out.println("Ginecología: " + ginecologia(presupuesto));
        System.out.println("Traumatología: " + (presupuesto * 0.30));
        System.out.println("Pediatría: " + (presupuesto * 0.30));
    }
}
