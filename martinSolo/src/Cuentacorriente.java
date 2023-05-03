import java.util.ArrayList;

public class Cuentacorriente extends Cuenta{

    private ArrayList<Cheque>chequera;

    public Cuentacorriente() {
        super();
        this.chequera = new ArrayList<>();
    }

    public Cuentacorriente(Cliente titular, long CBU, long numeroCuenta, String alias, Double saldo, ArrayList<Cheque> chequera) {
        super(titular, CBU, numeroCuenta, alias, saldo);
        this.chequera = chequera;
    }

    public ArrayList<Cheque> getChequera() {
        return chequera;
    }

    public void setChequera(ArrayList<Cheque> chequera) {
        this.chequera = chequera;
    }

    @Override
    public String toString() {
        return "Cuentacorriente{" +
                "chequera=" + chequera +
                '}';
    }
}
