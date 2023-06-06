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

    public double promCalorias() {
        double promedio = 0.0;
        for(Familiar r : listaFamilias) {

        }
        return 0;
    }

    public int masCalorias() {
        Double maxCalorias = 0.0;
        return 0;
    }

    public int minCalorias() {
        double minCalorias = -1.0;
        for(Familiar f : listaFamilias) {
            if(minCalorias == -1 || f.caloriasConsumidas() <= minCalorias) {
                minCalorias = f.caloriasConsumidas();
            }
        }
        return minCalorias;
    }
}
