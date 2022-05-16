package homeWork.arrayutil;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};

        int num = 0;
        int count = 0;
        System.out.print("Odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num = array[i];
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
