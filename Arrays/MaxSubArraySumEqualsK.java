package Arrays;

import java.util.HashMap;

public class MaxSubArraySumEqualsK {
    public static int maxSubArraySum(int[] nums, int k){
        HashMap<Integer, Integer> result = new HashMap<>();
        int sum = 0; 
        int maxLength = 0;
        result.put(0,-1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(result.containsKey(sum - k)){
                int len = i - result.get(sum - k);
                maxLength = Math.max(maxLength, len);
            }
            if(!result.containsKey(sum)){
                result.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(maxSubArraySum(nums, k));
    }
}
