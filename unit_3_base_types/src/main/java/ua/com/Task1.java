package ua.com;

public class Task1 {

    public static int sumNumbers(String input) {
        int result = 0;
        String stringWithoutLetters = input.replaceAll("[a-z]", "");
        for (char c : stringWithoutLetters.toCharArray()) {
            result += c - '0';
        }
        return result;
    }
}