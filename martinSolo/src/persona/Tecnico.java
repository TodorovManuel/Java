package persona;

import persona.Operario;

public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "persona.Empleado " + nombre + " -> persona.Operario " + " -> persona.Tecnico";
    }
}
