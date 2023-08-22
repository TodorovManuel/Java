package mascotas;

public class Pez extends Mascota{
    private Integer vidas = 10;

    public Pez( Integer vidas) {
        super("");
        this.vidas = vidas;
    }

    public Pez(String nombre, Duenio duenio, Integer vidas) {
        super(nombre, duenio);
        this.vidas = vidas;
    }



    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }


    @Override
    public void saludar(Boolean esDuenio) {

    }
}
