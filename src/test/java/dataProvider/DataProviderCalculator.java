package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderCalculator {
    @DataProvider
    public static Object[][] subtractionDataProvider() {
        return new Object[][]{{5, 3, 2}, {10, 9, 1}, {7, 3, 4}};
    }

    @DataProvider
    public static Object[][] summaryDataProvider() {
        return new Object[][]{{1, 1, 2}, {10, 5, 15}, {12, 1, 13}};
    }

    @DataProvider
    public static Object[][] multiplicationDataProvider() {
        return new Object[][]{{1, 0, 0}, {2, 1, 2}, {4, 5, 20}};
    }

    @DataProvider
    public static Object[][] divisionDataProvider() {
        return new Object[][]{{15, 3, 5}, {16, 4, 4}, {1, 1, 1}};
    }

    @DataProvider
    public static Object[][] divisionByZeroDataProvider() {
        return new Object[][]{{18, 0}, {0, 0}, {1, 0}};
    }
}