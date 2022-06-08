package homeWork.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("{}}})");
        braceChecker.check();
        braceChecker.checkOnlyOpen();
        //braceChecker.checkOnlyClose();

    }
}