package homeWork.dynamicArray;

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
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getByIndex(10));
        System.out.println(dynamicArray.getFirstIndexByValue(16));
        dynamicArray.set(0,18);
        dynamicArray.printArray();
        dynamicArray.add(1,40);
        System.out.println();
        dynamicArray.printArray();
        System.out.println();
        dynamicArray.delete(4);
        dynamicArray.printArray();

    }

}
