package polimorfismo.repaso1;

public class Club implements Contrato{
    private String nombreClub;

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    @Override
    public void contratar() {
        if()
    }

    @Override
    public void renovar() {

    }
}
