public class Profesor extends Persona{
    private double descuento;

    public Profesor(String nombre, String apellido, double descuento) {
        super(nombre, apellido);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
