class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        
        // 3. Iterative Euclidean Algorithm for GCD
        while (sumEven != 0) {
            int remainder = sumOdd % sumEven;
            sumOdd = sumEven;
            sumEven = remainder;
        }
        
        return sumOdd;
    }
}