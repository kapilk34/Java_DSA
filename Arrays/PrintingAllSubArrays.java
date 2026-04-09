package Arrays;

public class PrintingAllSubArrays {
    public static void subArrays(int[] nums){
        for(int i = 0; i < nums.length; i++){
            StringBuilder sub = new StringBuilder();
            for(int j = i; j < nums.length; j++){
                sub.append(nums[j]).append(" ");
                System.out.println(sub);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,7,9};
        subArrays(nums);
    }
}
