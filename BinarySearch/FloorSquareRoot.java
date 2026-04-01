package BinarySearch;

public class FloorSquareRoot {
    public static int floorSqrt(int n){
        if(n <= 1) return n;
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(mid == n/mid) return mid;
            else if(mid > n/mid) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
    
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Floor of square root: " + floorSqrt(n));
    }
}