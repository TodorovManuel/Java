import sun.security.jgss.GSSCaller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Mundo {
    private HashSet<Lugar> lugares;


    public void agregarLugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombreIngresado = sc.next();
        System.out.println("Ingrese código");
        Integer codigoIngresado = sc.nextInt();
        System.out.println("Ingrese latitud");
        Double latitudIngresada = sc.nextDouble();
        System.out.println("Ingrese longitud");
        Double longitudIngresada = sc.nextDouble();
        Coordenada cIngresada = new Coordenada(latitudIngresada, longitudIngresada);

    }
}
