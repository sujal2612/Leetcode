class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
         
        
        int i,j,ans=0;
        int len=nums.length;

        for(i=0;i<len;i++){
            int cnt=0;
            for(j=i;j<len;j++){
                if(nums[j]==target){
                    cnt++;
                }
                if(2*cnt>j-i+1){
                    ans++;
                }
            }
        }        
        return ans;
    }
}