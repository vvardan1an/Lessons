package homeWork.collection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
    List<FootballTeamMember> fbTime = new ArrayList<>();
        fbTime.add(new FootballTeamMember(7,"Poxos Poxosyan"));
        fbTime.add(new FootballTeamMember(10,"Martiros Martirosyan"));
        fbTime.add(new FootballTeamMember(1,"Poxos Petrosyan"));
        fbTime.add(new FootballTeamMember(6,"Armen Vardanyan"));
        fbTime.add(new FootballTeamMember(12,"Tigran Adamyan"));
        fbTime.add(new FootballTeamMember(11,"Armen Arshakyan"));
        fbTime.add(new FootballTeamMember(8,"Davit Poxosyan"));
        fbTime.add(new FootballTeamMember(3,"Gagik Muradyan"));
        fbTime.add(new FootballTeamMember(5,"Sergey Stepanyan"));
        fbTime.add(new FootballTeamMember(10,"Vazgen Aramyan"));
        fbTime.add(new FootballTeamMember(4,"Aram Kirakosyan"));
        fbTime.add(new FootballTeamMember(9,"Petros Poxosyan"));
        //System.out.println(createFootballTeam(fbTime));

        TreeMap <Integer,String> members= new TreeMap<>();
        for (FootballTeamMember fb : fbTime) {
            members.put(fb.getNumber(),fb.getName());
        }
        removeFromMap(members,4);
        System.out.println(members);
        //printAllMemberNames(members);
        //printAllMembers(members);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {

        HashMap <Integer,String> hashMap = new HashMap<>();
        for (FootballTeamMember member : members) {
            hashMap.put(member.getNumber(),member.getName());
        }
        return hashMap;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        return Boolean.parseBoolean(memberMap.remove(removedNumber));
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Integer v: memberMap.keySet()){
            System.out.println(v + " - " + memberMap.get(v));
        }
    }

}
