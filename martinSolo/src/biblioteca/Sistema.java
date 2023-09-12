package biblioteca;

import java.util.HashSet;

public class Sistema {
    HashSet<Libro> libros;
    HashSet<Usuario> usuarios;

    public Sistema(HashSet<Libro> libros, HashSet<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public Sistema() {

    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        if(usuarios.contains(usuario)) {
            System.out.println("El usuario ya esta cargado");
        } else {
            usuarios.add(usuario);
        }
    }

    public void eliminarUsuario(Usuario usuario) {
        if(usuarios.contains(usuario)) {
            usuarios.remove(usuario);
        } else {
            System.out.println("El usuario no esta cargado");
        }
    }

    public void agregarLibro(Libro libro) {
        if(libros.contains(libro)) {
            System.out.println("El libro ya fue cargado");
        } else {
            libros.add(libro);
        }
    }

    public void eliminarLibro(Libro libro) {
        if(libros.contains(libro)) {
            libros.remove(libro);
        } else {
            System.out.println("El libro ya fue cargado");
        }
    }

    public static void limiteDePrestamos(Libro libro) throws LimiteDePrestamosAlcanzadoException{
        if(libro.getDescargasDisponibles().equals(0)) {
            throw new LimiteDePrestamosAlcanzadoException("El limite de descargas ha sido alzanzado");
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Libro henry = new Libro("Henry pointer", GeneroLibro.SAGA, "HenryPointer.pdf", 0);
        sistema.agregarLibro(henry);
        try {
            limiteDePrestamos(henry);
        }
        catch (LimiteDePrestamosAlcanzadoException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}