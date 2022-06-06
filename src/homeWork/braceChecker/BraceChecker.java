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
    public void checkOnlyOpen(){
        for (int j = 0; j < text.length(); j++) {
            switch (text.charAt(j)) {
                case '(':
                    char open1 = stack.pop();
                    if (open1 != ')') {
                        showError(text.charAt(j));
                    }
                    break;
                case '{':
                    char open2 = stack.pop();
                    if (open2 != '}') {
                        showError(text.charAt(j));
                    }
                    break;
                case '[':
                    char open3 = stack.pop();
                    if (open3 != ']') {
                        showError(text.charAt(j));
                    }
                    break;
            }
        }
    }
    public void checkOnlyClose(){
        for (int k = 0; k < text.length(); k++) {
            switch (stack.pop()){
                case ')':
                    if(text.charAt(k) != '('){
                        showErrorMessage(stack.pop());
                    }
                    break;
                case '}':
                    if(text.charAt(k) != '{'){
                        showErrorMessage(stack.pop());
                    }
                    break;
                case ']':
                    if(text.charAt(k) != '['){
                        showErrorMessage(stack.pop());
                    }
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
    public void showErrorMessage(char closed) {
        System.out.println("Error: closed " + closed + " but not opened" + ". ");
    }
}

