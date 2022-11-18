package ejercicio5.services;

import ejercicio4.entidad.Rectangulo;
import ejercicio5.entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaService {
    private Scanner sc = new Scanner(System.in);
    private Double interesMaximoExtraccion;


    public CuentaBancariaService() {
        this.interesMaximoExtraccion = 0.2;
    }

    public CuentaBancaria creaCuenta() {
        CuentaBancaria cb = new CuentaBancaria();

        System.out.println("Ingresa nº Cuenta: ");
        cb.setNroCuenta(sc.nextInt());

        System.out.println("Ingresa DNI: ");
        cb.setDni(sc.nextLong());

        System.out.println("Ingresa saldo: ");
        cb.setSaldo(sc.nextDouble());

        System.out.println("Ingresa interes de extraccion: ");
        cb.setInteresExtraccion(sc.nextDouble());

        return cb;
    }

    public void ingresa(CuentaBancaria cb, Double cantidad) {
        if (cantidad > 0) {
            cb.setSaldo(cb.getSaldo() + cantidad);
        }
        System.out.println("Se ingreso a su cuenta $" + cantidad);
    }

    public void retira(CuentaBancaria cb, Double cantidad) {

        if (cantidad > 0.0) {

            if (cb.getSaldo() - cantidad < 0.0) {
                System.out.println("Se retiro $" + cb.getSaldo());
                cb.setSaldo(0.0);

            } else {
                cb.setSaldo(cb.getSaldo() - cantidad);
                System.out.println("Se retiro $" + cantidad);
            }
        }
    }

    public void extraccionRapida(CuentaBancaria cb) {
        Double cantidaExtraida;

        System.out.println("Se realizara extraccion rapida");
        if (cb.getInteresExtraccion() > interesMaximoExtraccion) {
            cantidaExtraida = cb.getSaldo() * interesMaximoExtraccion;
            System.out.println("**Solo se puede sacar hasta 20% en extraccion rapida, se extraera $" + cantidaExtraida);
        } else {
            cantidaExtraida = cb.getSaldo() * cb.getInteresExtraccion();
        }
        this.retira(cb, cantidaExtraida);

    }

    public void consultaSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo es: " + cb.getSaldo());
    }

    public void consultaDatos(CuentaBancaria cb) {
        System.out.println("Datos...");
        System.out.println("Nº Cuenta: " + cb.getNroCuenta());
        System.out.println("DNI: " + cb.getDni());
        System.out.println("Interes de extraccion: " + cb.getInteresExtraccion());
        System.out.println("*Porcentaje de extraccion maxima es " + interesMaximoExtraccion);
    }


}
