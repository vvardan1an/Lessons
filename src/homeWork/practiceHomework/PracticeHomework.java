package homeWork.practiceHomework;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;

    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int number) {
        return number + 1;
    }

    boolean isSameNum(int a, int b) {
        return a==b;

    }

    boolean lessThanOrEqualToZero(int number) {
        return number <= 0 ;
    }

    boolean reverseBool(boolean value) {
        return value != true;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
}

