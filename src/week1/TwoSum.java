package week1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (intMap.containsKey(rem)) {
                result[0] = intMap.get(rem);
                result[1] = i;
                return result;
            }
            intMap.put(nums[i], i);
        }
        return null;
    }
}
