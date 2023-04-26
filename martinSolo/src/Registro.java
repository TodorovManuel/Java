import java.util.ArrayList;

public class Registro {
    private ArrayList<Llamada>registroLlamada;

    public Registro(ArrayList<Llamada> registroLlamada) {
        this.registroLlamada = registroLlamada;
    }

    public ArrayList<Llamada> getRegistroLlamada() {
        return registroLlamada;
    }

    public void setRegistroLlamada(ArrayList<Llamada> registroLlamada) {
        this.registroLlamada = registroLlamada;
    }

    public void muestraListado() {
        for (Integer i=0; i<registroLlamada.size(); i++) {
            System.out.println(registroLlamada.get(i).getEmpleadoDestino().getNombre()+ registroLlamada.get(i).getEmpleadoDestino().getApellido() + registroLlamada.get(i).getEmpleadoDestino().getDni() + registroLlamada.get(i).getEmpleadoDestino().getPais() + registroLlamada.get(i).getEmpleadoDestino().getNumeroTelefono());
            System.out.println(registroLlamada.get(i).getEmpleadoOrigen().getNombre()+ registroLlamada.get(i).getEmpleadoOrigen().getApellido() + registroLlamada.get(i).getEmpleadoOrigen().getDni() + registroLlamada.get(i).getEmpleadoOrigen().getPais() + registroLlamada.get(i).getEmpleadoOrigen().getNumeroTelefono());
            System.out.println(registroLlamada.get(i).getDuracion());
            System.out.println(registroLlamada.get(i).getFechaLlamada());
        }
    }

    
}
