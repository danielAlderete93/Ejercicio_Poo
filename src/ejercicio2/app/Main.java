package ejercicio2.app;

import ejercicio2.entidades.Circunferencia;
import ejercicio2.service.CircunferenciaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia circulo = cs.creaCircunferencia();

        cs.mostraResultados(circulo);


    }


}
