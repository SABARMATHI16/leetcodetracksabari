// Last updated: 2/2/2026, 2:29:11 PM
class Solution {
    public int arrangeCoins(int n) {
       int row=1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
        }
    }
