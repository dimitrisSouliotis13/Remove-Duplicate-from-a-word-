package minePackage;

import java.util.Scanner;

public class TestClass {

    private String removeDuplicateLetters(String word) {

        try {
            if (word.length() == 0) {
                return String.format("Write a word!!!");
            }

            for (int i = 0; i < word.toLowerCase().length(); i++) {
                char unique = word.charAt(i);
                for (int k = i + 1; k < word.toLowerCase().length(); k++) {
                    if (unique == word.charAt(k)) {
                        word = word.replace(unique, '_');
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return String.format("Word without duplicates is: " + word);
    }

    public void userInput() {
        while (true) {
            Scanner scannerUserWord = new Scanner(System.in);
            System.out.println("Enter the word you want:");
            String userWord = scannerUserWord.nextLine();

            if (userWord.equalsIgnoreCase("exit")) {
                System.out.println("Process finished!!");
                System.exit(0);
            }
            System.out.println(
                    removeDuplicateLetters(userWord));
        }
    }
}
