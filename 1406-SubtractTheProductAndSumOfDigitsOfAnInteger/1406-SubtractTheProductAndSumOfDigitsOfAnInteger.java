// Last updated: 2/2/2026, 2:28:46 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
       while(n!=0){
        s+=n%10;
        p*=n%10;
        n/=10;
       }
       return p-s;
}
}