package ejercicio4.service;

import ejercicio4.entidad.Rectangulo;

import java.util.Scanner;

public class RectanguloService {
    private Scanner sc = new Scanner(System.in);

    public RectanguloService() {
    }

    public Rectangulo creaRectangulo() {
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese base:");
        rectangulo.setBase(sc.nextInt());

        System.out.println("Ingrese altura:");
        rectangulo.setAltura(sc.nextInt());

        return rectangulo;
    }

    public void dibujaRectangulo(Rectangulo rectangulo) {
        System.out.println("Dibujando rectangulo...");
        for (int j = 0; j < rectangulo.getAltura(); j++) {
            for (int i = 0; i < rectangulo.getBase(); i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void mostraResultados(Rectangulo rectangulo) {
        System.out.println("Perimetro: " + rectangulo.perimetro());
        System.out.println("Superficie: " + rectangulo.superficie());
    }

}
