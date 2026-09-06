class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        return pro-sum;
        
    }
}