package ejercicio1.app;

import ejercicio1.entidades.Libro;
import ejercicio1.services.LibroService;
/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
* */
public class Main {
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        System.out.println("*******************Cargando libro**********************");
        Libro libro = ls.cargaLibro();

        System.out.println("*******************Mostrando**********************");

        ls.mostraLibro(libro);

    }
}