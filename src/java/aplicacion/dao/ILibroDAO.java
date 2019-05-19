package aplicacion.dao;

import aplicacion.modelo.dominio.Libro;
import java.util.List;

/**
 * Representa la Interface DAO del proyecto
 */
public interface ILibroDAO {

 /* Solo se declaran los metodos a utilizar sin desarrollarolos*/
 /* metodo para dar de alta un Libro, a traves del objeto libro */
    public void crear(Libro libro);

    /* metodo para eliminar un Libro, a traves del objeto libro */
    public void eliminar(Libro libro);

    /* Metodo para modificar un libro */
    public void modificar(Libro libro);

    // metodo para listar todos los elementos de ListaLibro
    public List<Libro> obtener();

}
