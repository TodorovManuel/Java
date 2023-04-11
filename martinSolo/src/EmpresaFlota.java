import java.util.ArrayList;

public class EmpresaFlota {
    ArrayList<Vehiculo>listaVehiculos;

    public EmpresaFlota(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void masCantidad(ArrayList<Vehiculo>listaVehiculos) {
        int contadorConches = 0;
        int contadorCamionetas = 0;
        for (Vehiculo listaVehiculo : listaVehiculos) {
            if (listaVehiculo instanceof Coche) {
                contadorConches++;
            } else if (listaVehiculo instanceof Camioneta) {
                contadorCamionetas++;
            }
        }
    }

    public void agregarCarga(double capacidadCarga, double capacidadIngresada) {
        for (Vehiculo listaVehiculo : listaVehiculos) {
            if(listaVehiculo instanceof Camioneta) {
                if (((Camioneta)listaVehiculo).getCapacidadCarga() < capacidadIngresada) {
                    System.out.println("No se puede cargar ese peso");
                } else {
                    System.out.println("El peso ha sido cargado correctamente");
                }
            }
        }
    }

    public void porcentajeDescapotables() {
        int contadorDescapotables = 0;
        int contadorConches = 0;
        for (Vehiculo listaVehiculo : listaVehiculos) {
            if(listaVehiculo instanceof Coche) {
                if (((Coche)listaVehiculo).getDescapotable() == true) {
                    contadorDescapotables++;
                }
                contadorConches++;
            }
        }
        System.out.println((contadorConches+contadorDescapotables)/contadorDescapotables);
    }
}
