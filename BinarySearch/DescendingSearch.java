package BinarySearch;

public class DescendingSearch {
    public static void main(String[] args) {
        int[] nums = {100, 87, 82, 56, 50, 42, 37, 22, 12, 10};
        int target = 56;
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target) {
                high = mid - 1;
            }
            else if(nums[mid] > target){
                low = mid + 1;
            }
            else{
                System.out.println("Element found at index: " + mid);
                return;
            }
        }
    }
}
