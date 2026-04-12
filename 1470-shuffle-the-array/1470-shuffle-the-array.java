class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans= new int[2*n];
        int index=0;
        int i=0;
        while(i<n){
            ans[index++]=nums[i];
            ans[index++]=nums[i+n];
            i++;

        }
        return ans;
    }
}