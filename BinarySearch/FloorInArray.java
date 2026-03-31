package BinarySearch;

public class FloorInArray {
    public static int FloorArray(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > target){
                high = mid - 1; 
            }
            else{ //nums[mid] == target
                index = mid;
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,8,10,10,12,19};
        int target = 11;
        System.out.println("Floor at index: " + FloorArray(nums, target)); 
    }
}
