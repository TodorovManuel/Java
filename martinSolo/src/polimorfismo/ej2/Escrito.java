package polimorfismo.ej2;

public class Escrito extends Prueba implements Aprobado{
    private static int duracionMaxima = 90;
    private int notaNumerica;

    public Escrito(int notaNumerica) {
        super();
        this.notaNumerica = notaNumerica;
    }

    public static int getDuracionMaxima() {
        return duracionMaxima;
    }

    public static void setDuracionMaxima(int duracionMaxima) {
        Escrito.duracionMaxima = duracionMaxima;
    }

    public int getNotaNumerica() {
        return notaNumerica;
    }

    public void setNotaNumerica(int notaNumerica) {
        this.notaNumerica = notaNumerica;
    }


    @Override
    boolean aprobo() {
        if(notaNumerica >= 6 && getDuracionMaxima() <= 90) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean aprobado() {
        if(notaNumerica >= 6 && getDuracionMaxima() <= 90) {
            return true;
        } else {
            return false;
        }
    }
}
