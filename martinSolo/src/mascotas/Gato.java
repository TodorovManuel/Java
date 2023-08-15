package mascotas;

import persona.Persona;

public class Gato extends Mascota{
    private static String saludo = "MEOW";

    public Gato(String nombre, Persona duenio) {
        super(nombre, duenio);
    }

    public Gato() {
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Gato.saludo = saludo;
    }
}
