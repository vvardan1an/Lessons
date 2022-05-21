
package homeWork.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {

        //1) char c քանակը

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Count c: " + count);

        //2) Տպել մեջտեղի 2 սինվոլները

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        int startIndex = (chars2.length / 2) - 1;
        int lastIndex = chars2.length / 2;

        System.out.print("Middle 2 elements: ");

        for (int i = startIndex; i <= lastIndex; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println();

        //3) True եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ False

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        boolean endSymbols = false;

        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println("Is end <l,y> : " + true);
        } else System.out.println("Is false: " + false);

        // 4) Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bobArray = {'l', 'o', 'm', 'b', 'o', 'b'};

        boolean bob = false;

        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b') {
                if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                    System.out.println("Is true: " + true);
                    break;
                } else System.out.println("Is false: " + false);
            }
        }

        // 5)Տպել մասիվի այն սինվոլները որոնք պռաբել չեն

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}