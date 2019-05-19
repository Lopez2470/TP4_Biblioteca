package aplicacion.dao.imp;

import aplicacion.dao.ILibroDAO;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.util.ListaLibros;
import java.io.Serializable;
import java.util.List;

/**
 *
 * Representa el AccessDataObject del Proyecto
 */
public class LibroListDAOImp implements Serializable, ILibroDAO {
    private ListaLibros listaLibros = new ListaLibros();

    public LibroListDAOImp() {
    }

    /* Se implementan todos Metodos abstractos del Interface 
 * Se sobrescriben los cuerpos de los metodos abstractos de la Interface
     */

 /* Metodo que permite agregar un nuevo objeto Libro a la Lista de Libros*/
    @Override
    public void crear(Libro libro) {
        listaLibros.agregarLibro(libro);
    }

    /* Metodo que permite mostrar todos los objeto Libro de la Lista de Libros*/
    @Override
    public List<Libro> obtener() {
        return listaLibros.getLibros();
    }

    /* Metodo que permite modificar un  objeto Libro  existente en la Lista de Libros*/
    @Override
    public void modificar(Libro libro) {
        listaLibros.modificarLibro(libro);
    }

    /* Metodo que permite eliminar un objeto Libro de la Lista de Libros*/
    @Override
    public void eliminar(Libro libro) {
        listaLibros.eliminarLibro(libro);
    }

}
