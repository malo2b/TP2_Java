package com.ex2;

import java.util.Arrays;

public class Mot {

    private final String mot;
    private String motTrie;

    public Mot(String val) {
        this.mot = val;
        sortMot();
    }

    private void sortMot() {
        char[] tempArray = mot.toCharArray();
        Arrays.sort(tempArray);
        motTrie = new String(tempArray);
    }

    public int length() {
        return mot.length();
    }

    public String getMot() {
        return mot;
    }

    public String getMotTrie() {
        return motTrie;
    }

    @Override
    public String toString() {
        return "{mot='" + mot + '\'' +
                ", motTrie='" + motTrie + '\'' +
                '}';
    }
}
