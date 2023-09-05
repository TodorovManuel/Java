package persona;

import persona.Operario;

public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "persona.Empleado " + this.getNombre() + " -> persona.Operario " + " -> persona.Tecnico";
    }
}
