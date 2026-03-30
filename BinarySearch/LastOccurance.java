package BinarySearch;

import java.util.ArrayList;

public class LastOccurance {
    public static ArrayList<Integer> find(int[] nums, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                index = mid;
                low = mid + 1;
            }
        }
        ans.add(index);
        return ans;  
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,5,5,6,7,8,9,10};  
        int target = 5;
        System.out.println(find(nums, target));
    }
}
 