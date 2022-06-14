package homeWork.dynamicArray;

import java.util.ArrayList;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(5);
        dynamicArray.add(10);
        dynamicArray.add(15);
        dynamicArray.add(4);
        dynamicArray.add(15);
        dynamicArray.printArray();
        System.out.println();
        System.out.println(dynamicArray.getByIndex(2));
        System.out.println(dynamicArray.getFirstIndexByValue(4));
        dynamicArray.printArray();
        //dynamicArray.set(0,100);
        dynamicArray.add(4,23);
        dynamicArray.delete(5);

    }

}
