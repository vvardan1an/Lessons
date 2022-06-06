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
                    if (pop != '(') {
                        showError(pop, text.charAt(i));
                        System.out.print("at " + i);
                    }
                    System.out.println();
                    break;
                case '}':
                    char pop1 = stack.pop();
                    if (pop1 != '{') {
                        showError(pop1, text.charAt(i));
                        System.out.print("at " + i);
                    }
                    System.out.println();
                    break;
                case ']':
                    char pop2 = stack.pop();
                    if (pop2 != '[') {
                        showError(pop2, text.charAt(i));
                        System.out.print(" at " + i);
                    }
                    System.out.println();
                    break;
            }
        }
    }

    public void showError(char opened, char closed) {
        System.out.print("Error: opened " + opened + " but closed " + closed + " ");
    }

    public void showError(char opened) {
        System.out.println("Error: opened " + opened + " but not closed" + ". ");
    }
}

