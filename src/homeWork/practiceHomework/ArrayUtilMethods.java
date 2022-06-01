package homeWork.practiceHomework;

public class ArrayUtilMethods {
    //Print array

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int biggestNumber(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    int smallestNumber(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    void printEvenNumbers(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                num = array[i];
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int num = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = num;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
