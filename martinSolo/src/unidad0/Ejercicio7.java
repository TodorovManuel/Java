package unidad0;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numeroIngresado = lectura.nextInt();
        while(numeroIngresado!= -1) {
            System.out.println("Ingrese numero y -1 para dejar de ingresar: ");
            numeroIngresado = lectura.nextInt();
            contador++;
        }
        System.out.println("La cantidad de numeros ingresados es: " + contador);
    }
}