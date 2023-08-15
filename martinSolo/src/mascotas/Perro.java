package mascotas;

import persona.Persona;

public class Perro extends  Mascota{
    private static String saludo =  "GUAF";
    public Perro(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    public Perro() {
        super();
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Perro.saludo = saludo;
    }

}
