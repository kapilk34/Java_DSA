package BinarySearch;

public class FindOnce {
    public static int findOnceElement(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            int firstOccurance = mid;
            int secondOccurance = mid;
            if(nums[mid-1] == nums[mid]){
                firstOccurance = mid - 1;
            }
            else secondOccurance = mid + 1;
            int leftCount = firstOccurance - low;
            int rightCount = high - secondOccurance;
            if(leftCount % 2 == 0){
                low = secondOccurance + 1;
            }
            else{
                high = firstOccurance - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        System.out.println(findOnceElement(nums));
    }
}
