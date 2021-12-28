package com.ex5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Personne malo = new Personne("Girard", "Malo", 20);
        Personne francois = new Personne("Focardi", "Francois-philippe", 20);
        Personne pierrelouis = new Personne("Squaglia", "Pierre-louis", 20);
        Personne nicolas = new Personne("Ottavi", "Nicolas", 33);
        ArrayList<Personne> classe = new ArrayList<>();
        classe.add(malo);
        classe.add(francois);
        classe.add(pierrelouis);
        classe.add(nicolas);
        System.out.println(classe);
//        classe.sort();
    }

}

