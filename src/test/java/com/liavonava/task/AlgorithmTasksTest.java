package com.liavonava.task;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlgorithmTasksTest {

    @Test(description = "Number greater than 7 returns Hello")
    public void testNumberGreaterThanSeven() {
        assertEquals(AlgorithmTasks.checkNumber(8), "Hello");
    }

    @Test(description = "Boundary value: 7 is not greater than 7")
    public void testBoundaryValueSeven() {
        assertEquals(AlgorithmTasks.checkNumber(7), "");
    }

    @Test(description = "Negative numbers return empty string")
    public void testNegativeNumber() {
        assertEquals(AlgorithmTasks.checkNumber(-10), "");
    }

    @DataProvider(name = "names")
    public Object[][] names() {
        return new Object[][] {
                {"John", "Hello, John"},
                {"john", "There is no such name"},
                {"Alice", "There is no such name"},
                {"", "There is no such name"}
        };
    }

    @Test(dataProvider = "names", description = "Greeting depends on entered name")
    public void testGreeting(String name, String expected) {
        assertEquals(AlgorithmTasks.greetByName(name), expected);
    }

    @Test(description = "Filters elements divisible by 3")
    public void testMultiplesOfThree() {
        int[] actual = AlgorithmTasks.filterMultiplesOfThree(new int[]{1, 3, 5, 6, 9, 10});
        assertEquals(actual, new int[]{3, 6, 9});
    }

    @Test(description = "Empty array returns empty result")
    public void testEmptyArray() {
        assertEquals(AlgorithmTasks.filterMultiplesOfThree(new int[]{}), new int[]{});
    }

    @Test(description = "Null array returns empty result")
    public void testNullArray() {
        assertEquals(AlgorithmTasks.filterMultiplesOfThree(null), new int[]{});
    }

    @Test(description = "Zero is a multiple of 3")
    public void testZeroIsMultiple() {
        assertEquals(AlgorithmTasks.filterMultiplesOfThree(new int[]{0, 1}), new int[]{0});
    }
}