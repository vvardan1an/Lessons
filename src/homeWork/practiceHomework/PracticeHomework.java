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
        return (a == b) ? true : false;

    }

    boolean lessThanOrEqualToZero(int number) {
        return number <= 0 ? true : false;
    }

    boolean reverseBool(boolean value) {
        return value != true ? true : false;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
}

