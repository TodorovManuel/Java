package mascotas;

public class Mascota {
    private String nombre;
    private Duenio duenio;

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
}