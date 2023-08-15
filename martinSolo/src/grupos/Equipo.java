package grupos;

import persona.Jugador;

import java.util.ArrayList;

public class Equipo {

    public enum Turnos {
        MAÑANA, TARDE, NOCHE
    }
    private String nombre;
    private Turnos turnos;
    private Dia dias;
    private String barrio;
    private ArrayList<Jugador>jugadores;

    public Equipo(Dia dias) {
        this.dias = dias;
    }

    public Dia getDias() {
        return dias;
    }

    public void setDias(Dia dias) {
        this.dias = dias;
    }

    public Equipo(String turno, String dia, String nombre, String barrio, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.jugadores = jugadores;
    }

    public Equipo(Turnos turnos) {
        this.turnos = turnos;
    }

    public Turnos getTurnos() {
        return turnos;
    }

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
