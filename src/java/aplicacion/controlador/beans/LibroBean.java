
package aplicacion.controlador.beans;

import aplicacion.dao.ILibroDAO;
import aplicacion.dao.imp.LibroListDAOImp;
import aplicacion.modelo.dominio.Libro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *  
 * Bean Administrado
 */
@ManagedBean
@ViewScoped
public class LibroBean {

    private ILibroDAO libroDao;
    
    /**
     * Creates a new instance of LibroBean
     */
    public LibroBean() {
        /* Se instancia libroDao*/
        libroDao = new LibroListDAOImp();
    }
    
    /*Se lista todos los metodos para que el Bean los maneje con la vista*/
    public List<Libro> obtenerLibros(){
    return libroDao.obtener();
    }

    public void agregarLibro(Libro nuevoLibro){
    libroDao.crear(nuevoLibro);
    }
       
    public void elminarLibro(Libro libro){
        libroDao.eliminar(libro);
    }    
    
    /*Getter y Setters*/
    public ILibroDAO getLibroDao() {
        return libroDao;
    }

    public void setLibroDao(ILibroDAO libroDao) {
        this.libroDao = libroDao;
    }


    
    
    
    
    
    
    
}
