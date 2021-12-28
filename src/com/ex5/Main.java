package com.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Personne malo = new Personne("Girard", "Malo", 19);
        Personne francois = new Personne("Focardi", "Francois-philippe", 20);
        Personne pierrelouis = new Personne("Squaglia", "Pierre-louis", 20);
        Personne nicolas = new Personne("Ottavi", "Nicolas", 33);
        ArrayList<Personne> classe = new ArrayList<>();
        classe.add(pierrelouis);
        classe.add(nicolas);
        classe.add(malo);
        classe.add(francois);
        System.out.println(classe);
        Collections.sort(classe);
        System.out.println(classe);
    }

}

