package polimorfismo.repaso1;

import java.time.LocalDateTime;
import java.util.HashSet;

public class JugadorCampo extends Futbolista{
    private Float porcentajeGoles;
    private int cantAsistencias;

    public JugadorCampo(String nombre, LocalDateTime fechaNacimiento, String posicion, Provincia provincia, HashSet<String> historialEquipos, int numeroCamiseta, Float porcentajeGoles, int cantAsistencias) {
        super(nombre, fechaNacimiento, posicion, provincia, historialEquipos, numeroCamiseta);
        this.porcentajeGoles = porcentajeGoles;
        this.cantAsistencias = cantAsistencias;
    }

    public Float getPorcentajeGoles() {
        return porcentajeGoles;
    }

    public void setPorcentajeGoles(Float porcentajeGoles) {
        this.porcentajeGoles = porcentajeGoles;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
}
