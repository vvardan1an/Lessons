package homeWork.braceChecker;

public class BraceChecker {
    public String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    Stack stack = new Stack();

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    char pop = stack.pop();
                    if (pop == 0) {
                        showErrorMessage(c);
                        break;
                    }
                    if (pop != '(') {
                        showError(pop, text.charAt(i));
                        System.out.println("at " + i);
                    }
                    break;
                case '}':
                    char pop1 = stack.pop();
                    if (pop1 == 0) {
                        showErrorMessage(c);
                        break;
                    }
                    if (pop1 != '{') {
                        showError(pop1, text.charAt(i));
                        System.out.println("at " + i);
                    }
                    break;
                case ']':
                    char pop2 = stack.pop();
                    if (pop2 == 0) {
                        showErrorMessage(c);
                        break;
                    }
                    if (pop2 != '[') {
                        showError(pop2, text.charAt(i));
                        System.out.println(" at " + i);
                    }
                    break;
            }
        }
    }

    public void checkOnlyOpen() {
        while (true) {
            char c = stack.pop();
            if (c == 0) {
                return;
            } else {
                showError(c);
            }
        }
    }


    public void showError(char opened, char closed) {
        System.out.print("Error: opened " + opened + " but closed " + closed + " ");
    }

    public void showError(char opened) {
        System.out.println("Error: opened " + opened + " but not closed" + ". ");
    }

    public void showErrorMessage(char closed) {
        System.out.println("Error: closed " + closed + " but not opened" + ". ");
    }
}

