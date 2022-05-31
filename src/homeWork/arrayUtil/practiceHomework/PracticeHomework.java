package homeWork.arrayUtil.practiceHomework;

public class PracticeHomework {
    long convert(int minutes) {
        int second = minutes * 60;
        return second;
    }

    int calcAge(int years) {
        int days = years * 365;
        return days;
    }

    int nextNumber(int number) {
        return number + 1;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        }
        return false;
    }

    boolean reverseBool(boolean value) {
        if (value != true) {
            return true;
        }
        return false;
    }

    int maxLength(int[] array1, int[] array2) {
//        array1 = new int[10];
//        array2 = new int[20];
        if (array1.length > array2.length) {
            return array1.length;
        } else if (array1.length == array2.length) {
            return 0;
        }
        return array2.length;
    }
}
