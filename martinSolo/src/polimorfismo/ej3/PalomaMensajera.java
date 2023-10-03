package polimorfismo.ej3;

public class PalomaMensajera implements Mensajeria{
    private Boolean aprendio;

    public PalomaMensajera(String josefa, Boolean aprendio) {
        this.aprendio = aprendio;
    }

    public Boolean getAprendio() {
        return aprendio;
    }

    public void setAprendio(Boolean aprendio) {
        this.aprendio = aprendio;
    }

    @Override
    public void enviarMensaje(String mensaje) {

    }
}
