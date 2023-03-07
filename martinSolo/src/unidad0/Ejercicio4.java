package unidad0;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        String diaIngresado = lectura.next();

        if(diaIngresado.equals("Sabado") || diaIngresado.equals("sabado") || diaIngresado.equals("Domingo") || diaIngresado.equals("domingo")){
            System.out.println("El dia ingresado no es un dia laboral");
        } else {
            System.out.println("El dia ingresado es laboral");
        }
    }
 }

