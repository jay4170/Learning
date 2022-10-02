

public class Sort {

    public static double[] sort(double[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int x = 0; x < numbers.length - i - 1; x++) {
                if (numbers[x] > numbers[x + 1]) {
                    double tempNumber = numbers[x];
                    numbers[x] = numbers[x + 1];
                    numbers[x + 1] = tempNumber;
                }

            }

        }
        return numbers;
    }

    public static boolean isArrayInOrder(int[] numbers) {
        boolean inOrder = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                inOrder = false;

            }
        }
        return inOrder;
    }

    public static int whereDidIBreak(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return i;
            }
        }
        return -100;
    }

    public static int[] correctedArray(int[] numbers) {
        int[] sortedArray = numbers;

        while (!isArrayInOrder(sortedArray)) {
            int broke = whereDidIBreak(numbers);
            sortedArray = switched(numbers, broke, broke + 1);
        }
        return sortedArray;
    }

    public static int[] switched(int[] numbers, int indiceOne, int indiceTwo) {
        int numberOne = numbers[indiceOne];
        int numberTwo = numbers[indiceTwo];
        numbers[indiceOne] = numberTwo;
        numbers[indiceTwo] = numberOne;

        return numbers;
    }
}

