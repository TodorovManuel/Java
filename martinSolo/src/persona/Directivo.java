package persona;

import sensores.Dia;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(new HashSet<Dia>(), new HashSet<LocalDateTime>());

    }

    @Override
    public String toString() {
        String nombre  = "";
        return "persona.Empleado " + nombre + " -> persona.Directivo";
    }
}
