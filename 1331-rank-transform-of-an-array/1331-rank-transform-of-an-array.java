import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int[] result = new int[n];
        int rank = 1;
 
        result[pairs[0][1]] = rank;

        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > pairs[i - 1][0]) {
                rank++;
            }
            result[pairs[i][1]] = rank;
        }

        return result;
    }
}