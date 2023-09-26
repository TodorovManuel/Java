package ej2Excepciones;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Orales extends Prueba{
    private Suficiencia suficiencia;

    public Orales(LocalDateTime fechaRealizacion, int notaNumerica, Suficiencia suficiencia) {
        super(fechaRealizacion, notaNumerica);
        this.suficiencia = suficiencia;
    }

    public Suficiencia getSuficiencia() {
        return suficiencia;
    }

    public void setSuficiencia(Suficiencia suficiencia) {
        this.suficiencia = suficiencia;
    }

    @Override
    boolean aprobo() {
        if(suficiencia.equals(Suficiencia.SUFICIENTE) || suficiencia.equals(Suficiencia.EXCELENTE)) {
            return true;
        } else {
            return false;
        }
    }
}
