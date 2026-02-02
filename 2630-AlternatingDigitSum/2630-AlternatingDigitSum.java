// Last updated: 2/2/2026, 2:28:18 PM
class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int on = 0;
        int en = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            if (i % 2 == 0) 
                en += d;
            else
                on += d;
            
        }
        return en - on;
    }
}