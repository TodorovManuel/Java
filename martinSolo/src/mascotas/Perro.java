package mascotas;

import persona.Persona;

public class Perro extends  Mascota{
    private static String saludo =  "guaf";
    public Perro(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    public Perro() {
        super();
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        Perro.saludo = saludo;
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
