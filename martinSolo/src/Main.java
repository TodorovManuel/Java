import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Circulo circulito = new Circulo(2);
      //  System.out.println("El area es: " + circulito.area() + " el perimetro es: " + circulito.permietro());

      //  Rectangulo rectangulito = new Rectangulo(5, 2);
      //  System.out.println("El area es: " + rectangulito.area() + " el perimetro es: " + rectangulito.perimetro());

      //  Coche cochecito = new Coche("Volkswagen", "Golf GTI", "blanco", 120);
      //  Scanner lectura = new Scanner(System.in);
      //  System.out.println("Ingrese cuanto quiere acelerar: ");
        // double aceleracion = lectura.nextDouble();
      //  cochecito.acelerar(aceleracion);
      //  cochecito.velocidadActual(cochecito.getVelocidad());
      //  Scanner lecturaFreno = new Scanner(System.in);
      //  System.out.println("Ingrese cuanto quiere frenar: ");
      //  double freno = lecturaFreno.nextDouble();
      //  cochecito.frenar(freno);
      //  cochecito.velocidadActual(cochecito.getVelocidad());

      //  Persona personita = new Persona("Benicio", 5, "Blanco encalada 2234");
      //  personita.muestraDatos();

          Fecha fechita = new Fecha(6, 8, 2005);
          fechita.valida(40,0,0);
          Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el mes del cual quiere saber los dias, ingrese en formato del 1 al 12");
        int mesIngresado = lectura.nextInt();
        fechita.diasMes(mesIngresado);
        System.out.println("El mes " + mesIngresado + " tiene " + fechita.diasMes(mesIngresado));
    }
}