package homeWork.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false
    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return 0;
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return value;
    }

    public void set(int index, int value) {
        if (index < size && index >= 0) {
            array[index] = value;
        }
        System.out.println();
        printArray();
    }

    public void add(int index, int value) {
        if (index < size && index >= 0) {
            size++;
            for (int i = size - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        }
        System.out.println();
        printArray();
    }

    public void delete(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size - 1; i++) {
                array[index] = array[index + 1];
            }
            size--;
        }
        System.out.println();
        printArray();
    }
}

