package gestor;

import java.util.ArrayList;
import java.util.List;
import modelo.Libro;
import modelo.Cliente;
import modelo.Autor;


public class Libreria {
    private List<Libro> catalogoLibros;

    public Libreria() {
        this.catalogoLibros = new ArrayList<>();
    }

    // Con este método vamos a gregar nuevos libros
    public void agregarLibro(Libro libro) {
        this.catalogoLibros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' fue agregado al catalogo.");
    }

    // Metodo para buscar ya sea por titulo o autor
    public Libro buscarLibro(String terminoBusqueda) {
        for (Libro libro : catalogoLibros) {
            if (libro.getTitulo().equalsIgnoreCase(terminoBusqueda)) {
                return libro;
            }
            for (Autor autor : libro.getAutores()) {
                if (autor.getNombre().equalsIgnoreCase(terminoBusqueda)) {
                    return libro;
                }
            }
        }
        return null; 
    }

    // el método para vender libros
    public void venderLibro(Libro libro, Cliente cliente) {
        if (catalogoLibros.contains(libro)) {
            cliente.agregarLibroComprado(libro);
            catalogoLibros.remove(libro);
            System.out.println("Venta realizada con exito: '" + libro.getTitulo() + "' ha sido vendido a " + cliente.getNombre() + ".");
        } else {
            System.out.println("Error: El libro '" + libro.getTitulo() + "' no se encuentra disponible en el catálogo.");
        }
    }
}