package fr.maximo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Maximo {

    public static void main(String[] args) {
    char[]tab;
    char[]tabmelange;
    char[]propositionTab;
    tab = tirerMotAleatoirement();
    System.out.println("Le mot a  deviner est : ");
    tabmelange = melancheur(tab);
    Scanner s = new Scanner(System.in);
    String proposition;
    afficher(tabmelange);
    tab = tirerMotAleatoirement();
    System.out.println(tab);

        do {
            System.out.println("Veuillez saisir une proposition : ");
            proposition = s.nextLine();
            propositionTab = proposition.toCharArray();
            if (bonnesLettres(tabmelange, propositionTab) ) {
                System.out.println("Votre mot utilise pas les bonne lettre!");
            }
            if (!LeDico(propositionTab) ) {
                System.out.println("Votre mot n'est pas dans le dictionnaire!");
            }
        } while (!LeDico(propositionTab) || !bonnesLettres(tabmelange, propositionTab));
        System.out.println("Vous avez gagner!");
        System.out.println("votre mot est : " + proposition);
        System.out.println("le mots d'origine etait : ");
        afficher(tab);
        System.out.println("Vous avez trouve le mot en " + nbEssais(propositionTab, tabmelange) + " essais");

    }

    private static int nbEssais(char[] propositionTab, char[] tabmelange) {
        int nbEssais = 0;
        for (int i = 0; i < propositionTab.length; i++) {
            if (propositionTab[i] == tabmelange[i]) {
                nbEssais++;
            }
        }
        return nbEssais;
    }

    private static char[] tirerMotAleatoirement() {
        char[] tab = new char[30];
        try (FileInputStream fichier = new FileInputStream("./src/dictionnaire.txt"); Scanner s = new Scanner(fichier)) {
            BufferedReader reader = new BufferedReader(new FileReader("./src/dictionnaire.txt"));
            int length = 0;
            while (reader.readLine() != null) length++;
            reader.close();

            Random r = new Random();
            int low = 1;
            int high = length;
            int result = r.nextInt(high - low) + low;
            int i = 0;
            while (s.hasNextLine() && i < result) {
                tab = s.nextLine().toUpperCase().toCharArray();
                i++;
            }
            System.out.println("Fichier lu integralement avec succes");
        } catch (IOException e) {
            System.out.println("Lecture impossible");
        } finally {
            return tab;
        }
    }

    private static char[] melancheur(char[] t) {
        char[] t2 = new char[30];
        for (int i = 0; i < t.length; i++) {
            t2[i] = t[i];
        }
        for (int i = 0; i < t.length; i++) {
            int r = (int) (Math.random() * t.length);
            char temp = t2[i];
            t2[i] = t2[r];
            t2[r] = temp;
        }
        return t2;
    }

    public static void afficher(char[] t) {
        for (char c : t) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static boolean bonnesLettres(char[] tirage, char[] proposition) {
        boolean result = true;
        char[] temp = new char[tirage.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = tirage[i];
        }

        for (int i = 0; i < proposition.length; i++) {
            int j = 0;
            while (j < temp.length && Character.toUpperCase(proposition[i]) != temp[j]) {
                j++;
            }
            if (j == temp.length) {
                result = false;
            } else {
            }
            //temp[j] = '&';
        }
        return result;
    }

    public static boolean LeDico(char[] proposition) {
        boolean result = true;
        try (FileInputStream fichier = new FileInputStream("./src/dictionnaire.txt");
             Scanner s = new Scanner(fichier)) {

            for (int i = 0; i < proposition.length; i++) {
                proposition[i] = Character.toUpperCase(proposition[i]);
            }
            BufferedReader reader = new BufferedReader(new FileReader("./src/dictionnaire.txt"));
            int line = 0;
            while (reader.readLine() != null) line++;
            reader.close();

            char[] t = new char[30];
            int i = 0;
            while (s.hasNextLine() && i < line) {
                t = s.nextLine().toUpperCase().toCharArray();
                if (Arrays.equals(proposition, t)) {
                    result = true;
                    break;
                }
                i++;
            }

        } catch (IOException e) {
            System.out.println("Lecture impossible");
        }
        return result;
    }
}