class Solution {
    private int[][] memo;
    private int[] suffixSum;
    private int n;

    public int stoneGameII(int[] piles) {
        n = piles.length;
        memo = new int[n][n + 1];
        suffixSum = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        return dfs(0, 1);
    }

    private int dfs(int i, int m) {
        if (i + 2 * m >= n) {
            return suffixSum[i];
        }

        if (memo[i][m] != 0) {
            return memo[i][m];
        }

        int maxStones = 0;
        for (int x = 1; x <= 2 * m; x++) {
            int opponentScore = dfs(i + x, Math.max(m, x));
            int currentScore = suffixSum[i] - opponentScore;
            maxStones = Math.max(maxStones, currentScore);
        }

        return memo[i][m] = maxStones;
    }
}