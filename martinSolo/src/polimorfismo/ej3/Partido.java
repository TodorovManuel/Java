package polimorfismo.ej3;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccionOficina;
    private int cantAfiliados;
    private HashSet<Mensajeria> listaMensajeros;

    public Partido(String nombre, String direccionOficina, int cantAfiliados, HashSet<Mensajeria> listaMensajeros) {
        this.nombre = nombre;
        this.direccionOficina = direccionOficina;
        this.cantAfiliados = cantAfiliados;
        this.listaMensajeros = listaMensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionOficina() {
        return direccionOficina;
    }

    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajeria> getListaMensajeros() {
        return listaMensajeros;
    }

    public void setListaMensajeros(HashSet<Mensajeria> listaMensajeros) {
        this.listaMensajeros = listaMensajeros;
    }
    public void agregarMensajero(Mensajeria mensajero){
        listaMensajeros.add(mensajero);
    }
    public void hacerCampania(){
        for(Mensajeria m :listaMensajeros){
            m.enviarMensaje("Vote por el partido para un mejor futuro");
        }
    }
}
