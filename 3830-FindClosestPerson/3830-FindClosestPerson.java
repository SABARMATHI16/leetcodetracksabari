// Last updated: 2/2/2026, 2:28:03 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(z-x);
        int b=Math.abs(y-z);
        if(a<b) return 1;
        else if(a>b) return 2;
        return 0;
    }
}