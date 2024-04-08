import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KataOddNumbers {
    public static Object oddNumber(int[] numbers) {
        Map<Integer,Integer> check = new HashMap<>();
        for (Integer currentNum : numbers) {
            if (check.containsKey(currentNum)) {
                check.replace(currentNum, check.get(currentNum), check.get(currentNum) + 1);
            } else {
                check.put(currentNum, 1);
            }
        }

        return check.keySet().stream().mapToInt(Integer::intValue).filter(character -> check.get(character) % 2 != 0).sum();
    }
}
