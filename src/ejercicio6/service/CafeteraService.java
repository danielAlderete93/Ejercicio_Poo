package ejercicio6.service;

import ejercicio6.entidad.Cafetera;

import java.util.Scanner;

public class CafeteraService {
    private Scanner sc = new Scanner(System.in);

    public CafeteraService() {
    }


    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantActual(cafetera.getCapMaxima());
    }

    public void serviTaza(Integer capVaso, Cafetera cafetera) {
        if (this.puedeLlenarVaso(capVaso, cafetera)) {
            cafetera.setCantActual(capVaso);
            System.out.println("Se lleno el vaso de " + capVaso);
        } else {
            System.out.println("No se pudo llenar el vaso, se relleno con " + cafetera.getCantActual());
            this.vaciarCafetera(cafetera);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantActual(0);
    }

    public void agregaCafe(Cafetera cafetera) {
        Integer cantCafeUsuario;
        System.out.println("Ingreser cantidad de cafe: ");
        cantCafeUsuario = sc.nextInt();

        if (this.superaCapMaxima(cantCafeUsuario, cafetera)) {
            this.llenarCafetera(cafetera);
            System.out.println("Supero la cantidad de la cafetera, se la lleno a la cap maxima " + cafetera.getCapMaxima());
        } else {
            cafetera.setCantActual(cantCafeUsuario + cafetera.getCantActual());
            System.out.println("La capacidad nueva de la cafetera es ahora de "+ cafetera.getCantActual());
        }
    }

    private Boolean puedeLlenarVaso(Integer cantVaso, Cafetera cafetera) {
        return cafetera.getCantActual() - cantVaso >= 0;
    }

    private Boolean superaCapMaxima(Integer cantCafeAgregar, Cafetera cafetera) {
        return cantCafeAgregar + cafetera.getCantActual() >= cafetera.getCapMaxima();
    }
}
