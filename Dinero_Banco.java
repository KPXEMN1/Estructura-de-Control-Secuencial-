package com.mycompany.dinero_banco;
import java.util.Scanner;

public class Dinero_Banco {

    public static double dinero(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        double resultado = (n1 * 50000) + (n2 * 20000) + (n3 * 10000) +
                (n4 * 5000) + (n5 * 2000) + (n6 * 1000) +
                (n7 * 500) + (n8 * 100);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese cantidad de billetes de 50000: ");
        int n1 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 20000: ");
        int n2 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 10000: ");
        int n3 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 5000: ");
        int n4 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 2000: ");
        int n5 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 1000: ");
        int n6 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 500: ");
        int n7 = SC.nextInt();

        System.out.println("Ingrese cantidad de billetes de 100: ");
        int n8 = SC.nextInt();

        dinero(n1, n2, n3, n4, n5, n6, n7, n8);

        System.out.println("El dinero total en el banco es: " + dinero(n1, n2, n3, n4, n5, n6, n7, n8));
    }
}