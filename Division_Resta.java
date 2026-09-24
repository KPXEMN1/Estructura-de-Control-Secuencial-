package com.mycompany.division_resta;
import java.util.Scanner;

public class Division_Resta {

    public static void calcular(int dividendo, int divisor) {
        int resto = dividendo;
        int cociente = 0;

        while (resto >= divisor) {
            resto = resto - divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int dividendo = SC.nextInt();

        System.out.println("Ingrese el divisor: ");
        int divisor = SC.nextInt();

        calcular(dividendo, divisor);
    }
}
