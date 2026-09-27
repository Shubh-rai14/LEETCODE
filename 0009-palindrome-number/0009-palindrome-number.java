class Solution {
    public boolean isPalindrome(int x) {
        int s,rev =0;
        int p=x;
        while(x>0){
            s=x%10;
            rev=rev*10+s;
            x=x/10;
        }
        if(rev==p)
        return true;
        else
        return false;
    }
}