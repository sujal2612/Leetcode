class Solution {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;
        
        int count = 0;
        for (long factor = 1; factor <= n; factor *= 10) {
            long divider = factor * 10;
            
            long before = n / divider;
            long curr = (n / factor) % 10;
            long after = n % factor;
            
            if (curr == 0) {
                count += before * factor;
            } else if (curr == 1) {
                count += (before * factor) + (after + 1);
            } else {
                count += (before + 1) * factor;
            }
        }
        
        return count;
    }
}