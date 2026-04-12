package Arrays;

import java.util.*;

public class NextPermutation {
    public static void nextPermutationArray(int[] nums){
        int n = nums.length;
        int pivot = -1;
        //Step1: Finding the pivot
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //Step2: If pivot exit, find the next greater element and swap it with pivot
        if(pivot != -1){
            for(int i = n-1; i > pivot; i--){
                if(nums[i] > nums[pivot]){
                    swap(nums,i,pivot);
                    break;
                }
            }
        }

        //Reverse the right side part after pivot
        reverse(nums, pivot+1, n-1);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutationArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
