class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        while (i < n) {
            int j = i;
            long totalSum = 0;

            while (j < n && pairs[j][0] == pairs[i][0]) {
                totalSum += pairs[j][1];
                j++;
            }

            int groupSize = j - i;
            long leftSum = 0;

            for (int k = i; k < j; k++) {
                long currentIdx = pairs[k][1];
                long rightSum = totalSum - leftSum - currentIdx;

                int leftCount = k - i;
                int rightCount = j - 1 - k;

                long leftDistance = (currentIdx * leftCount) - leftSum;
                long rightDistance = rightSum - (currentIdx * rightCount);

                result[(int) currentIdx] = leftDistance + rightDistance;

                leftSum += currentIdx;
            }
            i = j;
        }
        return result;
    }
}