package polimorfismo;

public class Libro extends Lectura{
    private Integer paginasCapitulo;

    public Libro(Integer paginasCapitulo) {
        super();
        this.paginasCapitulo = paginasCapitulo;
    }

    public Integer getPaginasCapitulo() {
        return paginasCapitulo;
    }

    public void setPaginasCapitulo(Integer paginasCapitulo) {
        this.paginasCapitulo = paginasCapitulo;
    }

    @Override
    public void prestar() {
        if(paginasCapitulo%2==0) {
            System.out.println("Te lo presto asi te nutris de conocimientos y podes saber como genovesi y mi recomendacion es que no publiques tu direccion en redes sociales!<3");
        } else {
            System.out.println("No te presto un carajo, no seguiste mi recomendacion y ademas tenes un citroen");
        }
    }

}