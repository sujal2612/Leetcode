class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums == null || nums.length < 2 || indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        TreeSet<Long> window = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long val = (long) nums[i];

            Long candidate = window.ceiling(val - valueDiff);

            if (candidate != null && candidate <= val + valueDiff) {
                return true;
            }
            window.add(val);
            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}