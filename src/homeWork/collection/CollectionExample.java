package homeWork.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CollectionExample {

    public static void main(String[] args) {
        String[] array = {"armen", "gevor", "poka"};
        //System.out.println(arrayToList(array));
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("good");
        stringList.add("okay");
        stringList.add("okay");
        stringList.add("home");
        stringList.add("dope");
        stringList.add("gender");
        //System.out.println(removeById(stringList, 1));
        //System.out.println(listToSet(stringList));
        printFirstFive(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(45);
        integerList.add(455);
        integerList.add(478);
        integerList.add(4755);
        //System.out.println(listToLinkedList(integerList));
        //System.out.println(reverseNumbers(integerList));
        //printFirstFive(stringList);

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {

        return new ArrayList<>(Arrays.asList(values));
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        //List<String> stringList = new ArrayList<>(list);
        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        return new HashSet<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        return new LinkedList<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        System.out.println(list.subList(0,5));
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        return list.size();
    }
}
