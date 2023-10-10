package polimorfismo.repaso1;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Futbolista {
    private String nombre;
    private LocalDateTime fechaNacimiento;
    private String posicion;
    private Provincia provincia;
    private HashSet<String> historialEquipos;
    private int numeroCamiseta;

    public Futbolista(String nombre, LocalDateTime fechaNacimiento, String posicion, Provincia provincia, HashSet<String> historialEquipos, int numeroCamiseta) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.provincia = provincia;
        this.historialEquipos = historialEquipos;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public HashSet<String> getHistorialEquipos() {
        return historialEquipos;
    }

    public void setHistorialEquipos(HashSet<Club> historialEquipos) {
        this.historialEquipos = historialEquipos;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}
