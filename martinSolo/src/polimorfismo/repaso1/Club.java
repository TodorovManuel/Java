package polimorfismo.repaso1;

import polimorfismo.ej3.JugadorJugo;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.HashSet;

public class Club implements Contrato{
    private String nombreClub;

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    @Override
    public void contratar(Futbolista futbolista) throws JugadorJugo {
        if(!(futbolista.getHistorialEquipos().contains(this))){
            futbolista.getHistorialEquipos().add(this);
        } else {
            throw new JugadorJugo("Ya jugó en este equipo");
        }

    }

    @Override
    public void renovar() {

    }
}
