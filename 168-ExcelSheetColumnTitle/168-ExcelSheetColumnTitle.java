// Last updated: 2/2/2026, 2:29:40 PM
class Solution {
    public String convertToTitle(int c) {
        StringBuilder sb = new StringBuilder();

        while(c > 0){
            c--; 
            int rem = c % 26;
            sb.append((char)('A'+ rem ));
            c/= 26;
        }
        return sb.reverse().toString();
    }
}