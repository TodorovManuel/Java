package cocina;

import persona.Persona;

public class Pedido extends Persona {
    private String fechaCreacion;
    private String horarioEntrega;
    private Boolean entregado;

    public Pedido(String nombre, String apellido, String fechaCreacion, String horarioEntrega, Boolean entregado) {
        super(nombre, apellido);
        this.fechaCreacion = fechaCreacion;
        this.horarioEntrega = horarioEntrega;
        this.entregado = entregado;
    }

    public Pedido(String fechaCreacionIngresada, String horarioEntregaIngresado, Boolean entregadoIngresado) {
        super();
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(String horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

}
