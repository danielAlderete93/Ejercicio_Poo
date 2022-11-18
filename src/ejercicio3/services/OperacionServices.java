package ejercicio3.services;

import ejercicio3.entidad.Operacion;

import java.util.Scanner;

public class OperacionServices {
    private Scanner sc = new Scanner(System.in);

    public OperacionServices() {
    }

    public Operacion crearOperacion() {
        Operacion operacion = new Operacion();

        System.out.println("Ingrese primer operador");
        operacion.setOperador1(sc.nextDouble());

        System.out.println("Ingrese segundo operador");
        operacion.setOperador2(sc.nextDouble());

        return operacion;
    }

    public void sumar(Operacion operacion){
        System.out.println(operacion.getOperador1()+" + "+operacion.getOperador2()+" = "+operacion.sumar());
    }
    public void restar(Operacion operacion){
        System.out.println(operacion.getOperador1()+" - "+operacion.getOperador2()+" = "+operacion.restar());
    }
    public void multiplicar(Operacion operacion){
        System.out.println(operacion.getOperador1()+" * "+operacion.getOperador2()+" = "+operacion.multiplicar());
    }
    public void dividir(Operacion operacion){
        if(operacion.getOperador2() != 0){
            System.out.println(operacion.getOperador1()+" / "+operacion.getOperador2()+" = "+operacion.dividir());
        }else{
            System.out.println("No se puede dividir por 0... Segundo operador es 0");
        }
    }
}
