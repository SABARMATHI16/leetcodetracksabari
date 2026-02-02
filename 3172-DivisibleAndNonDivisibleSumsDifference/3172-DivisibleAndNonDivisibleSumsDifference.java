// Last updated: 2/2/2026, 2:28:05 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0, sum1=0;
      for(int i=1;i<=n;i++){
        if(i%m!=0){
         sum+=i;
        } 
        if(i%m==0){
            sum1+=i;
        }
      }
      return sum-sum1;
    }
}