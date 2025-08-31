package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String id;
    private List<Libro> librosComprados;

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosComprados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Libro> getLibrosComprados() {
        return librosComprados;
    }

    public void agregarLibroComprado(Libro libro) {
        this.librosComprados.add(libro);
    }
}
