import java.util.HashSet;

public class Empresa {
    private HashSet<Empleado> empleados;

    public Empresa(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Double porcentajeTotalEmpleado(int mes) {
        double suma = 0;
        int total = 100*empleados.size();
        for(Empleado e : empleados) {
            suma=e.porcentaje(mes);
        }
        return (double) (suma*100/total);
    }

}
