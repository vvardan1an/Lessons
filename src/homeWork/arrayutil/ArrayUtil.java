package homeWork.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};

        // 1)

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // 2),3)

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

        //4)

        int num = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                num = array[i];
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 5)

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num = array[i];
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 5)

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.print("Odd numbers: " + count);
        System.out.println();

        // 6)
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("Even numbers: " + count);
        System.out.println();

        //7)

        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Summary: " + sum);

        // 8)

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
            average = (double) sum / count;
        }
        System.out.println("Average: " + average);
    }
}
