public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area() {
        double area = base * altura;
        return area;
    }

    public double perimetro() {
        double perimetro = base * 2 + altura * 2;
        return perimetro;
    }
}
