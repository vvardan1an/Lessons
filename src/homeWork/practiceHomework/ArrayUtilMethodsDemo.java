package homeWork.practiceHomework;

public class ArrayUtilMethodsDemo {
    public static void main(String[] args) {
        ArrayUtilMethods ar = new ArrayUtilMethods();
        int[] array = {22, 10, 45, 60, 80, 100, 24, 35, 98, 1};
        ar.printArray(array);
        int max = ar.biggestNumber(array);
        System.out.println("Biggest number is : " + max);
        int min = ar.smallestNumber(array);
        System.out.println("Smallest number is : " + min);
        System.out.print("Even numbers in array: ");
        ar.printEvenNumbers(array);
        System.out.print("Sort array: ");
        ar.sort(array);
    }
}
