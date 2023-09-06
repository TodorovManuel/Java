package biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private GeneroLibro genero;
    private String nombrePdf;
    private Integer descargasDisponibles;

    public Libro(String titulo, Autor autor, GeneroLibro genero, String nombrePdf, Integer descargasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nombrePdf = nombrePdf;
        this.descargasDisponibles = descargasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public GeneroLibro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLibro genero) {
        this.genero = genero;
    }

    public String getNombrePdf() {
        return nombrePdf;
    }

    public void setNombrePdf(String nombrePdf) {
        this.nombrePdf = nombrePdf;
    }

    public Integer getDescargasDisponibles() {
        return descargasDisponibles;
    }

    public void setDescargasDisponibles(Integer descargasDisponibles) {
        this.descargasDisponibles = descargasDisponibles;
    }
}
