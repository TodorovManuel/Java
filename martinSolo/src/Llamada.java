public class Llamada {
    private EmpleadoTelefono empleadoOrigen;
    private EmpleadoTelefono empleadoDestino;
    private String duracion;
    private String fechaLlamada;

    public Llamada(EmpleadoTelefono empleadoOrigen, EmpleadoTelefono empleadoDestino, String duracion, String fechaLlamada) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.duracion = duracion;
        this.fechaLlamada = fechaLlamada;
    }

    public EmpleadoTelefono getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(EmpleadoTelefono empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public EmpleadoTelefono getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(EmpleadoTelefono empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(String fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

}
