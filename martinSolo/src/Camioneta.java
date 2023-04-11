public class Camioneta extends Vehiculo {
    public Camioneta(String marca, String modelo, String color, Integer cantRuedas, String anioFabricacion) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
    }
    private String patente;
    private double capacidadCarga;

    public Camioneta(String marca, String modelo, String color, Integer cantRuedas, String anioFabricacion, String patente, double capacidadCarga) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
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


