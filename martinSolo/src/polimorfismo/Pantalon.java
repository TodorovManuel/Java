package polimorfismo;

public class Pantalon extends Prenda{
    private Float medidaCintura;
    private Float medidaCadera;
    private Float medidaLargo;

    public Pantalon(String color, Material material, String marca, Boolean estado, Float medidaCintura, Float medidaCadera, Float medidaLargo) {
        super(color, material, marca, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.medidaLargo = medidaLargo;
    }

    public Float getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(Float medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public Float getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(Float medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public Float getMedidaLargo() {
        return medidaLargo;
    }

    public void setMedidaLargo(Float medidaLargo) {
        this.medidaLargo = medidaLargo;
    }

    @Override
    public void prestar() {
        if(getEstado().equals(true)) {
            System.out.println("Te lo presto rey (propiedad de steinfeld)");
        } else {
            System.out.println("No te lo puedo prestar porque tiene caca(propiedad de pulvi)");
        }
    }
}
