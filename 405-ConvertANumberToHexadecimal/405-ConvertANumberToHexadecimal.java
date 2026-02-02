// Last updated: 2/2/2026, 2:29:14 PM
class Solution {
    public String toHex(int num) {
        //   char[] m={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if (num == 0)
            return "0";
        char[] map = "0123456789abcdef".toCharArray();
        StringBuffer ans = new StringBuffer();
        while (num != 0) {
            int d = num & 15;
            ans.append(map[d]);
            num >>>= 4;
        }
        return ans.reverse().toString();
    }
}