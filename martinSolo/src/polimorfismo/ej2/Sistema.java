package polimorfismo.ej2;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
    HashMap<Alumno, Prueba> listaExamenes;


    public void cantAprobados() {
        for (Map.Entry<Alumno, Prueba> entry : listaExamenes.entrySet()) {

        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
    }
}
