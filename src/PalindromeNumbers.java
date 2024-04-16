import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeNumbers {
    public static boolean isPalindrome(int x) {
        List<String> reverse = Arrays.stream(Integer.toString(x).split("")).toList().reversed();
        List<String> verse = Arrays.stream(Integer.toString(x).split("")).toList();
        return verse.hashCode() == reverse.hashCode();
    }
}
