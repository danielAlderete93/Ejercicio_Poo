package ejercicio7.service;

import ejercicio7.entidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {
    private Scanner sc = new Scanner(System.in);
    private final Integer IMC_MIN_IDEAL = 20;
    private final Integer IMC_MAX_IDEAL = 25;
    private final Integer EDAD_MAYOR_EDAD = 18;

    private Integer cantPersonas = 0;
    private Integer cantConSobrepeso = 0;
    private Integer cantConPesoMenorIdeal = 0;
    private Integer cantConPesoIdeal = 0;
    private Integer cantMayores = 0;
    private Integer cantMenores = 0;


    private void registraPersona(Persona persona) {
        if (this.esMayorDeEdad(persona)) {
            this.cantMayores += 1;
        } else {
            this.cantMenores += 1;
        }
        switch (this.calculaIMC(persona)) {
            case -1 -> this.cantConPesoMenorIdeal += 1;
            case 0 -> this.cantConPesoIdeal += 1;
            case 1 -> this.cantConSobrepeso += 1;
        }
        this.cantPersonas += 1;
    }


    private Double getIMC(Persona persona) {
        return persona.getPeso() / Math.pow(persona.getAltura(), 2);
    }

    public Persona creaPersona() {
        Persona persona = new Persona();

        System.out.println("Generando persona...");

        System.out.println("Ingrese nombre: ");
        persona.setNombre(sc.nextLine());

        System.out.println("Ingrese edad: ");
        persona.setEdad(sc.nextInt());

        System.out.println("Ingrese sexo('H' hombre, 'M' mujer, 'O' otro): ");
        persona.setSexo(sc.next().charAt(0));

        System.out.println("Ingrese peso: ");
        persona.setPeso(sc.nextDouble());

        System.out.println("Ingrese altura: ");
        persona.setAltura(sc.nextDouble());

        this.registraPersona(persona);

        return persona;
    }

    public Integer calculaIMC(Persona persona) {
        if (getIMC(persona) < IMC_MIN_IDEAL) {
            return -1;
        }
        if (getIMC(persona) > IMC_MAX_IDEAL) {
            return 1;
        }
        return 0;
    }

    public Boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= EDAD_MAYOR_EDAD;
    }


    public void mostraPorcentaje() {
        System.out.println("***********************Porcentaje*********************");
        System.out.println("Mayores edad:" + (this.cantMayores*100/this.cantPersonas)+"%");
        System.out.println("Menores edad:" + (this.cantMenores*100/this.cantPersonas)+"%");

        System.out.println("Con sobrepeso:" + (this.cantConSobrepeso*100/this.cantPersonas)+"%");
        System.out.println("Con peso ideal:" + (this.cantConPesoIdeal*100/this.cantPersonas)+"%");
        System.out.println("Con peso menor al ideal:" + (this.cantConPesoMenorIdeal*100/this.cantPersonas)+"%");
    }

    public void mostraPersona(Persona persona) {

        System.out.println("********************************************");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Altura: " + persona.getAltura());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Mayor edad? " + msgEdad(persona));
        System.out.println("Tipo de peso: " + msgTipoPeso(persona));
    }

    private String msgEdad(Persona persona) {
        return this.esMayorDeEdad(persona) ? "Si" : "NO";
    }

    private String msgTipoPeso(Persona persona) {
        if (calculaIMC(persona).equals(0)) {
            return "Ideal";
        }
        if (calculaIMC(persona).equals(-1)) {
            return "Peso por debajo del ideal";
        }
        return "Sobrepeso";

    }


}
