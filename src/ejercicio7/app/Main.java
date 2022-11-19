package ejercicio7.app;

import ejercicio7.entidades.Persona;
import ejercicio7.service.PersonaService;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        ArrayList<Persona> personaArrayList = new ArrayList<>();


        for (int i = 0; i <4 ; i++) {
            personaArrayList.add(ps.creaPersona());
        }

        personaArrayList.forEach(p -> ps.mostraPersona(p));

        ps.mostraPorcentaje();

    }
}
