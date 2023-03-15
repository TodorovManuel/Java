import unidad0.Coche;
import unidad0.Rectangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circulo circulito = new Circulo(2);
        System.out.println("El area es: " + circulito.area() + " el perimetro es: " + circulito.permietro());

        Rectangulo rectangulito = new Rectangulo(5, 2);
        System.out.println("El area es: " + rectangulito.area() + " el perimetro es: " + rectangulito.perimetro());

        Coche cochecito = new Coche("Volkswagen", "Golf GTI", "blanco", 120);
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese cuanto quiere acelerar: ");
        double aceleracion = lectura.nextDouble();
        

    }
}