package ejercicio3.app;

import ejercicio3.entidad.Operacion;
import ejercicio3.services.OperacionServices;

public class Main {
    public static void main(String[] args) {
        OperacionServices os = new OperacionServices();
        Operacion operacion = os.crearOperacion();

        System.out.println("Resultados...");
        os.sumar(operacion);
        os.restar(operacion);
        os.multiplicar(operacion);
        os.dividir(operacion);

    }
}
