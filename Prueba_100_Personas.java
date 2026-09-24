package com.mycompany.prueba_100_personas;
import java.util.Scanner;

public class Prueba_100_Personas {

    public static void calcular(Scanner SC) {
        int tres = 0;
        int unoDos = 0;
        int unoTres = 0;
        int dosTres = 0;
        int uno = 0;
        int dos = 0;
        int tresPregunta = 0;
        int ninguna = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Persona " + i);
            System.out.println("¿Pregunta 1 correcta? 1=Sí, 0=No");
            int p1 = SC.nextInt();

            System.out.println("¿Pregunta 2 correcta? 1=Sí, 0=No");
            int p2 = SC.nextInt();

            System.out.println("¿Pregunta 3 correcta? 1=Sí, 0=No");
            int p3 = SC.nextInt();

            if (p1 == 1 && p2 == 1 && p3 == 1) tres++;
            if (p1 == 1 && p2 == 1 && p3 == 0) unoDos++;
            if (p1 == 1 && p2 == 0 && p3 == 1) unoTres++;
            if (p1 == 0 && p2 == 1 && p3 == 1) dosTres++;

            if (p1 == 1) uno++;
            if (p2 == 1) dos++;
            if (p3 == 1) tresPregunta++;

            if (p1 == 0 && p2 == 0 && p3 == 0) ninguna++;
        }

        System.out.println("Tres correctas: " + tres);
        System.out.println("Solo primera y segunda: " + unoDos);
        System.out.println("Solo primera y tercera: " + unoTres);
        System.out.println("Solo segunda y tercera: " + dosTres);
        System.out.println("Primera por lo menos: " + uno);
        System.out.println("Segunda por lo menos: " + dos);
        System.out.println("Tercera por lo menos: " + tresPregunta);
        System.out.println("Ninguna correcta: " + ninguna);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        calcular(SC);
    }
}
