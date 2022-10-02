

public class Average {

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

    public static void showArray(double[] numbers) {
        for (double number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {

        double[] numbers = {5, 2, 3, 4, 5, 1, 8, 9, 2, 1, 3, 4, 56, 2, 3, 4};
        showArray(sort(numbers));
    }

}

