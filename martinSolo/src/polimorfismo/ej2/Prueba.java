package polimorfismo.ej2;

import java.time.LocalDateTime;

public abstract class Prueba {
    private LocalDateTime fechaRealizacion;


    public Prueba() {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Prueba(LocalDateTime fechaRealizacion, int notaNumerica) {
    }

    public LocalDateTime getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    abstract boolean aprobo();
}
