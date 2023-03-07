package unidad0;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la letra: ");
        String letraIngresada = lectura.next();

        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='e' || frase.charAt(i)=='E' || frase.charAt(i)=='é') {
                frase.chartAt(i)=letraIngresada;
            }
        }
        System.out.println(frase);
    }
}
