class Solution {
    public int firstUniqChar(String s) {
        int[] charCounts = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}