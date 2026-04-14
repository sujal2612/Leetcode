class Solution {
    public int triangleNumber(int[] nums) {
        int cnt=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    cnt += (right-left);
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return cnt;
        
    }
}