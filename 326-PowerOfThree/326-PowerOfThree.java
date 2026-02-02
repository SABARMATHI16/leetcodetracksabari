// Last updated: 2/2/2026, 2:29:20 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
}
}