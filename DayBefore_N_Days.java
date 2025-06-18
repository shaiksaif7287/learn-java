public class DayBeforeNDays {
    
    public int dayBefore(int d, int n) {
        return ((d - n) % 7 + 7) % 7;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int d1 = 4, n1 = 3;
        System.out.println("Output: " + solution.dayBefore(d1, n1));  // Expected: 1

        // Test case 2
        int d2 = 2, n2 = 19;
        System.out.println("Output: " + solution.dayBefore(d2, n2));  // Expected: 4
    }
}
