// Last updated: 2/2/2026, 2:29:06 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
    int s=0;
      for(int i=1;i<=num/2; i++){
      if(num%i==0){
          s=s+i;
      }
 }
 return s==num;
}
}