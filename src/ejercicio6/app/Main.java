package ejercicio6.app;

import ejercicio6.entidad.Cafetera;
import ejercicio6.service.CafeteraService;

public class Main {
    public static void main(String[] args) {
        CafeteraService cs = new CafeteraService();
        Cafetera cafetera = new Cafetera(1000,0);

        cs.llenarCafetera(cafetera);

        cs.serviTaza(900,cafetera);

        cs.serviTaza(100,cafetera);

        cs.agregaCafe(cafetera);

        cs.serviTaza(300,cafetera);
    }


}
