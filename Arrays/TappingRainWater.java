package Arrays;

public class TappingRainWater {
    public static int water(int[] heights){
        int left = 0;
        int right = heights.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterContains = 0;
        while(left < right){
            if(heights[left] < heights[right]){
                if(heights[left] >= leftMax){
                    leftMax = heights[left];
                }
                else{
                    waterContains += leftMax - heights[left];
                }
                left++;
            }
            else{
                if(heights[right] >= rightMax){
                    rightMax = heights[right];
                }
                else{
                    waterContains += rightMax - heights[right];
                }
                right--;
            }
        }
        return waterContains;
    }
    
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(heights));
    }
}
