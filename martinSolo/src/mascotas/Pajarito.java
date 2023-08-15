package mascotas;

import persona.Persona;

public class Pajarito extends Mascota{
    public static String saludo = "pio";
    public Pajarito(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    public Pajarito() {
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Pajarito.saludo = saludo;
    }
}
