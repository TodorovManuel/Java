package cocina;

public class Cafetera {
    private double cantMaxima;
    private double cantActual;
    private int capacidad;
    private int cantidad;

    public Cafetera() {
        this.cantMaxima=1000;
        this.cantActual=0;
    }

    public Cafetera(double cantMaxima) {
        this.cantActual = cantMaxima;
    }

    public Cafetera(double cantMaxima, double cantActual) {
        if (cantActual>cantMaxima) {
            cantMaxima=cantActual;
        }
        this.cantMaxima = cantMaxima;
        this.cantActual = cantActual;
    }

    public double llenarCafetera(double cantMaxima, double cantActual) {
        cantActual=cantMaxima;
        return cantActual;
    }

    public int servirTaza(int capacidad) {
        if(cantActual<capacidad) {
            cantActual=capacidad;
        }
        return capacidad;
    }

    public double vaciarCafetera(double cantActual) {
        cantActual=0;
        return cantActual;
    }

    public double agregarCafe(int cantidad) {
        cantActual=cantidad;
        return cantActual;
    }
}
