package Arrays;

import java.util.HashMap;

public class LongestSubArraySumofK {
    public static int largestSubArray(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            // case 1: if sum == k
            if(sum == k) {
                maxLen = i+1;
            }
            // case 2: if(sum - k) found
            if(map.containsKey(sum-k)){
                int len = i - map.get(sum-k);
                maxLen = Math.max(maxLen, len);
            }
            // Store the first occurance only
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        System.out.println(largestSubArray(nums,k));
    }
}
