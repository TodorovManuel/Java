public class Plato {
    private String nombrePlato;
    private Double precioPlato;

    public Plato(String nombrePlato, Double precioPlato) {
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Double getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(Double precioPlato) {
        this.precioPlato = precioPlato;
    }
}
