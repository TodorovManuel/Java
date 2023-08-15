package lugares;

import java.util.HashSet;

public class Pais extends Lugar {
    private HashSet<Ciudad> paises;

    public Pais(HashSet<Ciudad> paises) {
        this.paises = paises;
    }

    public HashSet<Ciudad> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Ciudad> paises) {
        this.paises = paises;
    }
}

