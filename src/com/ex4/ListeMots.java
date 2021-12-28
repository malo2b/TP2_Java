package com.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ListeMots {

    private ArrayList<String> mots;

    public ListeMots() {
        mots = new ArrayList<>();
        mots.add("poisons");
        mots.add("poisson");
        mots.add("aaerty");
        mots.add("azerty");
        mots.add("wagon");
        mots.add("aagon");
        mots.add("aaerty");
    }

    public void addMot(String mot) {
        this.mots.add(mot);
    }

    // Avant tri
    public ArrayList<String> getMots() {
        return mots;
    }

    // Tri lexico
    public ArrayList<String> getMotsLexico() {
        return (ArrayList<String>) mots.stream().sorted().collect(Collectors.toList());
    }

    // Tri inv lexico
    public ArrayList<String> getMotsInvLexico() {
        mots = getMotsLexico();
        Collections.reverse(mots);
        return mots;
    }

    // Tri millitaire
    public ArrayList<String> getMotsOrMilitaire() {
        mots = getMotsLexico();
        mots.sort((a, b) -> {
            return Integer.compare(a.length(), b.length());
        });
        return mots;
    }


    @Override
    public String toString() {
        return "ListeMots { \n" +
                "args avant tri:" + getMots() + "\n" +
                "tri lexico:" + getMotsLexico() + "\n" +
                "tri militaire:" + getMotsOrMilitaire()  + "\n" +
                "tri inverse lexico:" + getMotsInvLexico() + "\n" +
                " } ";
    }
}
