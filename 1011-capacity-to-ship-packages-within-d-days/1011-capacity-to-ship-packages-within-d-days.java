class Solution {
    public boolean isValid(int[] weights,int gdays,int capacity){
        int gd=1, currweight=0;
        for(int i=0;i<weights.length;i++){
            if(currweight+weights[i]<=capacity){
                currweight+=weights[i];
            }else{
                gd++;
                if(weights[i]<=capacity)currweight=weights[i];
            }
        }
        return gd<=gdays;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for (int num : weights) {
            sum += num;
        }
        int max = weights[0];

        for (int num : weights) {
            if (num > max) {
                max = num;
            }
        }
        
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
        
    }
}