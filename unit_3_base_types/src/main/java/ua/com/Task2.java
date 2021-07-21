package ua.com;

import java.util.TreeMap;

public class Task2 {

    public static TreeMap<Character, Integer> countOfLetters(String input) {
        TreeMap<Character, Integer> result = new TreeMap<>();
        String stringWithoutOfNumbers = input.replaceAll("[0-9]", "").toLowerCase();
        char[] chars = stringWithoutOfNumbers.toCharArray();
        for (char c : chars) {
            if (!result.containsKey(c)) {
                result.put(c, 1);
            } else {
                result.put(c, (result.get(c)) + 1);
            }
        }
        return result;
    }
}
