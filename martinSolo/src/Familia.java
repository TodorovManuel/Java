import java.util.HashSet;

public class Familia extends Familiar{
    private HashSet<Familiar> listaFamilias;

    public Familia(String nombre, String apellido, Integer telefono, Fecha fechaNacimiento, HashSet<Persona> listaFamilias, HashSet<Plato> platosConsumidos, HashSet<Familiar> listaFamilias1) {
        super(nombre, apellido, telefono, fechaNacimiento, listaFamilias, platosConsumidos);
        this.listaFamilias = listaFamilias1;
    }

    public HashSet<Familiar> getListaFamilias() {
        return listaFamilias;
    }

    public void setListaFamilias(HashSet<Familiar> listaFamilias) {
        this.listaFamilias = listaFamilias;
    }
}
