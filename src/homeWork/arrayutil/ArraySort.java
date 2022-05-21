package homeWork.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {-4, 95, 20, 10, 7, 50, 60, 35};

        boolean IsIfTrue = true;

         while (IsIfTrue) {
            IsIfTrue = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    int num = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = num;
                    IsIfTrue = true;
                }
            }
        }
        System.out.print("From largest to smallest: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] numbers1 = {-4, 95, 20, 10, 7, 50, 60, 35};

        boolean IsIfTrue1 = true;

        while (IsIfTrue1) {
            IsIfTrue1 = false;
            for (int i = 0; i < numbers1.length - 1; i++) {
                if (numbers1[i] > numbers1[i + 1]) {
                    int num = numbers1[i];
                    numbers1[i] = numbers1[i + 1];
                    numbers1[i + 1] = num;
                    IsIfTrue1 = true;
                }
            }
        }
        System.out.print("From smallest to largest: ");
        for (int number : numbers1) {
            System.out.print(number + " ");
        }
    }
}
