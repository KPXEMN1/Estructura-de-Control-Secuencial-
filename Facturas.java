package com.mycompany.facturas;
import java.util.Scanner;

public class Facturas {

    public static void calcular(int dias, double monto) {
        double interes = 0;
        double descuento = 0;
        double cancelar = monto;

        if (dias >= 60) {
            interes = monto * 0.08;
            cancelar = monto + interes;
        } else if (dias >= 31) {
            interes = monto * 0.06;
            cancelar = monto + interes;
        } else if (dias < 15) {
            descuento = monto * 0.02;
            cancelar = monto - descuento;
        }

        System.out.println("Monto de la factura: " + monto);
        System.out.println("Interés de mora: " + interes);
        System.out.println("Descuento: " + descuento);
        System.out.println("Monto a cancelar: " + cancelar);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Número de factura: ");
        String numero = SC.next();

        System.out.println("Nombre del cliente: ");
        String nombre = SC.next();

        System.out.println("Monto de la factura: ");
        double monto = SC.nextDouble();

        System.out.println("Días transcurridos: ");
        int dias = SC.nextInt();

        System.out.println("Factura: " + numero);
        System.out.println("Cliente: " + nombre);

        calcular(dias, monto);
    }
}