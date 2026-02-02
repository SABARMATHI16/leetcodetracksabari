// Last updated: 2/2/2026, 2:28:01 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0,dd=0;
        for(int x: nums){
            if(x<10) sd+=x;
            else dd+=x;
        }
            return sd!=dd;
        }
}