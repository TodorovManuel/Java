package persona;

public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "persona.Empleado " + nombre + " -> persona.Directivo";
    }
}
