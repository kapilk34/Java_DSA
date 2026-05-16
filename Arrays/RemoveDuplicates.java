package Arrays;

import java.util.HashMap;

public class RemoveDuplicates {
    public static int duplicates(int[] nums){
        HashMap <Integer, Integer> map = new HashMap<>();
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(duplicates(nums));
    }
}

