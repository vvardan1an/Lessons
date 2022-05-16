package homeWork.arrayutil;

public class SummaryArray {
    public static void main(String[] args) {
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};

        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Summary: " + sum);
    }
}
