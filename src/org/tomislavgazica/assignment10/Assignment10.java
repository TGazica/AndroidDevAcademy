package org.tomislavgazica.assignment10;

import java.util.Scanner;

public class Assignment10 {

    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
    public static final String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", "|", ".--.", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

    public static void engToMorse() {

        Scanner in =new Scanner(System.in);
        String word;

        System.out.println("Enter a word: ");
        word=in.nextLine().toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (word.charAt(i) == alphabet.charAt(j)) {
                    System.out.print(morseCode[j] + " ");
                }
            }
        }
    }

    public static void morseToEng() {

        Scanner in =new Scanner(System.in);
        String word;

        System.out.println("Enter a word: ");
        word=in.nextLine().toUpperCase();
        String[] singleMorse = word.split(" ");


        for (int i = 0; i < singleMorse.length; i++) {
            for (int j = 0; j < morseCode.length; j++) {
                if (singleMorse[i].equals(morseCode[j])) {
                    System.out.print(alphabet.charAt(j));
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("1) English to Morse");
            System.out.println("2) Morse to English");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    engToMorse();
                    break;
                case 2:
                    morseToEng();
                    break;
                default:
                    System.out.println("Please choose 1 or 2");

            }

            if(choice==1 || choice ==2){
                break;
            }

        }
    }
}
