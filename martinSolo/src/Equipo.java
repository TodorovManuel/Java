import java.util.ArrayList;

public class Equipo {
    private String turno;
    private String dia;
    private String nombre;
    private String barrio;
    private ArrayList<Jugador>jugadores;

    public Equipo(String turno, String dia, String nombre, String barrio, ArrayList<Jugador> jugadores) {
        this.turno = turno;
        this.dia = dia;
        this.nombre = nombre;
        this.barrio = barrio;
        this.jugadores = jugadores;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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
