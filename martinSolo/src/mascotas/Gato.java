package mascotas;

public class Gato extends Mascota{
    private static String saludo = "meoww";

    public Gato(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    public Gato() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        Gato.saludo = saludo;
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
