// Last updated: 2/2/2026, 2:28:06 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if( purchaseAmount%10 <=4) return 100-( purchaseAmount/10) * 10;
        else return 100-((purchaseAmount/10)+1)*10;
    
    }
}