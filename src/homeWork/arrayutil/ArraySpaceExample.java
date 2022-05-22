package homeWork.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        char [] result = new char[spaceArray.length];

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if(spaceArray[i] != ' '){
                startIndex = i;
                break;
            }
        }
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if(spaceArray[j] != ' '){
                endIndex = j;
                break;
            }
        }
        for (int k = startIndex; k <= endIndex ; k++) {
            result[k] = spaceArray[k];
            System.out.print(result[k]);
        }
    }
}
