package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        String prompt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into thebook her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        prompt = prompt.toLowerCase(Locale.ROOT);

        System.out.println("Please provide a search term:");
        userInput = input.nextLine();
        input.close();

        Boolean contains = prompt.contains(userInput);
        System.out.println(contains);
    }
}
