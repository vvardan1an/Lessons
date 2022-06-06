package homeWork.braceChecker;

public class Stack {
    char[] array = new char[10];
    int size;

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size == array.length) {
            System.out.println("Stack is full");
        } else {
            array[++size] = (char) value;
        }
    }

    public char pop() {
        if (size < 0) {
            return 0;
        } else {
            return  array[size--];
        }
    }
}

