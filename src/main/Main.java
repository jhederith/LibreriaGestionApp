package main;

import modelo.*;
import gestor.Libreria;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos loa autores y sus nacionalidades 
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("J.K. Rowling", "Británica");
        Autor autor3 = new Autor("Isaac Asimov", "Rusa/Estadounidense");
        Autor autor4 = new Autor("Nicolás Maquiavelo", "Italiana");

        // Creamos la liste de autores
        List<Autor> autores1 = List.of(autor1);
        List<Autor> autores2 = List.of(autor2);
        List<Autor> autores3 = List.of(autor3);
        List<Autor> autores4 = List.of(autor4);
        
        // Creamos los libros de texto y las novelas 
        Libro libro1 = new Novela("El amor en los tiempos del colera", "978-0307389732", 28.99, 1985, autores1, "Romance");
        Libro libro2 = new LibroDeTexto("Harry Potter y la piedra filosofal", "978-0987654321", 35.50, 1997, autores2, "Secundaria");
        Libro libro3 = new Novela("Fundación", "978-0451524935", 40.00, 1951, autores3, "Ciencia ficción");
        Libro libro4 = new LibroDeTexto("Robótica Moderna", "978-0451526787", 55.00, 1986, autores3, "Universidad");
        Libro libro5 = new LibroDeTexto("El Príncipe", "978-0140449150", 30.00, 1532, autores4, "Ciencia Política");
        Libro libro6 = new LibroDeTexto("Discursos sobre la primera década de Tito Livio", "978-0199535699", 32.50, 1531, autores4, "Filosofía Política");
        
        // Creamos los clientes
        Cliente cliente1 = new Cliente("Omar Al-Farid", "SAU52689");
        Cliente cliente2 = new Cliente("Jean Dupont", "FR894518");
        Cliente cliente3 = new Cliente("Hans Müller", "DE867542");
        Cliente cliente4 = new Cliente("Carlos Rodríguez", "CO568917");

        // Hacemos la creación de la librería
        Libreria libreria = new Libreria();
        
        // Agregamos los líbros al catálogo
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);
        libreria.agregarLibro(libro4);
        libreria.agregarLibro(libro5);
        libreria.agregarLibro(libro6);
        
        // Hacemos la búsqueda de los libros
        System.out.println("=== Búsqueda de libros ===");
        Libro libroEncontrado = libreria.buscarLibro("Fundación");
        if (libroEncontrado != null) {
            System.out.println("Encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
        
        // Hacemos la venta de los libros
        System.out.println("\n=== Venta de libros ===");
        libreria.venderLibro(libro3, cliente1);
        libreria.venderLibro(libro5, cliente2);
        libreria.venderLibro(libro1, cliente3);
        libreria.venderLibro(libro4, cliente4);
        
        // Mostramps los libros comprados 
        System.out.println("\n=== Libros comprados por clientes ===");
        mostrarCompras(cliente1);
        mostrarCompras(cliente2);
        mostrarCompras(cliente3);
        mostrarCompras(cliente4);
    }

    // Metodo para mostrar las compras de los clientes
    private static void mostrarCompras(Cliente cliente) {
        System.out.println(cliente.getNombre() + " (" + cliente.getId() + ") ha comprado:");
        for (Libro libro : cliente.getLibrosComprados()) {
            System.out.println("- " + libro.getTitulo());
        }
        System.out.println();
    }
}