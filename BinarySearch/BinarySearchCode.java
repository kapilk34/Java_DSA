package BinarySearch;

public class BinarySearchCode {
    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 80;
        int result = binarySearch(nums, target);
        System.out.println(result != -1 ? "Found at index: " + result : "Not found");
    }
}
