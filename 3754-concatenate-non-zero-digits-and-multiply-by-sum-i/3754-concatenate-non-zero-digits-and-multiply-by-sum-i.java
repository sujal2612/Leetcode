class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long x=0;
        int rem;
        long temp=1;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            if(rem!=0){
                x=x+rem*temp;
                temp*=10;
            }
            n=n/10;

        }
        return sum*x;
    }
}