package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 * Representa el TransferObject del proyecto
 *
 */
public class Libro implements Serializable {

    private String codigo;
    private int isbn;
    private String titulo;
    private String autores;
    private String tematica;
    private Date fechaEdicion;
    private int cantPaginas;
    private String editorial;

    //Constructor sin parámetros
    public Libro() {
    }

    //Constructor con parámetros
    public Libro(String codigo, int isbn, String titulo, String autores, String tematica, Date fechaEdicion, int cantPaginas, String editorial) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.tematica = tematica;
        this.fechaEdicion = fechaEdicion;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
    }

    /* Metodos getters y setters*/
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
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

}
