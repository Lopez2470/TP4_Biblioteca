package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa el DataSource del Proyecto
 *
 */
public class ListaLibros implements Serializable {

    private List<Libro> libros;

    /*Constructor */
    public ListaLibros() {
        /* Se inicializa libros*/
        libros = new ArrayList<>();
        /* Se crean objetos tipo libro */
        libros.add(new Libro("10000", 11111, "El Titulo 001", "Autor1001", "Drama", new Date(117, 05, 06), 201, "Edit1"));
        libros.add(new Libro("20000", 22222, "zl Titulo 002", "Autor1002", "Comedia", new Date(115, 06, 11), 202, "Edit1"));
        libros.add(new Libro("30000", 33333, "gl Titulo 003", "Autor1003", "CienciaF", new Date(106, 00, 06), 203, "Edit1"));
        libros.add(new Libro("40000", 44444, "Sl Titulo 004", "Autor1004", "Matematica", new Date(90, 11, 26), 204, "Edit1"));
        libros.add(new Libro("50000", 55555, "Kl Titulo 005", "Autor1005", "Historia", new Date(101, 02, 28), 205, "Edit1"));
        libros.add(new Libro("60000", 66666, "El Titulo 006", "Autor1006", "Historia", new Date(89, 01, 26), 206, "Edit1"));
        libros.add(new Libro("70000", 77777, "Zl Titulo 007", "Autor1007", "Filosifia", new Date(117, 10, 04), 207, "Edit1"));
        libros.add(new Libro("80000", 88888, "al Titulo 008", "Autor1008", "Drama", new Date(114, 03, 30), 208, "Edit1"));
        libros.add(new Libro("10000", 99999, "kl Titulo 009", "Autor1009", "Drama", new Date(93, 06, 29), 209, "Edit1"));
        libros.add(new Libro("11000", 10101, "Eel Titulo 010", "Autor1010", "Matematica", new Date(111, 11, 01), 210, "Edit1"));
        libros.add(new Libro("12000", 11011, "zl Titulo 011", "Autor1011", "Poesia", new Date(92, 06, 06), 211, "Edit1"));
        libros.add(new Libro("13000", 12012, "Gl Titulo 012", "Autor102", "Novela", new Date(118, 9, 04), 212, "Edit1"));
        libros.add(new Libro("14000", 13013, "kkl Titulo 013", "Autor1013", "Historia", new Date(107, 10, 29), 213, "Edit1"));
        libros.add(new Libro("15000", 14014, "Al Titulo 014", "Autor104", "CienciaF", new Date(100, 8, 30), 214, "Edit1"));
        libros.add(new Libro("16000", 15015, "fl Titulo 015", "Autor1015", "Geografia", new Date(117, 11, 30), 215, "Edit1"));
        libros.add(new Libro("17000", 16016, "Fl Titulo 016", "Autor1016", "Ingles", new Date(112, 04, 30), 216, "Edit1"));
        libros.add(new Libro("18000", 17017, "dl Titulo 017", "Autor1017", "Drama", new Date(118, 9, 06), 217, "Edit1"));
    }

    /* Metodo por el cual se agrega un objeto Libro que viene como parametro (libro)
    * a la Lista de Libros
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /* Metodo por el cual se agrega un objeto Libro que viene como parametro (libro)
    * de la Lista de Libros
     */
    public void eliminarLibro(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(libro.getCodigo())) {
                libros.remove(i);
            }
        }

    }

    /* Metodo por el cual se modifica un objeto Libro que viene como parametro (libro)
    * de la Lista de Libros
     */
    public void modificarLibro(Libro libro) {
        for (Libro lib : libros) {
            if (lib.getCodigo().equals(libro.getCodigo())) {
                lib = libro;
            }
        }
    }

    /* Metodo por el cual se lista todos los objetos Libro 
    * de la Lista de Libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
