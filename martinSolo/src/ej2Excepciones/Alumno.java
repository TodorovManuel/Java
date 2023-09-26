package ej2Excepciones;

import persona.Persona;

import java.util.HashSet;

public class Alumno {
    private int dni;
    private String nombre;
    private String apellido;
    private HashSet<Prueba> pruebas;


    public Alumno(int dni, String nombre, String apellido, HashSet<Prueba> pruebas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pruebas = pruebas;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(HashSet<Prueba> pruebas) {
        this.pruebas = pruebas;
    }
}
