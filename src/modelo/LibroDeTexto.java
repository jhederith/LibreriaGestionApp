package modelo;

import java.util.List;

public class LibroDeTexto extends Libro {
    private String nivelEducativo;

    public LibroDeTexto(String titulo, String isbn, double precio, int anoPublicacion, List<Autor> autores, String nivelEducativo) {
        super(titulo, isbn, precio, anoPublicacion, autores);
        this.nivelEducativo = nivelEducativo;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }
}
