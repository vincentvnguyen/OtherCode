import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> answer = new ArrayList<List<Integer>>();
    	Map<Integer, int[]> data = new HashMap<>();
    	
    	for (int index = 0; index < nums.length - 1; index++){
    		for (int secondIndex = index + 1; secondIndex < nums.length; secondIndex++){
    			data.put(nums[index]+nums[secondIndex], new int[]{index, secondIndex});
    		}
    	}
    	
    	for (int thirdIndex = 0; thirdIndex < nums.length; thirdIndex++){
    		int complement = nums[thirdIndex] * -1;
    		int[] oneList = data.get(complement);
        	if (data.containsKey(complement) && thirdIndex!= oneList[0] && thirdIndex!= oneList[1]){
        		ArrayList<Integer> oneAnswer = new ArrayList<Integer>(
        			    Arrays.asList(nums[oneList[0]], nums[oneList[1]], nums[thirdIndex]));
        		answer.add(oneAnswer);
        	}
    	}
		return answer;
    }
	
	public static void main(String[] args) {
		int [] test = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(test));
	}

}
