package modelo;

import java.util.List;

public class Novela extends Libro {
    private String genero;
    
    public Novela(String titulo, String isbn, double precio, int anoPublicacion, List<Autor> autores, String genero) {
        super(titulo, isbn, precio, anoPublicacion, autores);
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
}