package Arrays;

public class MissingElement {
    public static int missingNumber(int[] arr){
        int n = arr.length;
        int xor1 = 0; //xor1 for 0 to n 
        int xor2 = 0; //xor2 for array elements

        for(int i = 0; i <= n; i++){
            xor1 = i;
        }
        for(int num : arr){
            xor2 = num;
        }
        return xor1 ^ xor2;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(missingNumber(arr));
    }
}
