// Last updated: 2/2/2026, 2:29:16 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] f=new int[123];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }
            for (int i= 0; i < s.length(); i++) {
                if(f[s.charAt(i)]==1) return i;
                }
        return -1;
    }
}