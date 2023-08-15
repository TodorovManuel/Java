package musica;

import persona.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion() {
        this.titulo="Si estuviesemos juntos";
       // this.autor= new persona.Persona("Duki", 27);
    }
    public Cancion(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
