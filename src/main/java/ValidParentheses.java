import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        boolean result = true; // изначально строка валидна, если она пустая

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    stack.push(s.charAt(i));
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stack.empty()) {
                        char ch = (char) stack.pop();
                        if ((s.charAt(i) == '}' && ch != '{') ||
                                (s.charAt(i) == ']' && ch != '[') ||
                                (s.charAt(i) == ')' && ch != '(')) {
                            result = false;
                        }
                    } else {
                        result = false;
                    }

            }
        }

        // На этом этапе обработаны все символы в строке.
        // Если в стеке ещё остались символы, значит они не парные и строка не валидна
        if (!stack.empty()) {
            result = false;
        }

        return result;
    }

}
