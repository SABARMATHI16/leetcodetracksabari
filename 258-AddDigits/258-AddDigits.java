// Last updated: 2/2/2026, 2:29:28 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        else return num%9==0 ? 9 : num%9;
    }
}