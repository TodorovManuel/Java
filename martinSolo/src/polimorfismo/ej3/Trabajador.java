package polimorfismo.ej3;

import persona.Persona;
import tiempo.Fecha;

public class Trabajador extends Persona {
    private int cuil;
    private int salario;
    private String direccionRecidencia;

    public Trabajador(String nombre, String apellido, Integer telefono, Fecha fechaNacimiento, int cuil, int salario, String direccionRecidencia) {
        super(nombre, apellido, telefono, fechaNacimiento);
        this.cuil = cuil;
        this.salario = salario;
        this.direccionRecidencia = direccionRecidencia;
    }

    public Trabajador(int cuil, int salario, String direccionRecidencia) {
        this.cuil = cuil;
        this.salario = salario;
        this.direccionRecidencia = direccionRecidencia;
    }

    public Trabajador(String nombre, String apellido, int cuil, int salario, String direccionRecidencia) {
        super(nombre, apellido);
        this.cuil = cuil;
        this.salario = salario;
        this.direccionRecidencia = direccionRecidencia;
    }

    public Trabajador(String nombre, int cuil, int salario, String direccionRecidencia) {
        super(nombre);
        this.cuil = cuil;
        this.salario = salario;
        this.direccionRecidencia = direccionRecidencia;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDireccionRecidencia() {
        return direccionRecidencia;
    }

    public void setDireccionRecidencia(String direccionRecidencia) {
        this.direccionRecidencia = direccionRecidencia;
    }
}
