// Last updated: 2/2/2026, 2:30:04 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int s=x;
        while(x!=0){
            rev=(rev*10) +x%10;
            x=x/10;
        }
        return s==rev ?true:false;
    }
}