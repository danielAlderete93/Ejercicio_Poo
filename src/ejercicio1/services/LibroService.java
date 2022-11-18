package ejercicio1.services;

import ejercicio1.entidades.Libro;

import java.util.Scanner;

public class LibroService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public LibroService() {
    }

    public Libro cargaLibro() {
        Libro libro = new Libro();

        System.out.println("Cargando Libro... Ingrese:");

        System.out.println("ISBN: ");
        libro.setIsbn(sc.nextInt());

        System.out.println("Titulo: ");
        libro.setTitulo(sc.next());

        System.out.println("Autor: ");
        libro.setAutor(sc.next());

        System.out.println("Nros Paginas: ");
        libro.setCantPaginas(sc.nextInt());

        return libro;
    }

    public void mostraLibro(Libro libro) {
        System.out.println("Mostrando libro...");
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("nº paginas: " + libro.getCantPaginas());
    }
}
