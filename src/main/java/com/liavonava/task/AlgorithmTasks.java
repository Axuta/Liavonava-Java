package com.liavonava.task;

public final class AlgorithmTasks {

    private static final String EXPECTED_NAME = "John";
    private static final int DIVISOR = 3;

    private AlgorithmTasks() {
    }

    public static String checkNumber(int number) {
        return number > 7 ? "Hello" : "";
    }

    public static String greetByName(String name) {
        if (EXPECTED_NAME.equals(name)) {
            return "Hello, John";
        }
        return "There is no such name";
    }

    public static int[] filterMultiplesOfThree(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int count = 0;
        for (int value : numbers) {
            if (value % DIVISOR == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int value : numbers) {
            if (value % DIVISOR == 0) {
                result[index++] = value;
            }
        }
        return result;
    }
}