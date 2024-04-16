import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        System.out.println(Arrays.toString(getTwoSum(nums, target)));
    }
    public static int[] getTwoSum(int[] nums, int target) {
        ArrayList<Integer> response = new ArrayList<>(2);
        for (int number = 0; number < nums.length; number++) {
            for (int compare = 1; compare < nums.length; compare++) {
                if (nums[number] + nums[compare] == target && compare != number) {
                    response.add(number);
                    response.add(compare);
                }
            }
        }

        //return response.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(response);
        return nums;
    }
}
