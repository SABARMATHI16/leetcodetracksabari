// Last updated: 2/2/2026, 2:29:38 PM
class Solution {
    public int trailingZeroes(int n) {        
        int t=0;
        while(n>0){
            n=n/5;
            t=t+n;
        }
    return t;
    }
}