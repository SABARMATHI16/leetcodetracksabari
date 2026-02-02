// Last updated: 2/2/2026, 2:28:38 PM
class Solution {
    public int arraySign(int[] nums) {
        int n=0;
        for(int x:nums){
            if(x==0) return 0;
            if(x<0) n++;
        }
        return n%2==0?1:-1;
    }
}