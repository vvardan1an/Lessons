package homeWork.arrayUtil.practiceHomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println("Minutes: => Seconds " + ph.convert(2));
        System.out.println("Years: => Days " + ph.calcAge(2));
        System.out.println("Next number: " + ph.nextNumber(7));
        System.out.println("Is same number: " + ph.isSameNum(7, 8));
        System.out.println("LessThanOrEqualToZero: " + ph.lessThanOrEqualToZero(0));
        System.out.println("Reverse Bool: " + ph.reverseBool(true));
        System.out.println("Max length: " + ph.maxLength(new int[20], new int[20]));
    }
}
