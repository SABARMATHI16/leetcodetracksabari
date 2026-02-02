// Last updated: 2/2/2026, 2:28:52 PM
class Solution {
    public int tribonacci(int n) {
      if(n==0 || n==1) return n;
      if(n==2) return 1;
        int a = 0, b = 1, c = 1,d = 0;
        for (int i = 1; i <=n-2; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d; 
        }
            return d;
    }
}