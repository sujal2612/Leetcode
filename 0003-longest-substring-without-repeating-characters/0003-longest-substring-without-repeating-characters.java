class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] counts = new int[256]; 
        
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            counts[rightChar]++;
            
            
            while (counts[rightChar] > 1) {
                char leftChar = s.charAt(left);
                counts[leftChar]--;
                left++;
            }
            
           
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}