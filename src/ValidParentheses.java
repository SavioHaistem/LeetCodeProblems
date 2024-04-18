import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParentheses {
    public static boolean isValidBrackts(String string) {
        Stack<Character> characters = new Stack<>();
        for (int count = 0; count < string.length(); count++) {
            char current = string.charAt(count);
            if (current == '{' || current == '(' || current == '[') {
                characters.add(current);
            } else if (!characters.empty()) {
                if (current == '}' && characters.pop() != '{') {
                    return false;
                } else if (current == ')' && characters.getLast() != '(') {
                    return false;
                } else if (current == ']' && characters.getLast() != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
