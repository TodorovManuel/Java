package sensores;

import persona.SistemaPeso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Detector> detectores = new ArrayList<>(Arrays.asList(new Detector(true, 10.0, 2340.0, 2005),
                new Detector(true, 14.0, 3240.0, 2002),
                new Detector(true, 123.0, 324.0, 2001),
                new Detector(true, 324.0, 53543.0, 2004)));
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese el indice del sensor");
        int indiceSensor = s.nextInt() ;
        try {
            Detector d = detectores.get(indiceSensor);
            d.getInfo();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("detector invalido");
        }
    }
}
