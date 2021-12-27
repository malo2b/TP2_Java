package com.ex2;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Anagramme {

     /**
     * Méthode static qui retourne tous les anagrammes présent dans le fichier a partir du moment ou il y en a plus qu'un nombre défini
     * @param fileName Chemin du et nom du fichier
     * @param nbMinAnagrammes Nombre minimum d'anagrammes
     */
    public static void printAnagrammes(String fileName, int nbMinAnagrammes) {
        try {
            Scanner scan = new Scanner(new File(fileName));
            ListMultimap<Integer, Mot> mots = ArrayListMultimap.create();
            ListMultimap<String, String> anagrammes = ArrayListMultimap.create();
            int maxLength = 0;
            Mot mot;
            while (scan.hasNext()) {
                mot = new Mot(scan.next());
                mots.put(mot.length(), mot);
                if (mot.length() > maxLength)
                    maxLength = mot.length();
            }
            for (int i = maxLength; i > 0; i--) { // Pour chacune des longueurs de mots
                for (Mot m: mots.get(i)) { // Pour chacun des mots verification si possède des anagrammes
                    anagrammes.put(m.getMotTrie(), m.getMot());
                }
            }
            for (String motTrie : anagrammes.keySet()) {
                if (anagrammes.get(motTrie).size() >= 8) {
                    System.out.println(anagrammes.get(motTrie).size() + "\t" + anagrammes.get(motTrie));
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Le fichier n'a pas ete trouve...");
        }
    }
}
