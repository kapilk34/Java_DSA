package Arrays;

public class LargestInArray {
    public static int largest(int[] nums){
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {10,27,12,44,28,35,39};
        System.out.println(largest(nums));
    }
}
