package homeWork.arrayutil;

public class AverageArray {
    public static void main(String[] args) {
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }
        System.out.println("Average: " + average);
    }
}
