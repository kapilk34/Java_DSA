package Arrays;

public class MajorityElements {
    public static int majority(int[] nums){
        int frequency = 0;
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(frequency == 0){
                result = nums[i];
            }
            if(nums[i] == result){
                frequency++;
            }
            else{
                frequency--;
            }
        }
        int count = 0;
        for(int num : nums){
            if(num == result) count++;
        }
        return count > nums.length / 2 ? result : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
