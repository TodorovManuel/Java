public class Barrio extends Lugar{
    private Integer poblation;

    public Barrio(Integer poblation) {
        this.poblation = poblation;
    }

    public Integer getPoblation() {
            return poblation;
    }

    public void setPoblation(Integer poblation) {
        this.poblation = poblation;
    }
}
