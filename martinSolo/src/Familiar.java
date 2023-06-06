import java.util.HashSet;

public class Familiar extends Persona{
    private HashSet<Plato> platosConsumidos;

    public Familiar(String nombre, String apellido, Integer telefono, Fecha fechaNacimiento, HashSet<Persona> listaFamilias, HashSet<Plato> platosConsumidos) {
        super(nombre, apellido, telefono, fechaNacimiento);
        this.platosConsumidos = platosConsumidos;
    }

    public HashSet<Plato> getPlatosConsumidos() {
        return platosConsumidos;
    }

    public void setPlatosConsumidos(HashSet<Plato> platosConsumidos) {
        this.platosConsumidos = platosConsumidos;
    }

    public void caloriasConsumidas(HashSet<Plato>platosConsumidos){
        double calorias = 0.0;
        for(Plato platos : platosConsumidos) {
            calorias = calorias + platos.getCantCalorias();
        }
    }
}
