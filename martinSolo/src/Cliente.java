public class Cliente extends Persona{
    private long CUIL;

    public Cliente() {
        super();
        this.CUIL = 123314123731l;
    }

    public Cliente(String nombre, String apellido, long CUIL) {
        super(nombre, apellido);
        this.CUIL = CUIL;
    }

    public long getCUIL() {
        return CUIL;
    }

    public void setCUIL(long CUIL) {
        this.CUIL = CUIL;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CUIL=" + CUIL +
                '}';
    }
}
