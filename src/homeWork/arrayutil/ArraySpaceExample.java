package homeWork.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        int startIndex = 0;
        int endIndex = 0;


        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                startIndex = i;
                break;
            }
        }
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] != ' ') {
                endIndex = j;
                break;
            }
        }
        char[] result = new char[endIndex - startIndex + 1];
        int resultChar = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            result[resultChar] = spaceArray[i];
            resultChar++;
        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}
