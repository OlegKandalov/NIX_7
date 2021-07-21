package ua.com;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("select task number:");
        System.out.println("Task #1 - get all numbers from string and add them"
                + System.lineSeparator() + "Task #2 - count the number of occurrences of letters in a string"
                + System.lineSeparator() + "Task #3 - get time when lesson ends");

        switch (scanner.nextLine()) {
            case "1": {
                System.out.println("enter the string");
                System.out.println(Task1.sumNumbers(scanner.nextLine()));
                break;
            }
            case "2": {
                System.out.println("enter the string");
                System.out.println(Task2.countOfLetters(scanner.nextLine()));
                break;
            }
            case "3": {
                System.out.println("enter the number of lesson");
                System.out.println(Task3.getTime(Integer.parseInt(scanner.nextLine())));
                break;
            }
        }
    }
}
