package unidad0;

import java.nio.charset.StandardCharsets;

public class Ejercicio1 {
    public static void main(String[] args) {
        int N = 10;
        double A = 1.7;
        char C = 'm';
        int valorC = (int) C;

        //MUESTRO VALORES
        System.out.println("El valor de N es: " + N);
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de C es: " + C);
        //OPERACIONES
        System.out.println("El valor de N + A es: " + (N+A));
        System.out.println("El valor de A - N es: " + (A-N));

        //VALOR ASCII DE C
        System.out.println("El valor ASCII es: " + valorC);
    }
}

