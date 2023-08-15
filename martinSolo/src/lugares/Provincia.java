package lugares;

import lugares.Ciudad;

import java.util.HashSet;

public class Provincia extends Lugar {
    private HashSet<Ciudad> provincias;

    public Provincia(HashSet<Ciudad> provincias) {
        this.provincias = provincias;
    }

    public HashSet<Ciudad> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Ciudad> provincias) {
        this.provincias = provincias;
    }
}
