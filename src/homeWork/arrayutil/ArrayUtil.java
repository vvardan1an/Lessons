package homeWork.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};

        // Print array:

        System.out.print("Array elements: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //BiggestAndSmallestNumber

        int max = array[0];
        int min = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.print("Maximal: " + max + " Minimal: " + min + " ");
        System.out.println();

        //PrintEvenNumbers

        int num = 0;
        System.out.print("Even numbers: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                num = array[i];
                System.out.print(num + " ");
            }
        }
        System.out.println();

        //PrintOddNumbers

        System.out.print("Odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num = array[i];
                System.out.print(num + " ");
            }
        }
        System.out.println();

        //CountOddNumbers

        int countOddNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOddNum++;
            }
        }
        System.out.println("Count odd numbers: " + countOddNum);

        //CountEvenNumbers

        int countEvenNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEvenNum++;
            }
        }
        System.out.println("Count even numbers: " + countEvenNum);

        //SummaryArray

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Summary: " + sum);

        //AverageArray

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = (double) sum / array.length;
        }
        System.out.println("Average: " + average);
    }
}
