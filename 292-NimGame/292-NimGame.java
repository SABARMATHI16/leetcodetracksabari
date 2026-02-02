// Last updated: 2/2/2026, 2:29:22 PM
class Solution {
    public boolean canWinNim(int n) {
        if(n==2) return true;
        if(n%4==0) return false;
        else return true;

    }
}