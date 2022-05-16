package homeWork.arrayutil;

public class BiggestAndSmallestNumber {
    public static void main(String[] args) {
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};

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
    }
}
