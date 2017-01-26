import java.util.HashMap;
import java.util.Map;

public class TwoSum_hashMap {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> data = new HashMap<>();
        for (int index = 0; index<nums.length; index++){
        	int complement = target - nums[index];
        	if (data.containsKey(complement)){
        		return new int[] {data.get(complement), index};
        	}
        	data.put(nums[index], index);
        }
        throw new IllegalArgumentException("No solution");
    }
}