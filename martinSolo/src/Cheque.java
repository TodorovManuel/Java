public class Cheque {
    private Cliente emisor;
    private Cliente receptor;
    private double monto;

    public Cheque() {
        this.emisor = new Cliente();
        this.receptor = new Cliente();
        this.monto = 5000.00;
    }

    public Cheque(Cliente emisor, Cliente receptor, double monto) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.monto = monto;
    }

    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public Cliente getReceptor() {
        return receptor;
    }

    public void setReceptor(Cliente receptor) {
        this.receptor = receptor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "emisor=" + emisor +
                ", receptor=" + receptor +
                ", monto=" + monto +
                '}';
    }
}
