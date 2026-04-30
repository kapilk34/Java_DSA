package Arrays;

import java.util.HashMap;

public class SubArraySumEqualToK {
    public static int arraySum(int[] nums, int k){
        HashMap <Integer, Integer> result = new HashMap<>();
        result.put(0,1);
        int count = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(result.containsKey(sum - k)){
                count += result.get(sum - k);
            }
            result.put(sum, result.getOrDefault(sum,0)+1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(arraySum(nums, k));
    }
}
