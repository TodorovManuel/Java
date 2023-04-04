import java.rmi.MarshalException;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Double>notas;

    public Materia(String nombre, ArrayList<Double>notas) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double>notas) {
        this.notas = notas;
    }


    public void agregarMateria(Materia materia) {
        this.nombre = "Lengua";
        this.notas = new ArrayList<>();
    }

    public double promedioMateria(ArrayList<Double> notas) {
        double sumaNotasMateria = 0;
        for(double nota: notas) {
            sumaNotasMateria = sumaNotasMateria + nota;
        }
        double promedio = sumaNotasMateria/notas.size();
        return promedio;
    }

    public double promedioAlumno() {
        double sumaNotasAlumno = 0;
        for(double nota: notas) {
            sumaNotasAlumno = sumaNotasAlumno + nota;
        }
        double promedioAlumno = sumaNotasAlumno/notas.size();
        return promedioAlumno;
    }
}

