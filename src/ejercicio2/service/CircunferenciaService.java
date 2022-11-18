package ejercicio2.service;

import ejercicio2.entidades.Circunferencia;

import java.util.Scanner;

public class CircunferenciaService {
    private Scanner sc = new Scanner(System.in);

    public CircunferenciaService() {
    }

    public Circunferencia creaCircunferencia() {
        System.out.println("Ingrese radio");
        return new Circunferencia(sc.nextDouble());
    }

    public void mostraResultados(Circunferencia circunferencia) {
        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Area: " + circunferencia.area());
        System.out.println("Perimetro: " + circunferencia.perimetro());
    }


}
