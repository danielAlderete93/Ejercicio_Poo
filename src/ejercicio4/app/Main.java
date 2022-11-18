package ejercicio4.app;

import ejercicio4.entidad.Rectangulo;
import ejercicio4.service.RectanguloService;

public class Main {
    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo rectangulo = rs.creaRectangulo();

        System.out.println("Perimetro: "+rs.perimetro(rectangulo));
        System.out.println("Superficie: "+rs.superficie(rectangulo));

        rs.dibujaRectangulo(rectangulo);


    }
}
