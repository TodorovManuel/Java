package mascotas;

import persona.Persona;

public class Pajarito extends Mascota{
    public static String saludo = "pio";
    public Pajarito(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    public Pajarito() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        Pajarito.saludo = saludo;
    }


    @Override
    public void saludar(Boolean esDuenio) {
        if (esDuenio == true) {
            System.out.println(getSaludo());
        } else {
            System.out.println(getSaludo().toUpperCase() + " !");
        }
    }
}
