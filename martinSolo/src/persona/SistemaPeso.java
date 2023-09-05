package persona;


import tiempo.Fecha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaPeso extends Persona {
    private HashMap<Fecha, Double> listaPeso;
    private HashMap<Fecha, Double> listaAltura;

    public SistemaPeso(String nombre, String apellido, Integer telefono, Fecha fechaNacimiento, HashMap<Fecha, Double> listaPeso, HashMap<Fecha, Double> listaAltura) {
        super(nombre, apellido, telefono, fechaNacimiento);
        this.listaPeso = listaPeso;
        this.listaAltura = listaAltura;
    }

    public SistemaPeso(String nombre, String apellido, HashMap<Fecha, Double> listaPeso, HashMap<Fecha, Double> listaAltura) {
        super(nombre, apellido);
        this.listaPeso = listaPeso;
        this.listaAltura = listaAltura;
    }

    public SistemaPeso(HashMap<Fecha, Double> listaPeso, HashMap<Fecha, Double> listaAltura) {
        super();
        this.listaPeso = listaPeso;
        this.listaAltura = listaAltura;
    }

    public HashMap<Fecha, Double> getListaPeso() {
        return listaPeso;
    }

    public void setListaPeso(HashMap<Fecha, Double> listaPeso) {
        this.listaPeso = listaPeso;
    }

    public HashMap<Fecha, Double> getListaAltura() {
        return listaAltura;
    }

    public void setListaAltura(HashMap<Fecha, Double> listaAltura) {
        this.listaAltura = listaAltura;
    }

    public void registraInfo(double peso, double altura, Fecha fechaIngresada) {
        listaPeso.put(fechaIngresada, peso);
        listaAltura.put(fechaIngresada, altura);
    }
    public void muestra(Fecha fechaIngresada) {
        System.out.println("El peso es: " + listaPeso.get(fechaIngresada));
        System.out.println("La altura es: " + listaAltura.get(fechaIngresada));
    }

    public double promedioPeso(Integer anio) {
        Double sumaTotal = 0.0;
        for (Map.Entry<Fecha,Double> entrada: listaPeso.entrySet()) {
            sumaTotal+=entrada.getValue();
        }
        return sumaTotal/listaPeso.size();
    }

    public double promedioAltura(Integer anio) {
        Double sumaTotal = 0.0;
        for (Map.Entry<Fecha,Double> entrada: listaAltura.entrySet()) {
            sumaTotal+=entrada.getValue();
        }
        return sumaTotal/listaAltura.size();
    }

    // HACER LO MISMO PARA EL AÑO MAS GRANDE Y DESPUES SACAR LA DIFERENCIA jeje
    public double diferenciaCrecimiento(Integer anio) {
        Double mayorAltura = 0.0;
        for (Map.Entry<Fecha,Double> entrada: listaAltura.entrySet()) {
            if(entrada.getValue() > mayorAltura) {
                mayorAltura=entrada.getValue();
            }
        }
        return 0;
    }

    public void mostrarInfo(int i){

    }
 }

