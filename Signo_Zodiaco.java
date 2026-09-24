package com.mycompany.signo_zodiaco;
import java.util.Scanner;

public class Signo_Zodiaco {

    public static String signo(int dia, int mes) {
        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpión";
        } else {
            return "Sagitario";
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el día de nacimiento: ");
        int dia = SC.nextInt();

        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = SC.nextInt();

        System.out.println("El signo zodiacal es: " + signo(dia, mes));
    }
}
