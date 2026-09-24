package com.mycompany.compra_piezas;
import java.util.Scanner;

public class Compra_Piezas {

    public static void calcular(double compra) {
        double empresa;
        double banco;
        double credito;
        double intereses;

        if (compra > 500000) {
            empresa = compra * 0.55;
            banco = compra * 0.30;
            credito = compra * 0.15;
        } else {
            empresa = compra * 0.70;
            banco = 0;
            credito = compra * 0.30;
        }

        intereses = credito * 0.20;

        System.out.println("Fondos de la empresa: " + empresa);
        System.out.println("Préstamo del banco: " + banco);
        System.out.println("Crédito del fabricante: " + credito);
        System.out.println("Intereses: " + intereses);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el monto total de la compra: ");
        double compra = SC.nextDouble();

        calcular(compra);
    }
}