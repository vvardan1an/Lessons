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
            ;
            if (i < min) {
                min = i;
            }
        }
        System.out.print("Maximal: " + max + " Minimal: " + min + " ");
        System.out.println();

        //PrintEvenNumbers

        int even = 0;
        System.out.print("Even numbers: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = array[i];
                System.out.print(even + " ");
            }
        }
        System.out.println();

        //PrintOddNumbers

        int odd = 0;
        System.out.print("Odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
                System.out.print(odd + " ");
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

        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = sum / array.length;
        }
        System.out.println("Average: " + average);
    }
}
