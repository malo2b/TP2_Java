package com.ex3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayListSorted maListeTrie = new ArrayListSorted();
        Random r = new Random();
        for (int i = 0; i < 20; i++)
            maListeTrie.add(r.nextInt(1000));
        System.out.println(maListeTrie);
    }

}
