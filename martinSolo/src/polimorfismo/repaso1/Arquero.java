package polimorfismo.repaso1;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Arquero extends Futbolista{
    private Float porcentajeAtajadas;
    private int golesRecibidos;

    public Arquero(String nombre, LocalDateTime fechaNacimiento, String posicion, Provincia provincia, HashSet<String> historialEquipos, int numeroCamiseta, Float porcentajeAtajadas, int golesRecibidos) {
        super(nombre, fechaNacimiento, posicion, provincia, historialEquipos, numeroCamiseta);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public Float getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(Float porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
}
