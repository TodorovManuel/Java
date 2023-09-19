package polimorfismo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Revista extends Lectura {
    private LocalDateTime fechaPublicacion;

    public Revista(Integer codigo, String titulo, LocalDate anioPublicacion, LocalDateTime fechaPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public Revista(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public void prestar() {
        //Preguntarle al profe
    }
}
