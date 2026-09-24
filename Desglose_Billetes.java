package com.mycompany.desglose_billetes;
import java.util.Scanner;

public class Desglose_Billetes {

    public static void calcular(int dinero) {
        int billetes;

        billetes = dinero / 50000;
        System.out.println("50000: " + billetes);
        dinero = dinero % 50000;

        billetes = dinero / 20000;
        System.out.println("20000: " + billetes);
        dinero = dinero % 20000;

        billetes = dinero / 10000;
        System.out.println("10000: " + billetes);
        dinero = dinero % 10000;

        billetes = dinero / 5000;
        System.out.println("5000: " + billetes);
        dinero = dinero % 5000;

        billetes = dinero / 2000;
        System.out.println("2000: " + billetes);
        dinero = dinero % 2000;

        billetes = dinero / 1000;
        System.out.println("1000: " + billetes);
        dinero = dinero % 1000;

        billetes = dinero / 500;
        System.out.println("500: " + billetes);
        dinero = dinero % 500;

        billetes = dinero / 100;
        System.out.println("100: " + billetes);
        dinero = dinero % 100;

        billetes = dinero / 50;
        System.out.println("50: " + billetes);
        dinero = dinero % 50;

        billetes = dinero / 20;
        System.out.println("20: " + billetes);
        dinero = dinero % 20;

        billetes = dinero / 10;
        System.out.println("10: " + billetes);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Bolívares: ");
        int dinero = SC.nextInt();

        calcular(dinero);
    }
}
