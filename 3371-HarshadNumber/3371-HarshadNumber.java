// Last updated: 2/2/2026, 2:28:04 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0,a=x;
        while(x!=0){
           s+=x%10;
           x/=10;
        }
        if(a%s==0) return s;
        else return -1;
    }
}
