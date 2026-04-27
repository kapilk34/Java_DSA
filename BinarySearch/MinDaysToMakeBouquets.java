package BinarySearch;

public class MinDaysToMakeBouquets {
    public static int minDays(int[] bloomDay, int m, int k){
        if((long)m * k > bloomDay.length) return -1;
        int low = 1;
        int high = 0;

        //finding the max bloomday
        for(int i = 0; i < bloomDay.length; i++){
            high = Math.max(high, bloomDay[i]);
        }
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(canMake(bloomDay, m, k, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean canMake(int[] bloomDay, int m, int k, int days){
        int count = 0;
        int bouquets = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= days){
                count++;
                if(count == k){
                    bouquets++;
                    count = 0;
                }
            }
            else{
                count = 0;
            }
        }
        return bouquets >= m;
    }
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 2;
        System.out.println(minDays(bloomDay, m, k));
    }
}

