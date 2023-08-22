package mascotas;

public abstract  class Mascota {
    private String nombre;
    private Duenio duenio;
    private String saludo;

    public Mascota(String saludo) {
        this.saludo = saludo;
    }

    public Mascota(String nombre, Duenio duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    public abstract void saludar(Boolean esDuenio);
}
