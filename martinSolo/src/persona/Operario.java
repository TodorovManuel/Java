package persona;

import persona.Empleado;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "persona.Empleado " + this.getNombre() + " -> persona.Operario";
    }
}
