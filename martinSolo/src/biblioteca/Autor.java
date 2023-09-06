package biblioteca;
import persona.Persona;
import tiempo.Fecha;

import java.util.HashSet;

public class Autor extends Persona{
    private HashSet<Libro> bibliografia;

    public Autor(String nombre, String apellido, Integer telefono, Fecha fechaNacimiento, HashSet<Libro> bibliografia) {
        super(nombre, apellido, telefono, fechaNacimiento);
        this.bibliografia = bibliografia;
    }

    public Autor(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Autor(String nombre, String apellido, HashSet<Libro> bibliografia) {
        super(nombre, apellido);
        this.bibliografia = bibliografia;
    }

    public Autor(String nombre, HashSet<Libro> bibliografia) {
        super(nombre);
        this.bibliografia = bibliografia;
    }

    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }
}
