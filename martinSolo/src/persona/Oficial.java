package persona;

import persona.Operario;

public class Oficial extends Operario {
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "persona.Empleado " + this.getNombre() + " -> persona.Operario" + " -> persona.Oficial";
    }
}
