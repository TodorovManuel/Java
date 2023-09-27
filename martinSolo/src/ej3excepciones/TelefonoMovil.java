package ej3excepciones;

public class TelefonoMovil extends Dispositivo{
    private Compania compania;
    private int numeroTelefonico;

    public TelefonoMovil(int numeroSerie, String fabricante, String modelo, Compania compania, int numeroTelefonico) {
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroTelefonico = numeroTelefonico;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
}
