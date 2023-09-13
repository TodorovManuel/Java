package Bebidas;

public class Azucarada extends Bebida{
    private int cantidadAzucar;

    public Azucarada(String nombre, int coeficienteNegatividad, int cantidadAzucar) {
        super(nombre, 1);
        this.cantidadAzucar = cantidadAzucar;
        super.setCoeficienteNegatividad(calcularCoeficienteNegatividad());
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }


    public abstract int calcularCoeficienteNegatividad(){
        return this.cantidadAzucar
    };
}
