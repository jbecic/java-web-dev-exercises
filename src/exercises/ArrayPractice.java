package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArray = Arrays.copyOf(phrase.split(" ", 0), phrase.split(" ", 0).length);
        String[] anotherPhraseArray = Arrays.copyOf(phrase.split("\\.", 0), phrase.split("\\.", 0).length);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("\n");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                System.out.println(nums[i]);
            }
        }

        System.out.println("\n");
        System.out.println(Arrays.toString(phraseArray));
        System.out.println("\n");
        System.out.println(Arrays.toString(anotherPhraseArray));
    }
}
