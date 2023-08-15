package mascotas;

import persona.Persona;

public class Cantor extends Pajarito{
    private static String canto = "pipiripipi";

    public Cantor(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    public static String getCanto() {
        return canto;
    }

    public static void setCanto(String canto) {
        Cantor.canto = canto;
    }
}
