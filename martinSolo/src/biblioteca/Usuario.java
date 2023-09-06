package biblioteca;

import persona.Persona;
import tiempo.Fecha;

import java.util.HashSet;

public class Usuario extends Persona {
    private HashSet<Libro> librosPrestados;
    private Membresia membresia;

    public Usuario(String nombre, String apellido, Integer telefono, Fecha fechaNacimiento, HashSet<Libro> librosPrestados, Membresia membresia) {
        super(nombre, apellido, telefono, fechaNacimiento);
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public Usuario(HashSet<Libro> librosPrestados, Membresia membresia) {
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public Usuario(String nombre, String apellido, HashSet<Libro> librosPrestados, Membresia membresia) {
        super(nombre, apellido);
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public Usuario(String nombre, HashSet<Libro> librosPrestados, Membresia membresia) {
        super(nombre);
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
