import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alumno {

    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Integer> listaNotas;

    private ArrayList<Materia>materias ;

    public Alumno(String apellido, Fecha fechaNacimiento, ArrayList<Integer> listaNotas, ArrayList<Materia>materias) {
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaNotas = listaNotas;
        this.materias = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void agregarNota(Integer nota) {
        listaNotas.add(nota);
    }

    public void menorNota() {
        int menorNota =listaNotas.get(0);
        for (int nota: listaNotas) {
            if (menorNota<nota) {
                menorNota=nota;
            }
        }
        System.out.println(menorNota);
    }

    public void mayorNota() {
        int mayorNota=listaNotas.get(0);
        for (int nota: listaNotas) {
            if(mayorNota>nota) {
                mayorNota=nota;
            }
        }
        System.out.println(mayorNota);
    }
    public double promedioAlumno() {
        double sumaNotasAlumno = 0;
        for(double nota: listaNotas) {
            sumaNotasAlumno = sumaNotasAlumno + nota;
        }
        double promedioAlumno = sumaNotasAlumno/listaNotas.size();
        return promedioAlumno;
    }
}
