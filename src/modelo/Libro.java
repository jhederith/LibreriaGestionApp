package modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private double precio;
    private int anoPublicacion;
    private List<Autor> autores;

    // creamos el constructor
    public Libro(String titulo, String isbn, double precio, int anoPublicacion, List<Autor> autores) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
        this.anoPublicacion = anoPublicacion;
        this.autores = autores;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public List<Autor> getAutores() {
        return autores;
    }
}