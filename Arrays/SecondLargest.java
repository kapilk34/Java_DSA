package Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            }
            else if(num > second && num != largest){
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {2,34,4,7,87,99,23};
        System.out.println(secondLargest(arr));
    }
}
