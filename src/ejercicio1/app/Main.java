package ejercicio1.app;

import ejercicio1.entidades.Libro;
import ejercicio1.services.LibroService;

public class Main {
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        System.out.println("*******************Cargando libro**********************");
        Libro libro = ls.cargaLibro();

        System.out.println("*******************Mostrando**********************");

        ls.mostraLibro(libro);

    }
}