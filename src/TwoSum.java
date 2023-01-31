import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumEager(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        for (int i = 0; i<nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSumFast(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        Map<Integer,Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(target - nums[i])) {
                result[0] = values.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            values.put(nums[i], i);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        TwoSum solution = new TwoSum();

        System.out.println("Eager solution:\t" + Arrays.toString(solution.twoSumEager(nums, 9)));
        System.out.println("Fast solution:\t" + Arrays.toString(solution.twoSumEager(nums, 9)));
    }
}
