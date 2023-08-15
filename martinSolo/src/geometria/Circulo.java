package geometria;

public class Circulo extends FiguraGeometrica {
    private double radio = 2;

    public Circulo() {this.radio = 2;}

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        double area = 3.14 * radio * radio;
        return area;
    }

    public double permietro() {
        double perimetro = 2 * 3.14 * radio;
        return perimetro;
    }

}
