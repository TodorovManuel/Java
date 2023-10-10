package repaso2;

import java.util.Map;

public class Chef implements Incorporacion{
    private String nombre;
    private boolean experienciaPrevia;
    private int edad;

    public Chef(String nombre, Boolean experienciaPrevia, int edad) {
        this.nombre = nombre;
        this.experienciaPrevia = experienciaPrevia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(Boolean experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
