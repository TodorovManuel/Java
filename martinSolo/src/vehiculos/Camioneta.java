package vehiculos;

public class Camioneta extends Vehiculo {
    private static Integer ruedas = 4;
    public Camioneta(String marca, String modelo, String color, Integer cantRuedas, String anioFabricacion) {
        super();
    }
    private String patente;
    private double capacidadCarga;

    public Camioneta(String marca, String modelo, String color, Integer cantRuedas, String anioFabricacion, String patente, double capacidadCarga) {
        super();
        this.patente = patente;
        this.capacidadCarga = capacidadCarga;
    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }



}


