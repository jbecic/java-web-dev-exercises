package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {
        HashMap<String, Integer> charactersTotal = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Please enter in a word, phrase, sentance or paragraph:");
        userInput = input.nextLine();
        userInput = userInput.trim().toLowerCase(Locale.ROOT).replaceAll("\\d", "").replaceAll("\\W+", "");
        input.close();
        char[] charactersInString = userInput.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
            if (!charactersTotal.containsKey(Character.toString(charactersInString[i]))) {
                charactersTotal.put(Character.toString(charactersInString[i]), 1);
            } else {
                charactersTotal.put(Character.toString(charactersInString[i]), charactersTotal.get(Character.toString(charactersInString[i])) + 1);
            }
        }

        for (Map.Entry<String, Integer> character : charactersTotal.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
