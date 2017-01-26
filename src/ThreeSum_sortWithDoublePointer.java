import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_sortWithDoublePointer {
	public List<List<Integer>> threeSum(int[] nums) {
		// Lock in one variable, and then check if the other two complement the first number to get 0
	    List<List<Integer>> answer = new ArrayList<List<Integer>>();
	    // Sort will be nlogn, a sort is done to track duplicates
	    Arrays.sort(nums);

	    // Every indice except for the last two (already being checked by rest of function)
	    // Will add n speed to nlogn
	    for(int index=0; index<nums.length-2; index++){
	    	// If index == 0, then ignore second step
	    	// Second check is to skip duplicates for speed
	        if(index==0 || nums[index] > nums[index-1]){
	        	// Get other indices
	            int secondIndex=index+1;
	            int thirdIndex=nums.length-1;
	            
	            // While they aren't the same indice(that means that the whole loop has been traversed
	            while(secondIndex<thirdIndex){
	            	// If a triplet has been found
	                if(nums[index]+nums[secondIndex]+nums[thirdIndex]==0){
	                	// Make a list and add everything to it
	                    List<Integer> oneList = new ArrayList<Integer>();
	                    oneList.add(nums[index]);
	                    oneList.add(nums[secondIndex]);
	                    oneList.add(nums[thirdIndex]);
	                    answer.add(oneList);
	                    // Leave these indices
	                    secondIndex++;
	                    thirdIndex--;
	                    // Skip all duplicates too
	                    while(secondIndex<thirdIndex && nums[secondIndex]==nums[secondIndex-1])
	                        secondIndex++;
	                    while(secondIndex<thirdIndex && nums[thirdIndex]==nums[thirdIndex+1])
	                        thirdIndex--;
	                // This is the "second" loop in the function, makes things n^2 + nlogn
	                // If sum is lower than 0, need to bump the lower number (second indice) up
	                // If sum is higher than 0, need to bump the higher number (third indice) down
	                // The order is guaranteed because everything is sorted
	                }else if(nums[index]+nums[secondIndex]+nums[thirdIndex]<0){
	                    secondIndex++;
	                }else{
	                    thirdIndex--;
	                }
	            }
	        }
	    }
	    return answer;
	}
}
