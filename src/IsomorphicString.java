import java.util.Map;
import java.util.HashMap;

public class IsomorphicString {
    public boolean IsIsomorphic(String s, String t) {
        Map<Character,Character> compared = new HashMap<Character,Character>();
        for(int count = 0; count < s.length(); count++) {
            char charS = s.charAt(count);
            char charT = t.charAt(count);
            if(compared.containsKey(charS) && compared.get(charS).equals(charT)) {
                continue;
            } else if (compared.containsKey(charS) || compared.containsValue(charT)) {
                return false;
            } else {
                compared.put(charS,charT);
            }
        }
        return true;
    }
}