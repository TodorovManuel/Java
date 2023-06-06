import java.util.HashSet;

public class Plato {
    private String nombrePlato;
    private Double cantCalorias;

    public Plato(String nombrePlato, Double cantCalorias) {
        this.nombrePlato = nombrePlato;
        this.cantCalorias = cantCalorias;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Double getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(Double cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
