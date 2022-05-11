package homeWork.forFigurePainter;

public class FigurePainter3 {
    public static void main(String[] args) {
        int num  = 3 ;
        for (int i = 0; i < num; i++) {
            for (int j = num ; j > i ; j--) {

                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = num -1; j > i; j--) {

                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
