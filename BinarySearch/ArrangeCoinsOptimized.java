package BinarySearch;

public class ArrangeCoinsOptimized {
    public static int arrangingCoinsOpt(int n){
        long low = 0;
        long high = n;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            long coinsRequired = mid*(mid+1)/2;
            if(coinsRequired == n) return (int)mid;
            else if(coinsRequired > n) high = mid - 1;
            else {
                ans = mid;
                low = mid + 1;
            }
        } 
        return (int) (ans);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangingCoinsOpt(n));
    }
}
