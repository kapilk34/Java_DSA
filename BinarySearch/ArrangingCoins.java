package BinarySearch;

public class ArrangingCoins {
    public static int sqrt(long n){
        if(n == 0) return 0;
        long low = 0;
        long high = n;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid == n/mid) return (int)mid;
            else if(mid > n/mid) high = mid - 1;
            else low = mid + 1;
        }
        return (int) high;
    }
    
    public static int arrangingCoins(int n){
        long m = (long)n;
        return (sqrt(8*m*1) - 1)/2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangingCoins(n));
    }
}
