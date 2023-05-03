import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente>clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public Banco(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "clientes=" + clientes +
                '}';
    }
    public void Menu(){

    }
    //methods

}
