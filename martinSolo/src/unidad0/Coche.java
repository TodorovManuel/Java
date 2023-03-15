package unidad0;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public String getMarca() {
        return marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coche(String marca, String modelo, String color, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public double acelerar(double aceleracion) {
        double velocidadActual = velocidad + aceleracion;
        return velocidadActual;
    }

    public double frenar(double freno, double velocidadActual) {
        velocidadActual = velocidad - freno;
        return velocidadActual;
    }

    public double velocidadActual(double velocidadActual) {
        return velocidadActual;
    }
}
