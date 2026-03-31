package BinarySearch;

public class MountainArray {
    public static int Mountain(int[] nums) {
        int low = 1;
        int high = nums.length - 2;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid-1]){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 15, 14, 10, 5, 1};
        System.out.println("Peak at index: " + Mountain(nums));
    }
}
