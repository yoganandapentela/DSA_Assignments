import java.util.*;
public class Program05 {
    public static int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long curr = mid * (mid + 1) / 2; 
            
            if (curr == n) {
                return (int) mid; 
            } else if (curr < n) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        
        return (int) right; 
    }
    
    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
