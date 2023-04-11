public class Coche extends Vehiculo {
    private String patente;
    private Boolean descapotable;

    public Coche(String marca, String modelo, String color, Integer cantRuedas, String anioFabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
    /* private String marca;
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
        this.velocidad = velocidad;
    }

    public double acelerar(double aceleracion) {
        this.velocidad = velocidad + aceleracion;
        return velocidad;
    }

    public double frenar(double freno) {
        this.velocidad = velocidad - freno;
        if(this.velocidad<0) {
            this.velocidad=0;
        }
        return velocidad;
    }

    public double velocidadActual(double velocidad) {
        System.out.println("La velocidad actual es: " + velocidad + " km");
        return velocidad;
    }
    */
}
