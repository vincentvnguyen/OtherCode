
public class TwoSum_doubleLoop {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int index=0; index<nums.length-1; index++){
            for(int numberToCheck = index+1; numberToCheck<nums.length; numberToCheck++){
                if (nums[index] + nums[numberToCheck] == target){
                    answer[0] = index;
                    answer[1] = numberToCheck; 
                }
            }
        }
        return answer;
    }
}
