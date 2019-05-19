
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * 
 */
@ManagedBean
@ViewScoped

public class ABMLibrosFormsBeans implements Serializable {

    @ManagedProperty(value = "#{libroBean}") // Permite inyectar el bean 
    private LibroBean libroBean; //Bean administrado
    private Libro nuevoLibro;
    private List<Libro> libros;

    /**
     * Creates a new instance of ABMLibrosFormsBeans
     */
    public ABMLibrosFormsBeans() {
    }

    /* Permite instanciar el nuevo libro*/
    @PostConstruct
    public void init() {
        nuevoLibro = new Libro();
        generarLibros();
    }
/* Metodo que permite agregar todos los elementos del DataSource: ListaLibros a libros*/
    public void generarLibros() {
        libros = libroBean.obtenerLibros();
    }

    public void guardarNuevoLibro() {
        libroBean.agregarLibro(nuevoLibro);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Se registró el Nuevo Libro"));
        nuevoLibro = new Libro();
        generarLibros();
    }

    public void eliminarLibroSeleccionado(Libro libroABorrar) {
        libroBean.elminarLibro(libroABorrar);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Se eliminó el Libro Seleccionado"));
        generarLibros();
    }
    public void onRowEdit(RowEditEvent event) {
        Libro libroModificado = (Libro) event.getObject();
        libroBean.getLibroDao().modificar(libroModificado);
        FacesMessage msg = new FacesMessage("Exito", "Libro modificado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
        public void onRowEditCancel(RowEditEvent event) {
        
        FacesMessage msg = new FacesMessage("Edición Cancelada", "No se realizó ninguna modificación al Libro Seleccionado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    
    public LibroBean getLibroBean() {
        return libroBean;
    }

    public void setLibroBean(LibroBean libroBean) {
        this.libroBean = libroBean;
    }

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
