package mascotas;

import java.util.HashSet;
import java.util.Scanner;

public class CentroMascotas {
    private HashSet<Mascota> mascotas ;

    public CentroMascotas() {
        this.mascotas = new HashSet<>();
    }

    public CentroMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void agregarMascota(String nombre, Duenio duenio, TipoMascota tipo) {
        if(tipo.name().equals("PERRO")){
            mascotas.add(new Perro(nombre, duenio));
        } else if(tipo.name().equals("GATO")) {
            mascotas.add(new Gato(nombre, duenio));
        } else {
            mascotas.add(new Pajarito(nombre, duenio));
        }
    }

    //Suponemos que la mascota ya esta cargada
    public void eliminarMascota(Mascota mascota) {
        mascotas.remove(mascota);
    }

    public void modificarMascota(String nombre) {
        for (Mascota mascot : mascotas) {
            if(mascot.getNombre().equals(nombre)) {
                String nombreIngresado;
                System.out.println("Ingrese el nuevo nombre de su mascota: ");
                Scanner leer=new Scanner(System.in);
                nombreIngresado=leer.next();
                mascot.setNombre(nombreIngresado);
            }
        }
    }

    public void saludarMascota(String nombreDuenio, String nombreMascota) {
        boolean esDuenio = false;
        for (Mascota mascot: mascotas) {
            if(mascot.getNombre().equals(nombreMascota)) {
                if(mascot.getDuenio().equals(nombreDuenio)) {
                    System.out.println(mascot.getSaludo());
                    if(mascot.getSaludo().equals(null)){
                        esDuenio = true;
                    }
                }
                mascot.saludar(esDuenio);
            }
        }

    }

}
