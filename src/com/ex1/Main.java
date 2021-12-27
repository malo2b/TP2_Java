package com.ex1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws NotHeterogeneousTypeException {

        ArrayList<Generique<java.io.Serializable>> paires = new ArrayList<>();

        // Premiere paire
        System.out.println("[1] Instanciation de la premiere paire (int, double)");
        paires.add(new Generique<>(1, 2.1));
        System.out.println(paires.get(0));

        // Seconde paire
        System.out.println("[2] Tentative d'instanciation de la seconde paire (int, int)");
        try {
            paires.add(new Generique<>(1, 1));
        } catch (NotHeterogeneousTypeException e) {
            System.err.println(e);
        } finally { // Ajout du bloc finaly pour la démo et que la levée d'exception apparaisse au bon endroit dans la console
            System.out.println("[2] Instanciation de la seconde paire (int, null)");
            paires.add(new Generique<>(2));
            System.out.println(paires.get(1));
            System.out.println("[2] Tentative d'ajout d'un second élement type GregorianCalendar");
            paires.get(1).setAnElementValue(new GregorianCalendar());
            System.out.println(paires.get(1));
        }

        // Troisieme paire
        System.out.println("[3] Instanciation de la seconde paire");
        paires.add(new Generique<>());
        System.out.println("[3] ajout de deux valeurs (int, double)");
        paires.get(2).setElement1(42);
        paires.get(2).setElement2(3.6);
        System.out.println(paires.get(2));
        System.out.println("[3] Tentative d'ajout double a la place du int");
        try {
            paires.get(2).setElement1(3.2);
        } catch (NotHeterogeneousTypeException e) {
            System.err.println(e);
        }
    }
}
