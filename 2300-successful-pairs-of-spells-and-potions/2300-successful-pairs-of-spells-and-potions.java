class Solution {
    private int binarySearch(int spell, int[] potions, long success) {
        int s = 0, e = potions.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((long) potions[mid] * spell >= success) {
                e = mid - 1; 
            } else {
                s = mid + 1; 
            }
        }
        return potions.length - s; 
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); 
        int n = spells.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = binarySearch(spells[i], potions, success);
        }

        return result;
    }
}
