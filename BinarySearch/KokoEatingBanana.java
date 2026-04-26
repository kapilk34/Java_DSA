package BinarySearch;

public class KokoEatingBanana {
    public static int minEatingTime(int[] piles, int h){
        int left = 1;
        int right = 0;

        //finding the max piles
        for(int i = 0; i < piles.length; i++){
            right = Math.max(right, piles[i]);
        }

        while(left <= right){
            int mid = (left + right)/2;
            long hours = 0;

            //Important thing of this question that you should have to take the round values of the decimal values
            for(int i = 0; i < piles.length; i++){
                hours += (piles[i] + mid - 1)/mid;
            }
            if(hours <= h){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingTime(piles,h));
    }
}
