import java.util.ArrayList;

public class Cd {
    private ArrayList<Cancion>canciones;

    public Cd() {
        this.canciones = new ArrayList<Cancion>();
       // canciones.add(new Cancion("Jose123", "Duki"));
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones() {
        int cantCanciones = canciones.size();
        System.out.println(cantCanciones);
        return cantCanciones;
    }

    public void verCancion(int posicion) {
        System.out.println(canciones.get(posicion).getTitulo());
    }

    public void grabarCancion(int posicion, Cancion nuevaCancion) {
        canciones.set(posicion, nuevaCancion);
    }

    public void agregar(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminar(int posicion) {
        canciones.remove(posicion);
    }
}
