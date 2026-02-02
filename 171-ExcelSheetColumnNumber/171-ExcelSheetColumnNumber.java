// Last updated: 2/2/2026, 2:29:39 PM
class Solution {
    public int titleToNumber(String s) {
        int res=0;
        for(int i =0;i< s.length();i++){
            res= res * 26 + s.charAt(i) -  64;
        }
        return res;
    }
}