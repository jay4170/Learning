import java.util.Arrays;

public class Tests {
    static boolean testsPassed = true;

    public static void arraySortTest() {
        double[] numbers = {5, 4, 1, 2, 3};
        double[] correct = {1, 2, 3, 4, 5};
        double[] sortRun = Sort.sort(numbers);
        if (Arrays.equals(correct, sortRun)) {
            System.out.println("Sorting passed");

        } else {
            testsPassed = false;

            System.out.println("Sorting failed, received ");
            showArray(sortRun);
            System.out.println("Expected ");
            showArray(correct);
        }
    }

    public static void switchSortedTest() {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] correct = {3, 4, 1, 2, 5};
        int[] switchRun = Sort.switched(numbers, 0, 4);
        if (Arrays.equals(correct, switchRun)) {
            System.out.println("Switching passed");

        } else {
            testsPassed = false;
            System.out.println("Switching failed, received ");
            showIntArray(switchRun);
            System.out.println("Expected ");
            showIntArray(correct);
        }
    }


    public static void arrayInOrderTest() {
        int[] falseTestArray = {5, 4, 1, 2, 3};
        int[] trueTestArray = {1, 2, 3, 4, 5};
        if (Sort.isArrayInOrder(falseTestArray)) {
            testsPassed = false;
            System.out.println("Order test failed");

        }
        if (!Sort.isArrayInOrder(trueTestArray)) {
            testsPassed = false;
            System.out.println("Order test failed");
        }
        if (Sort.isArrayInOrder(trueTestArray) && !Sort.isArrayInOrder(falseTestArray)) {
            System.out.println("Order passed");

        }
    }

    public static void whereDidIBreakTest() {
        int[] falseTestArray = {5, 4, 1, 2, 3};
        int[] trueTestArray = {1, 2, 3, 4, 5};
        if (Sort.whereDidIBreak(falseTestArray) == -100) {
            testsPassed = false;
            System.out.println("Breaking Location test failed");
        }
        if (Sort.whereDidIBreak(trueTestArray) != -100) {
            testsPassed = false;
            System.out.println("Breaking Location test failed");
        }
        if (Sort.whereDidIBreak(falseTestArray) != -100) {
            System.out.println("Breaking Location passed");


        }

    }

    public static void correctedArrayTest() {
        int[] falseTestArray = {5, 4, 1, 2, 3};
        int[] trueTestArray = {1, 2, 3, 4, 5};
        int[] sortedArray = Sort.correctedArray(falseTestArray);

        if (Arrays.equals(sortedArray, trueTestArray)) {
            System.out.println("Corrected Array passed");
        }
        if (!Arrays.equals(sortedArray, trueTestArray)) {
            testsPassed = false;
            System.out.println("Corrected Array failed");
            System.out.println("received");
            showIntArray(sortedArray);

        }

    }


    public static void showArray(double[] numbers) {
        for (double number : numbers) {
            System.out.println(number);
        }
    }

    public static void showIntArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        correctedArrayTest();
        whereDidIBreakTest();
        arrayInOrderTest();
        arraySortTest();
        switchSortedTest();
        if (testsPassed) {
            System.out.println("All tests passed");

        } else {
            System.out.println("One or more tests failed");

        }
    }

}
