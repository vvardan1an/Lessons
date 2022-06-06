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
                    char check = stack.pop();
                    if (check != '(') {
                        showError( check, text.charAt(i));
                        System.out.print("at " + i);
                        return;
                    }
                    break;
                case '}':
                    char check1 = stack.pop();
                    if (check1 != '{') {
                        showError(check1, text.charAt(i));
                        System.out.print("at " + i);
                        return;
                    }
                    break;
                case ']':
                    char check2 = stack.pop();
                    if (check2 != '[') {
                        showError( check2, text.charAt(i));
                        System.out.print(" at " + i);
                        return;
                    }
                    break;
            }
        }
    }

    public void showError(char opened,char closed) {
        System.out.print("Error: opened " + opened + " but closed " + closed + " ");
    }

    public void showError(char opened) {
        System.out.println("Error: opened " + opened + " but not closed" + ". ");
    }
}
