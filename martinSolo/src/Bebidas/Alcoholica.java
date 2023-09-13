package Bebidas;

public class Alcoholica extends Bebida{
    private int cantAlcohol;

    public Alcoholica(String nombre, int coeficientePositividad, int cantAlcohol) {
        super(nombre, coeficientePositividad);
        this.cantAlcohol = cantAlcohol;
    }



}
