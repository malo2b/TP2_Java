package com.ex3;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListSorted extends AbstractList<Integer> {


    private final ArrayList<Integer> data;

    public ArrayListSorted() {
        data = new ArrayList<>();
        data.add(2);
        data.add(4);
    }

    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public Integer get(int index) {
        return data.get(index);
    }

    /**
     * Ajoute une nouvelle valeur dans l'ordre croissant
     * @param value Valeur a ajouter
     */
    public void add(int value) {
        int lenData = data.size();
        int i = 0;
        while (i < lenData && data.get(i) < value)
            i++;
        data.add(i, value);
    }

    /**
     * Redéfinit une valeur de la liste
     * @param index Indice de la valeur
     * @param value Nouvelle valeur
     */
    public void set(int index, int value) {
        data.set(index, value);
    }

    /**
     * @return taille de la liste
     */
    @Override
    public int size() {
        return data.size();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
