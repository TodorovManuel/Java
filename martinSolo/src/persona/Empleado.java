package persona;

import sensores.Dia;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {
    HashSet<Dia>diasLaborables;
    HashSet<LocalDateTime>asistencia;
/*
    public Empleado(String telefono, String fechaNacimiento, HashSet<Dia> diasLaborables, HashSet<LocalDateTime> asistencia) {
        super(telefono, fechaNacimiento);
        this.diasLaborables = diasLaborables;
        this.asistencia = asistencia;
    }

    public Empleado(String nombre, String apellido, HashSet<Dia> diasLaborables, HashSet<LocalDateTime> asistencia) {
        super(nombre, apellido);
        this.diasLaborables = diasLaborables;
        this.asistencia = asistencia;
    }
*/
    public Empleado(HashSet<Dia> diasLaborables, HashSet<LocalDateTime> asistencia) {
        this.diasLaborables = diasLaborables;
        this.asistencia = asistencia;
    }

    public Empleado(String nombre) {
        this.setNombre(nombre);
    }

    public HashSet<Dia> getDiasLaborables() {
        return diasLaborables;
    }

    public void setDiasLaborables(HashSet<Dia> diasLaborables) {
        this.diasLaborables = diasLaborables;
    }

    public HashSet<LocalDateTime> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashSet<LocalDateTime> asistencia) {
        this.asistencia = asistencia;
    }

    public double porcentaje(int mes){
        Double diasTotal = (double) (diasLaborables.size() * 4);
        int contador = 0;
        for (LocalDateTime fechaActual : asistencia) {
            if (fechaActual.getDayOfMonth() == mes) {
                contador++;
            }
        }
        return contador*100/diasTotal;
    }

}
