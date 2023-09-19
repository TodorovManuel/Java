package polimorfismo;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Lectura>coleccionLectura;
    private HashSet<Prenda>coleccionPrenda;

    public Sistema(HashSet<Lectura> coleccionLectura, HashSet<Prenda> coleccionPrenda) {
        this.coleccionLectura = coleccionLectura;
        this.coleccionPrenda = coleccionPrenda;
    }

    public HashSet<Lectura> getColeccionLectura() {
        return coleccionLectura;
    }

    public void setColeccionLectura(HashSet<Lectura> coleccionLectura) {
        this.coleccionLectura = coleccionLectura;
    }

    public HashSet<Prenda> getColeccionPrenda() {
        return coleccionPrenda;
    }

    public void setColeccionPrenda(HashSet<Prenda> coleccionPrenda) {
        this.coleccionPrenda = coleccionPrenda;
    }
}
