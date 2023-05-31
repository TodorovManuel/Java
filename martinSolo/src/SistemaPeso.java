import java.util.HashMap;
import java.util.HashSet;

public class SistemaPeso extends Persona{
    private HashMap<Fecha, Double> peso;
    private HashMap<Fecha, Double> altura;

    public SistemaPeso(Integer telefono, Fecha fechaNacimiento, HashMap<Fecha, Double> peso, HashMap<Fecha, Double> altura) {
        super(telefono, fechaNacimiento);
        this.peso = peso;
        this.altura = altura;
    }

    public SistemaPeso(String nombre, String apellido, HashMap<Fecha, Double> peso, HashMap<Fecha, Double> altura) {
        super(nombre, apellido);
        this.peso = peso;
        this.altura = altura;
    }

    public SistemaPeso(HashMap<Fecha, Double> peso, HashMap<Fecha, Double> altura) {
        this.peso = peso;
        this.altura = altura;
    }
}
