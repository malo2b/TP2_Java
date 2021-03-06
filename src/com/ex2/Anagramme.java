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
            Scanner scan = new Scanner(new File(fileName)); // Scan des mots dans fichier
            ListMultimap<String, String> anagrammes = ArrayListMultimap.create(); // K: mot-trié V: mots, K identique pour tout les anagrammes
            Mot mot;
            while (scan.hasNext()) {
                mot = new Mot(scan.next());
                anagrammes.put(mot.getMotTrie(), mot.getMot());
            }
            for (String motTrie : anagrammes.keySet()) { // Affichage
                if (anagrammes.get(motTrie).size() >= nbMinAnagrammes) {
                    System.out.println(anagrammes.get(motTrie).size() + "\t" + anagrammes.get(motTrie));
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Le fichier n'a pas ete trouve...");
        }
    }
}
