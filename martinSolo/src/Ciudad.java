import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> ciudades;

    public Ciudad(HashSet<Barrio> ciudades) {
        this.ciudades = ciudades;
    }

    public HashSet<Barrio> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Barrio> ciudades) {
        this.ciudades = ciudades;
    }
}
