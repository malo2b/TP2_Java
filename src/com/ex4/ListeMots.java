package com.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ListeMots {

    private final ArrayList<String> mots;

    public ListeMots() {
        mots = new ArrayList<>();
        mots.add("poisson");
        mots.add("azerty");
        mots.add("wagon");
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
        Collections.reverse(mots);
        return mots;
    }

    @Override
    public String toString() {
        return "ListeMots { \n" +
                "args avant tri:" + getMots() + "\n" +
                "tri lexico:" + getMotsLexico() + "\n" +
                "tri militaire:" + "\n" +
                "tri inverse lexico:" + getMotsInvLexico() + "\n" +
                " } ";
    }
}
