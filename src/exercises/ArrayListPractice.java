package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter an int value:");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            nums.add(i);
        }

        for (int i = 0; i < num; i++) {
            if (nums.get(i) % 2 == 0) {
                sum += nums.get(i);
                System.out.println(nums.get(i));
            }
        }

        System.out.println("The sum is: " + sum);

        System.out.println("\n");

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(",")) {
                words[i] = words[i].replace(",", "");
            } else if (words[i].contains("\\.")) {
                words[i] = words[i].replace("\\.", "");
            }
        }

        List<String> strs = new ArrayList<String>();
        strs = Arrays.asList(words);
        System.out.println("\n");

        System.out.println("Please enter an int value:");
        int wordLength = input.nextInt();
        input.close();

        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).length() == wordLength) {
                System.out.println(strs.get(i));
            }
        }
    }
}
