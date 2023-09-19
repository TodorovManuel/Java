package polimorfismo;

public class Remera extends Prenda{
    private Float medidaEspalda;
    private Float medidaContorno;
    private Float largoTorso;

    public Remera(String color, Material material, String marca, Boolean estado, Float medidaEspalda, Float medidaContorno, Float largoTorso) {

        super(color, material, marca, estado);
        this.medidaEspalda = medidaEspalda;
        this.medidaContorno = medidaContorno;
        this.largoTorso = largoTorso;
    }

    public Float getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(Float medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public Float getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(Float medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public Float getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(Float largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public void prestar() {
        if(getEstado().equals(true)) {
            System.out.println("Te lo presto rey (propiedad de Bianca)");
        } else {
            System.out.println("No te lo puedo prestar porque tiene caca(propiedad de Natalia)");
        }
    }
}
