package com.liavonava.task;

import java.util.Arrays;
import java.util.Scanner;

public final class ConsoleApp {

    private ConsoleApp() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            runNumberCheck(scanner);
            runNameGreeting(scanner);
            runArrayFilter(scanner);
        }
    }

    private static void runNumberCheck(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());
        String result = AlgorithmTasks.checkNumber(number);
        if (!result.isEmpty()) {
            System.out.println(result);
        }
    }

    private static void runNameGreeting(Scanner scanner) {
        System.out.print("Enter a name: ");
        String name = scanner.nextLine().trim();
        System.out.println(AlgorithmTasks.greetByName(name));
    }

    private static void runArrayFilter(Scanner scanner) {
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        int[] numbers = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Multiples of 3: "
                + Arrays.toString(AlgorithmTasks.filterMultiplesOfThree(numbers)));
    }
}