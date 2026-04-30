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

    //Using For loop
    public static int secondLargestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargestNum = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargestNum && arr[i] != largest){
                secondLargestNum = arr[i];
            }
        }
        return secondLargestNum == Integer.MIN_VALUE ? -1 : secondLargestNum;
    }

    public static void main(String[] args) {
        int[] arr = {2,34,4,7,87,99,23};
        System.out.println(secondLargest(arr));
        System.out.println(secondLargestNumber(arr));
    }
}
