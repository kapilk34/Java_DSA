package BinarySearch;

public class FirstOccurance {
    public static int occurance(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        System.out.println("First occurrence at index: " + occurance(nums, target));
    }
}
