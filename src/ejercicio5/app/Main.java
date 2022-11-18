package ejercicio5.app;

import ejercicio5.entidades.CuentaBancaria;
import ejercicio5.services.CuentaBancariaService;

public class Main {
    public static void main(String[] args) {
        CuentaBancariaService cbs = new CuentaBancariaService();
        CuentaBancaria cb = cbs.creaCuenta();
        //Saldo 0
        cbs.consultaSaldo(cb);

        //Agrego 1000
        cbs.ingresa(cb, 1000.0);
        //800
        cbs.extraccionRapida(cb);

        cbs.retira(cb, 2000.0);

        cbs.consultaSaldo(cb);

        cbs.consultaDatos(cb);

    }
}
