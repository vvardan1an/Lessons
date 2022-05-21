package homeWork.arrayutil;

public class Lr2 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 9, 7, 4, 5, 1,5, 3, 10};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");

                }
            }
        }
    }
}
