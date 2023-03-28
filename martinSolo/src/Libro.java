public class Libro {
    private String titulo;
    private int isbn;
    private int cantPaginas;
    private String editorial;
    private Persona autor;
    private Fecha publicacion;

    public Libro(){
        this.isbn = 2014;
        this.autor.setNombre("Elbicho");
        this.titulo = "Martin el viajero";
        this.cantPaginas = 277;
        this.editorial="El clasico";
        this.publicacion.diasMes(1);
    }
    public Libro(int isbn, int cantPaginas, String editorial) {
        this.isbn = isbn;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
    }

    public Libro(String titulo, int isbn, int cantPaginas, String editorial, Persona autor, Fecha publicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public Fecha getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Fecha publicacion) {
        this.publicacion = publicacion;
    }

    public void libroNuevo(int dia, int mes, int anio) {
        publicacion.menorMayor(dia, mes, anio);
    }
    public String mostrarInfo(String titulo, int isbn, int cantPaginas, String editorial, Persona autor, Fecha publicacion) {
        System.out.println("El titulo es: " + titulo);
        System.out.println("El isbn es: " + isbn);
        System.out.println("La cantidad de paginas es: " + cantPaginas);
        System.out.println("La editorial es: " + editorial);
        System.out.println("El autor es: " + autor);
        System.out.println("La publicacion del libro fue en: " + publicacion);
        return titulo;
    }
}


